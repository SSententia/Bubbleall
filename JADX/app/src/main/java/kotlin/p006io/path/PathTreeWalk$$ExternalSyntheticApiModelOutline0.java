package kotlin.p006io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PathTreeWalk$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m533m() {
        return BasicFileAttributes.class;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ DirectoryStream m541m(Object obj) {
        return (DirectoryStream) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ FileSystemException m546m(Object obj) {
        return (FileSystemException) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ FileSystemException m547m(String str) {
        return new FileSystemException(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ FileSystemException m548m(String str, String str2, String str3) {
        return new FileSystemException(str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ FileSystemLoopException m549m(String str) {
        return new FileSystemLoopException(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ FileVisitResult m552m(Object obj) {
        return (FileVisitResult) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ FileVisitor m553m(Object obj) {
        return (FileVisitor) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ NoSuchFileException m555m(String str, String str2, String str3) {
        return new NoSuchFileException(str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Path m556m(Object obj) {
        return (Path) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ SecureDirectoryStream m574m(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ BasicFileAttributeView m578m(Object obj) {
        return (BasicFileAttributeView) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ BasicFileAttributes m579m(Object obj) {
        return (BasicFileAttributes) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m587m() {
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m596m(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return BasicFileAttributeView.class;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m1961m$1() {
    }

    /* JADX INFO: renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m1964m$2() {
    }

    public static /* synthetic */ void m$3() {
    }
}
