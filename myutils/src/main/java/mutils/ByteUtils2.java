//package cn.com.reformer.wfcommunication;
//
///**
// * Created by Administrator on 2017/3/22 0022.
// */
//
//public class ByteUtils2 {
//    /**
//     * 将int数值转换为占四个字节的byte数组，本方法适用于(低位在前，高位在后)的顺序。 和bytesToInt（）配套使用
//     *
//     * @param value 要转换的int值
//     * @return byte数组
//     */
//    public static byte[] int2Bytes2(int value) {
//        byte[] src = new byte[2];
////        src[3] =  (byte) ((value>>24) & 0xFF);
////        src[2] =  (byte) ((value>>16) & 0xFF);
//        src[1] = (byte) ((value >> 8) & 0xFF);
//        src[0] = (byte) (value & 0xFF);
//        return src;
//    }
//
//    /**
//     * 十六进制字符串转换成字符串
//     *
//     * @return String
//     */
//    public static String hexStr2Str(String hexStr) {
//
//        String str = "0123456789ABCDEF";
//        char[] hexs = hexStr.toCharArray();
//        byte[] bytes = new byte[hexStr.length() / 2];
//        int n;
//        for (int i = 0; i < bytes.length; i++) {
//            n = str.indexOf(hexs[2 * i]) * 16;
//            n += str.indexOf(hexs[2 * i + 1]);
//            bytes[i] = (byte) (n & 0xff);
//        }
//        return new String(bytes);
//    }
//
//
//    /**
//     * 将int数值转换为占四个字节的byte数组，本方法适用于(高位在前，低位在后)的顺序。  和bytesToInt2（）配套使用
//     */
//    public static byte[] intToBytes2(int value) {
//        byte[] src = new byte[4];
//        src[0] = (byte) ((value >> 24) & 0xFF);
//        src[1] = (byte) ((value >> 16) & 0xFF);
//        src[2] = (byte) ((value >> 8) & 0xFF);
//        src[3] = (byte) (value & 0xFF);
//        return src;
//    }
//
//    /**
//     * byte数组中取int数值，本方法适用于(低位在前，高位在后)的顺序，和和intToBytes（）配套使用
//     *
//     * @param src    byte数组
//     * @param offset 从数组的第offset位开始
//     * @return int数值
//     */
//    public static int bytesToInt(byte[] src, int offset) {
//        int value;
//        value = (int) ((src[offset] & 0xFF)
//                | ((src[offset + 1] & 0xFF) << 8)
//                | ((src[offset + 2] & 0xFF) << 16)
//                | ((src[offset + 3] & 0xFF) << 24));
//        return value;
//    }
//
//    /**
//     * byte数组中取int数值，本方法适用于(低位在后，高位在前)的顺序。和intToBytes2（）配套使用
//     */
//    public static int bytesToInt2(byte[] src, int offset) {
//        int value;
//        value = (int) (((src[offset] & 0xFF) << 24)
//                | ((src[offset + 1] & 0xFF) << 16)
//                | ((src[offset + 2] & 0xFF) << 8)
//                | (src[offset + 3] & 0xFF));
//        return value;
//    }
//}
