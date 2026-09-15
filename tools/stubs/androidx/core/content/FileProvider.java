package androidx.core.content;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/**
 * Compile-time stub for the app's real (dexed) {@code androidx.core.content.FileProvider}.
 *
 * <p>The generated helpers are compiled by {@code scripts/gen-helper.sh} against android.jar only,
 * and android.jar has no androidx on it. Giving javac this signature lets ImageCrop call the real
 * provider at runtime; the stub is compiled to a separate output directory that is never dexed,
 * so no stub class ever reaches the APK.
 */
public class FileProvider {

    public static Uri getUriForFile(Context context, String authority, File file) {
        throw new UnsupportedOperationException("compile-time stub");
    }
}
