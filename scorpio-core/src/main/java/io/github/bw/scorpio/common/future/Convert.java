package io.github.bw.scorpio.common.future;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @author: yunan.zhang zyndev@gmail.com
 * @date 2017-12-28 19:14:06
 */
public class Convert {

    // to int

    /**
     * 将指定的 8 位 byte 值转换为等效的 int 整数
     *
     * @param param
     * @return
     */
    public static int toInt(Byte param) {
        return param;
    }

    /**
     * 将指定布尔值的值转换为等效的整数, true 1, false 0
     *
     * @return
     */
    public static int toInt(Boolean param) {
        return param ? 1 : 0;
    }

    /**
     * 将指定的 Unicode 字符的值转换为等效的 int 整数
     *
     * @param param
     * @return
     */
    public static int toInt(String param) {
        return Integer.parseInt(param);
    }

    /**
     * 将指定的双精度浮点数的值转换为整数,直接去除小数位
     *
     * @param param
     * @return
     */
    public static int toInt(Double param) {
        return param.intValue();
    }

    /**
     * 将指定的 Decimal 数的值转换为等效的 16 位有符号整数
     * @param param
     * @return public static int toInt(Decimal param){
    return 1;
    }
     */

    /**
     * 将指定的布尔值转换为它的等效 String 表示形式
     *
     * @param param
     * @return
     */
    public static String toString(Boolean param) {
        return param ? "true" : "false";
    }

    /**
     * 将指定的 8 位无符号整数的值转换为它的等效 String 表示形式
     *
     * @param param
     * @return
     */
    public static String toString(Byte param) {
        return param.toString();
    }

    /**
     * 将指定的 Date 的值转换为它的等效 String 表示形式
     *
     * @param param
     * @return
     */
    public static String toString(Date param) {
        return new SimpleDateFormat("yyyy-mm-dd hh:MM:ss").format(param);
    }

    /**
     * 将指定的 Date 的值转换为它的等效 String 表示形式
     *
     * @param param
     * @param pattern
     * @return
     */
    public static String toString(Date param, String pattern) {
        return new SimpleDateFormat(pattern).format(param);
    }

    /**
     * 将指定的双精度浮点数的值转换为它的等效 String 表示形式
     *
     * @param param
     * @return
     */
    public static String toString(Double param) {
        return param.toString();
    }

    /**
     * 将指定的整数的值转换为它的等效 String 表示形式
     *
     * @param param
     * @return
     */
    public static String toString(Integer param) {
        return param.toString();
    }

    /**
     * 将 8 位无符号整数数组转换为它的等效 String 表示形式（使用 Base 64 数字编码）
     *
     * @param param
     * @return
     */
    public static String toBase64String(Byte[] param) {
        return "";
    }

    /**
     * 将 string 转换为它的等效 String 表示形式（使用 Base 64 数字编码）
     *
     * @param param
     * @return
     */
    public static String toBase64String(String param) {
        return "";
    }

    /**
     * 将 Unicode 字符数组的子集（它将二进制数据编码为 base 64 数字）转换成等效的 8 位无符号整数数组。 参数指定输入数组的子集以及要转换的元素数。
     *
     * @return
     */
    public static String fromBase64ByteArray(Byte[] param) {
        return "";
    }

    /**
     * 将指定的 String（它将二进制数据编码为 base 64 数字）转换成编码前 string。
     *
     * @param param
     * @return
     */
    public static String fromBase64String(String param) {
        return "";
    }

    /**
     * 将 string 转换为它的等效 String 表示形式（使用 Base 64 数字编码）
     *
     * @param param
     * @return
     */
    public static String toMD5String(String param) {
        return "";
    }



