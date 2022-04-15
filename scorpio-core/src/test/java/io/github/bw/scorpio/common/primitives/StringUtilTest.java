package io.github.bw.scorpio.common.primitives;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilTest {

  @Test
  void firstNonBlank() {
    // 调用方法得到第一个非空的字符串，这里应该 a
    String actual = StringUtil.firstNonBlank("", null, "a", "c");
    Assertions.assertEquals("a", actual);

    actual = StringUtil.firstNonBlank("b", null);
    Assertions.assertEquals("b", actual);

    actual = StringUtil.firstNonBlank(null, "b");
    Assertions.assertEquals("b", actual);

    actual = StringUtil.firstNonBlank("", "b");
    Assertions.assertEquals("b", actual);

    actual = StringUtil.firstNonBlank("", " ");
    Assertions.assertNull(actual);

    actual = StringUtil.firstNonBlank("b", "c");
    Assertions.assertEquals("b", actual);

    actual = StringUtil.firstNonBlank("c", null, "a", "c");
    Assertions.assertEquals("c", actual);
  }

  @DisplayName("测试字符串是不是有文本，空白字符串不认为有文本")
  @Test
  void hasText() {
    // 这里应该是 false, 因为 null 没有内容
    Assertions.assertFalse(StringUtil.isNotBlank(null));

    // 这里应该是 false, 因为 空字符串 没有内容
    Assertions.assertFalse(StringUtil.isNotBlank(""));

    // 这里应该是 false, 因为 空白字符串 没有内容
    Assertions.assertFalse(StringUtil.isNotBlank(" "));

    // 这里应该是 true, 因为 a 没有内容
    Assertions.assertTrue(StringUtil.isNotBlank(" a "));
  }

  @DisplayName("测试公共前缀")
  @Test
  void commonPrefix() {
    // 无公共前缀
    Assertions.assertEquals("", StringUtil.commonPrefix(" a ", "b"));
    Assertions.assertEquals(" ", StringUtil.commonPrefix(" a ", " b"));
    Assertions.assertEquals("abab", StringUtil.commonPrefix("ababa", "ababc"));
    Assertions.assertNotEquals("aba", StringUtil.commonPrefix("ababa", "ababc"));
  }
}