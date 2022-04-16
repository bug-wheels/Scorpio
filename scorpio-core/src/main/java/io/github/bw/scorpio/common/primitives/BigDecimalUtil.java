package io.github.bw.scorpio.common.primitives;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

/**
 * BigDecimalUtil
 *
 * @author zhangyunan
 */
public class BigDecimalUtil {

  private BigDecimalUtil() {
  }

  public static String toPlainString(BigDecimal param) {
    return toPlainString(param, 2, RoundingMode.HALF_UP);
  }

  public static String toPlainString(BigDecimal param, int newScale) {
    return toPlainString(param, newScale, RoundingMode.HALF_UP);
  }

  public static String toPlainString(BigDecimal param, int newScale, RoundingMode mode) {
    return param.setScale(newScale, mode).toPlainString();
  }

  public static int compare(BigDecimal paramA, BigDecimal paramB) {
    return paramA.setScale(2, RoundingMode.HALF_UP).compareTo(paramB.setScale(2, RoundingMode.HALF_UP));
  }

  public static BigDecimal of(String param) {
    return new BigDecimal(param);
  }

  public static BigDecimal ofNullOrZero(String param) {
    if (StringUtil.isNullOrEmpty(param)) {
      return BigDecimal.ZERO;
    }
    return BigDecimalUtil.of(param);
  }

  public static BigDecimal add(BigDecimal... params) {
    BigDecimal result = BigDecimal.ZERO;
    for (BigDecimal param : params) {
      result = result.add(Optional.ofNullable(param).orElse(BigDecimal.ZERO));
    }
    return result;
  }

}