    /*







    	ChangeType(Object, Type, IFormatProvider)	返回指定类型的对象，其值等效于指定对象。 参数提供区域性特定的格式设置信息。
    	ChangeType(Object, TypeCode, IFormatProvider)	返回指定类型的对象，其值等效于指定对象。 参数提供区域性特定的格式设置信息。
    	GetTypeCode	返回指定对象的 TypeCode。
    	IsDBNull	返回有关指定对象是否为 DBNull 类型的指示。
    	ToBase64CharArray	将 8 位无符号整数数组的子集转换为用 Base 64 数字编码的 Unicode 字符数组的等价子集。 参数将子集指定为输入和输出数组中的偏移量和输入数组中要转换的元素数。
    	ToBase64String(Byte[])	将 8 位无符号整数数组转换为它的等效 String 表示形式（使用 Base 64 数字编码）。
    	ToBase64String(Byte[], Int32, Int32)	将 8 位无符号整数数组的子集转换为其等效的、用 Base 64 数字编码的 String 表示形式。 参数将子集指定为输入数组中的偏移量和数组中要转换的元素数。
    	ToBoolean(Boolean)	返回指定的布尔值；不执行任何实际的转换。
    	ToBoolean(Byte)	将指定的 8 位无符号整数的值转换为等效的布尔值。
    	ToBoolean(Char)	调用此方法始终引发 InvalidCastException。
    	ToBoolean(Decimal)	将指定的 Decimal 数字的值转换为等效布尔值。
    	ToBoolean(Double)	将指定的双精度浮点数的值转换为等效的布尔值。
    	ToBoolean(Int16)	将指定的 16 位有符号整数的值转换为等效的布尔值。
    	ToBoolean(Int32)	将指定的 32 位有符号整数的值转换为等效的布尔值。
    	ToBoolean(Int64)	将指定的 64 位有符号整数的值转换为等效的布尔值。
    	ToBoolean(Object)	将指定的 Object 的值转换为等效的布尔值。
    	ToBoolean(SByte)	将指定的 8 位带符号整数的值转换为等效的布尔值。
    	ToBoolean(Single)	将指定的单精度浮点数字的值转换为等效的布尔值。
    	ToBoolean(String)	将逻辑值的指定 String 表示形式转换为它的等效布尔值。
    	ToBoolean(UInt16)	将指定的 16 位无符号整数的值转换为等效的布尔值。
    	ToBoolean(UInt32)	将指定的 32 位无符号整数的值转换为等效的布尔值。
    	ToBoolean(UInt64)	将指定的 64 位无符号整数的值转换为等效的布尔值。
    	ToBoolean(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为等效的布尔值。
    	ToBoolean(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将逻辑值的指定 String 表示形式转换为它的等效布尔值。
    	ToByte(Boolean)	将指定布尔值的值转换为等效的 8 位无符号整数。
    	ToByte(Byte)	返回指定的 8 位无符号整数；不执行任何实际的转换。
    	ToByte(Char)	将指定 Unicode 字符的值转换为等效的 8 位无符号整数。
    	ToByte(Decimal)	将指定的 Decimal 数的值转换为等效的 8 位无符号整数。
    	ToByte(Double)	将指定的双精度浮点数的值转换为等效的 8 位无符号整数。
    	ToByte(Int16)	将指定的 16 位有符号整数的值转换为等效的 8 位无符号整数。
    	ToByte(Int32)	将指定的 32 位有符号整数的值转换为等效的 8 位无符号整数。
    	ToByte(Int64)	将指定的 64 位有符号整数的值转换为等效的 8 位无符号整数。
    	ToByte(Object)	将指定 Object 的值转换为 8 位无符号整数。
    	ToByte(SByte)	将指定的 8 位带符号整数的值转换为等效的 8 位无符号整数。
    	ToByte(Single)	将指定的单精度浮点数字的值转换为等效的 8 位无符号整数。
    	ToByte(String)	将数字的指定 String 表示形式转换为等效的 8 位无符号整数。
    	ToByte(UInt16)	将指定的 16 位无符号整数的值转换为等效的 8 位无符号整数。
    	ToByte(UInt32)	将指定的 32 位无符号整数的值转换为等效的 8 位无符号整数。
    	ToByte(UInt64)	将指定的 64 位无符号整数的值转换为等效的 8 位无符号整数。
    	ToByte(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为 8 位无符号整数。
    	ToByte(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将数字的指定 String 表示形式转换为等效的 8 位无符号整数。
    	ToByte(String, Int32)	将指定基数的数字的字符串表示形式转换为等效的 8 位无符号整数。
    	ToChar(Byte)	将指定的 8 位无符号整数的值转换为其等效的 Unicode 字符。
    	ToChar(Char)	返回指定的 Unicode 字符值；不执行任何实际的转换。
    	ToChar(Decimal)	调用此方法始终引发 InvalidCastException。
    	ToChar(Double)	调用此方法始终引发 InvalidCastException。
    	ToChar(Int16)	将指定的 16 位有符号整数的值转换为它的等效 Unicode 字符。
    	ToChar(Int32)	将指定的 32 位有符号整数的值转换为它的等效 Unicode 字符。
    	ToChar(Int64)	将指定的 64 位有符号整数的值转换为它的等效 Unicode 字符。
    	ToChar(Object)	将指定 Object 的值转换为 Unicode 字符。
    	ToChar(SByte)	将指定的 8 位带符号整数的值转换为其等效的 Unicode 字符。
    	ToChar(Single)	调用此方法始终引发 InvalidCastException。
    	ToChar(String)	将 String 的第一个字符转换为 Unicode 字符。
    	ToChar(UInt16)	将指定的 16 位无符号整数的值转换为它的等效 Unicode 字符。
    	ToChar(UInt32)	将指定的 32 位无符号整数的值转换为它的等效 Unicode 字符。
    	ToChar(UInt64)	将指定的 64 位无符号整数的值转换为它的等效 Unicode 字符。
    	ToChar(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为它的等效 Unicode 字符。
    	ToChar(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将 String 的第一个字符转换为 Unicode 字符。
    	ToDateTime(Object)	将指定 Object 的值转换为 DateTime。
    	ToDateTime(String)	将日期和时间的指定 String 表示形式转换为等效的 DateTime。
    	ToDateTime(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为 DateTime。
    	ToDateTime(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将数字的指定 String 表示形式转换为等效的 DateTime。
    	ToDecimal(Boolean)	将指定的布尔值转换为等效的 Decimal 数字。
    	ToDecimal(Byte)	将指定的 8 位无符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(Char)	调用此方法始终引发 InvalidCastException。
    	ToDecimal(DateTime)	调用此方法始终引发 InvalidCastException。
    	ToDecimal(Decimal)	返回指定的 Decimal 数字；不执行任何实际的转换。
    	ToDecimal(Double)	将指定的双精度浮点数的值转换为等效的 Decimal 数字。
    	ToDecimal(Int16)	将指定的 16 位有符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(Int32)	将指定的 32 位有符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(Int64)	将指定的 64 位有符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(Object)	将指定 Object 的值转换为 Decimal 数字。
    	ToDecimal(SByte)	将指定的 8 位有符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(Single)	将指定的单精度浮点数字的值转换为等效的 Decimal 数字。
    	ToDecimal(String)	将数字的指定 String 表示形式转换为等效的 Decimal 数字。
    	ToDecimal(UInt16)	将指定的 16 位无符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(UInt32)	将指定的 32 位无符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(UInt64)	将指定的 64 位无符号整数的值转换为等效的 Decimal 数字。
    	ToDecimal(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为 Decimal 数字。
    	ToDecimal(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将数字的指定 String 表示形式转换为等效的 Decimal 数字。
    	ToDouble(Boolean)	将指定的布尔值转换为等效的双精度浮点数。
    	ToDouble(Byte)	将指定的 8 位无符号整数的值转换为等效的双精度浮点数。
    	ToDouble(Char)	调用此方法始终引发 InvalidCastException。
    	ToDouble(Decimal)	将指定 Decimal 数字的值转换为等效的双精度浮点数。
    	ToDouble(Double)	返回指定的双精度浮点数；不执行任何实际的转换。
    	ToDouble(Int16)	将指定的 16 位有符号整数的值转换为等效的双精度浮点数。
    	ToDouble(Int32)	将指定的 32 位有符号整数的值转换为等效的双精度浮点数。
    	ToDouble(Int64)	将指定的 64 位有符号整数的值转换为等效的双精度浮点数。
    	ToDouble(Object)	将指定 Object 的值转换为双精度浮点数。
    	ToDouble(SByte)	将指定的 8 位有符号整数的值转换为等效的双精度浮点数。
    	ToDouble(Single)	将指定的单精度浮点数字的值转换为等效的双精度浮点数。
    	ToDouble(String)	将数字的指定 String 表示形式转换为等效的双精度浮点数。
    	ToDouble(UInt16)	将指定的 16 位无符号整数的值转换为等效的双精度浮点数。
    	ToDouble(UInt32)	将指定的 32 位无符号整数的值转换为等效的双精度浮点数。
    	ToDouble(UInt64)	将指定的 64 位无符号整数的值转换为等效的双精度浮点数。
    	ToDouble(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为双精度浮点数。
    	ToDouble(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将数字的指定 String 表示形式转换为等效的双精度浮点数。

    	ToSByte(Boolean)	将指定布尔值的值转换为等效的 8 位有符号整数。
    	ToSByte(Byte)	将指定的 8 位无符号整数的值转换为等效的 8 位有符号整数。
    	ToSByte(Char)	将指定的 Unicode 字符的值转换为等效的 8 位有符号整数。
    	ToSByte(Decimal)	将指定的 Decimal 数的值转换为等效的 8 位有符号整数。
    	ToSByte(Double)	将指定的双精度浮点数的值转换为等效的 8 位有符号整数。
    	ToSByte(Int16)	将指定的 16 位有符号整数的值转换为等效的 8 位有符号整数。
    	ToSByte(Int32)	将指定的 32 位有符号整数的值转换为等效的 8 位有符号整数。
    	ToSByte(Int64)	将指定的 64 位有符号整数的值转换为等效的 8 位有符号整数。
    	ToSByte(Object)	将指定 Object 的值转换为 8 位有符号整数。
    	ToSByte(SByte)	返回指定的 8 位带符号整数；不执行任何实际的转换。
    	ToSByte(Single)	将指定的单精度浮点数字的值转换为等效的 8 位有符号整数。
    	ToSByte(String)	将数字的指定 String 表示形式转换为等效的 8 位有符号整数。
    	ToSByte(UInt16)	将指定的 16 位无符号整数的值转换为等效的 8 位有符号整数。
    	ToSByte(UInt32)	将指定的 32 位无符号整数的值转换为等效的 8 位有符号整数。
    	ToSByte(UInt64)	将指定的 64 位无符号整数的值转换为等效的 8 位有符号整数。
    	ToSByte(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为 8 位有符号整数。
    	ToSByte(String, IFormatProvider)	使用指定的区域性特定格式设置信息，将数字的指定 String 表示形式转换为等效的 8 位有符号整数。
    	ToSByte(String, Int32)	将指定基数的数字的字符串表示形式转换为等效的 8 位有符号整数。
    	ToSingle(Boolean)	将指定布尔值的值转换为等效的单精度浮点数字。
    	ToSingle(Byte)	将指定的 8 位无符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(Char)	调用此方法始终引发 InvalidCastException。
    	ToSingle(Decimal)	将指定的 Decimal 数字的值转换为等效的单精度浮点数字。
    	ToSingle(Double)	将指定双精度浮点数的值转换为等效的单精度浮点数字。
    	ToSingle(Int16)	将指定的 16 位有符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(Int32)	将指定的 32 位有符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(Int64)	将指定的 64 位有符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(Object)	将指定 Object 的值转换为单精度浮点数字。
    	ToSingle(SByte)	将指定的 8 位有符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(Single)	返回指定的单精度浮点数字；不执行任何实际的转换。
    	ToSingle(String)	将数字的指定 String 表示形式转换为等效的单精度浮点数字。
    	ToSingle(UInt16)	将指定的 16 位无符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(UInt32)	将指定的 32 位无符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(UInt64)	将指定的 64 位无符号整数的值转换为等效的单精度浮点数字。
    	ToSingle(Object, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将指定 Object 的值转换为单精度浮点数字。
    	ToSingle(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将数字的指定 String 表示形式转换为等效的单精度浮点数字。

    	ToUInt16(Boolean)	将指定布尔值的值转换为等效的 16 位无符号整数。
    	ToUInt16(Byte)	将指定的 8 位无符号整数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Char)	将指定 Unicode 字符的值转换为等效的 16 位无符号整数。
    	ToUInt16(Decimal)	将指定的 Decimal 数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Double)	将指定的双精度浮点数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Int16)	将指定的 16 位有符号整数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Int32)	将指定的 32 位有符号整数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Int64)	将指定的 64 位有符号整数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Object)	将指定的 Object 的值转换为 16 位无符号整数。
    	ToUInt16(SByte)	将指定的 8 位带符号整数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Single)	将指定的单精度浮点数字的值转换为等效的 16 位无符号整数。
    	ToUInt16(String)	将数字的指定 String 表示形式转换为等效的 16 位无符号整数。
    	ToUInt16(UInt16)	返回指定的 16 位无符号整数；不执行任何实际的转换。
    	ToUInt16(UInt32)	将指定的 32 位无符号整数的值转换为等效的 16 位无符号整数。
    	ToUInt16(UInt64)	将指定的 64 位无符号整数的值转换为等效的 16 位无符号整数。
    	ToUInt16(Object, IFormatProvider)	使用指定的区域性特定格式信息，将指定 Object 的值转换为 16 位无符号整数。
    	ToUInt16(String, IFormatProvider)	通过使用指定的区域性特定格式设置信息，将数字的指定 String 表示形式转换为等效的 16 位无符号整数。
    	ToUInt16(String, Int32)	将指定基数的数字的字符串表示形式转换为等效的 16 位无符号整数。
    	ToUInt32(Boolean)	将指定布尔值的值转换为等效的 32 位无符号整数。
    	ToUInt32(Byte)	将指定的 8 位无符号整数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Char)	将指定 Unicode 字符的值转换为等效的 32 位无符号整数。
    	ToUInt32(Decimal)	将指定的 Decimal 数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Double)	将指定的双精度浮点数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Int16)	将指定的 16 位有符号整数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Int32)	将指定的 32 位有符号整数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Int64)	将指定的 64 位有符号整数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Object)	将指定的 Object 的值转换为 32 位无符号整数。
    	ToUInt32(SByte)	将指定的 8 位带符号整数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Single)	将指定的单精度浮点数字的值转换为等效的 32 位无符号整数。
    	ToUInt32(String)	将数字的指定 String 表示形式转换为等效的 32 位无符号整数。
    	ToUInt32(UInt16)	将指定的 16 位无符号整数的值转换为等效的 32 位无符号整数。
    	ToUInt32(UInt32)	返回指定的 32 位无符号整数；不执行任何实际的转换。
    	ToUInt32(UInt64)	将指定的 64 位无符号整数的值转换为等效的 32 位无符号整数。
    	ToUInt32(Object, IFormatProvider)	使用指定的区域性特定格式信息，将指定 Object 的值转换为 32 位无符号整数。
    	ToUInt32(String, IFormatProvider)	使用指定的区域性特定格式信息，将数字的指定 String 表示形式转换为等效的 32 位无符号整数。
    	ToUInt32(String, Int32)	将指定基数的数字的字符串表示形式转换为等效的 32 位无符号整数。
    	ToUInt64(Boolean)	将指定布尔值的值转换为等效的 64 位无符号整数。
    	ToUInt64(Byte)	将指定的 8 位无符号整数的值转换为等效的 64 位无符号整数。
    	ToUInt64(Char)	将指定 Unicode 字符的值转换为等效的 64 位无符号整数。
    	ToUInt64(Decimal)	将指定的 Decimal 数的值转换为等效的 64 位无符号整数。
    	ToUInt64(Double)	将指定的双精度浮点数的值转换为等效的 64 位无符号整数。
    	ToUInt64(Int16)	将指定的 16 位有符号整数的值转换为等效的 64 位无符号整数。
    	ToUInt64(Int32)	将指定的 32 位有符号整数的值转换为等效的 64 位无符号整数。
    	ToUInt64(Int64)	将指定的 64 位有符号整数的值转换为等效的 64 位无符号整数。
    	ToUInt64(Object)	将指定的 Object 的值转换为 64 位无符号整数。
    	ToUInt64(SByte)	将指定的 8 位带符号整数的值转换为等效的 64 位无符号整数。
    	ToUInt64(Single)	将指定的单精度浮点数字的值转换为等效的 64 位无符号整数。
    	ToUInt64(String)	将数字的指定 String 表示形式转换为等效的 64 位无符号整数。
    	ToUInt64(UInt16)	将指定的 16 位无符号整数的值转换为等效的 64 位无符号整数。
    	ToUInt64(UInt32)	将指定的 32 位无符号整数的值转换为等效的 64 位无符号整数。
    	ToUInt64(UInt64)	返回指定的 64 位无符号整数；不执行任何实际的转换。
    	ToUInt64(Object, IFormatProvider)	使用指定的区域性特定格式信息，将指定 Object 的值转换为 64 位无符号整数。
    	ToUInt64(String, IFormatProvider)	使用指定的区域性特定格式信息，将数字的指定 String 表示形式转换为等效的 64 位无符号整数。
    	ToUInt64(String, Int32)	将指定基数的数字的字符串表示形式转换为等效的 64 位无符号整数。


    */


}
