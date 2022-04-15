package io.github.bw.scorpio.common.crypto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("工具类 md5 测试")
class MD5Test {

  @Test
  void digestHex() {
    Assertions.assertEquals("202cb962ac59075b964b07152d234b70", MD5.digestHex("123"));
    Assertions.assertEquals("34de52b90797cc7a2768c97e0f4811d8", MD5.digestHex("yunan.zhang"));
  }
}