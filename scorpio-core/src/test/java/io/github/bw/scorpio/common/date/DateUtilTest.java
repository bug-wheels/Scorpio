package io.github.bw.scorpio.common.date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateUtilTest {

  @Test
  void getNowToNightDiffMinutes() {
    long minutes = DateUtil.getNowToNightDiffMinutes();
    Assertions.assertTrue(minutes > 0);
  }

  @Test
  void getNowToNightDiffSeconds() {
    long seconds = DateUtil.getNowToNightDiffSeconds();
    Assertions.assertTrue(seconds > 0);
  }
}