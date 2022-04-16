package io.github.bw.scorpio.common.future;

/**
 * @author 张瑀楠 zyndev@gmail.com
 * @version 0.0.1
 */
public class RC4 {

  private final byte[] s = new byte[256];
  private int x;
  private int y;

  public RC4(char[] key) {
    int i;
    for (i = 0; i < 256; ++i) {
      this.s[i] = (byte) i;
    }

    i = 0;

    for (int j = 0; i < 256; ++i) {
      j = j + (this.s[i] & 255) + ((byte) key[i % key.length] & 255) & 255;
      byte tmp = this.s[i];
      this.s[i] = this.s[j];
      this.s[j] = tmp;
    }

  }

  public int encrypt(byte[] in, int in_offset, byte[] out, int out_offset, int len, int skip) {
    int x = this.x;
    int y = this.y;
    byte[] s = this.s;
    int i;
    byte tmp;
    int t;
    if (skip > 0) {
      for (i = 0; i < skip; ++i) {
        x = x + 1 & 255;
        y = y + (s[x] & 255) & 255;
        tmp = s[x];
        s[x] = s[y];
        s[y] = tmp;
        t = (s[x] & 255) + (s[y] & 255) & 255;
        byte var10000 = s[t];
      }
    }

    for (i = 0; i < len; ++i) {
      x = x + 1 & 255;
      y = y + (s[x] & 255) & 255;
      tmp = s[x];
      s[x] = s[y];
      s[y] = tmp;
      t = (s[x] & 255) + (s[y] & 255) & 255;
      int k = s[t];
      out[out_offset + i] = (byte) (in[in_offset + i] & 255 ^ k);
    }

    this.x = x;
    this.y = y;
    return 0;
  }

  public int decrypt(byte[] in, int in_offset, byte[] out, int out_offset, int len, int skip) {
    return this.encrypt(in, in_offset, out, out_offset, len, skip);
  }

  public byte[] encrypt(byte[] in, int skip) {
    byte[] results = new byte[in.length];
    this.encrypt(in, 0, results, 0, in.length, skip);
    return results;
  }

  public byte[] decrypt(byte[] in, int skip) {
    byte[] results = new byte[in.length];
    this.decrypt(in, 0, results, 0, in.length, skip);
    return results;
  }
}
