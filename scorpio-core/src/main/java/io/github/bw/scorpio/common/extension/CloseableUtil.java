package io.github.bw.scorpio.common.extension;

public final class CloseableUtil {

  private CloseableUtil() {
  }

  public static void safeClose(AutoCloseable autoCloseable) {
    if (autoCloseable == null) {
      return;
    }
    try {
      autoCloseable.close();
    } catch (Exception e) {
      // NO OP
    }
  }
}
