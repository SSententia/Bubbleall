import brut.androlib.smali.SmaliDecoder;
import com.android.tools.smali.dexlib2.dexbacked.DexBackedDexFile;
import java.io.File;
import java.util.TreeMap;

/**
 * Turns a dex produced by d8 back into smali, using the baksmali build that apktool 3.0.2 already
 * bundles (its CLI Main class is not shipped, so we drive SmaliDecoder directly).
 *
 * Usage: java DecodeDex <zip-containing-classes.dex> <output-dir>
 */
public final class DecodeDex {

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("usage: DecodeDex <classes.dex> <output-dir>");
            System.exit(2);
        }
        File zip = new File(args[0]);
        File out = new File(args[1]);
        if (!out.exists() && !out.mkdirs()) {
            System.err.println("cannot create " + out);
            System.exit(1);
        }
        // mDexFiles is where SmaliDecoder *records* what it decoded, not what is in the zip;
        // the inputs live in the container's entries.
        SmaliDecoder decoder = new SmaliDecoder(zip, false);
        TreeMap<?, ?> entries = decoder.mDexContainer.getEntries();
        int count = 0;
        for (Object key : entries.keySet()) {
            Object value = entries.get(key);
            if (value instanceof DexBackedDexFile) {
                decoder.decodeFile((DexBackedDexFile) value, out);
                count++;
            }
        }
        System.out.println("decoded " + count + " dex file(s) into " + out.getPath());
        if (count == 0) {
            System.err.println("no dex entries found in " + zip.getPath());
            System.exit(1);
        }
    }
}
