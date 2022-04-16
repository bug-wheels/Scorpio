package io.github.bw.scorpio.common.future;

/**
 * 打码常用类
 *
 * @author panpanxu
 */
public class MarkUtil {

    /**
     * 对字符串打码
     *
     * @param str               - 原字符串
     * @param plainTextNumPre   - 前面明文位数
     * @param plainTextNumAfter - 后面明文位数
     * @return - 打码后的数据
     */
    public static String markString(String str, int plainTextNumPre, int plainTextNumAfter) {
        if (str.length() <= (plainTextNumPre + plainTextNumAfter)) {
            return str;
        }
        char[] charArr = str.toCharArray();
        for (int i = plainTextNumPre; i < (str.length() - plainTextNumAfter); i++) {
            charArr[i] = '*';
        }
        return new String(charArr);
    }

    /**
     * 手机号打码
     *
     * @param mobile - 手机号
     * @return
     */
    public static String markMobile(String mobile) {
        return MarkUtil.markString(mobile, 3, 4);
    }

    /**
     * 银行卡号打码
     *
     * @param bankCard - 银行卡号
     * @return
     */
    public static String markBankCard(String bankCard) {
        return MarkUtil.markString(bankCard, 0, 4);
    }

    /**
     * 身份证号打码
     *
     * @param idNumber
     * @return
     */
    public static String markIdNumber(String idNumber) {
        return MarkUtil.markString(idNumber, 3, 4);
    }
}
