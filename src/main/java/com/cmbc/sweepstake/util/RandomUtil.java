package com.cmbc.sweepstake.util;

import java.util.Random;

public class RandomUtil {
    public static final String STR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static Random random = new Random();
    public static final int EMPLOYEE_ID_LEN = 10;
    public static final int NAME_LEN = 4;
    public static final int PHONE_LEN = 11;

    public static String randEmployeeId() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < EMPLOYEE_ID_LEN; i++) {
            stringBuffer.append(random.nextInt(8));
        }
        return stringBuffer.toString();
    }

    public static String randName() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < NAME_LEN; i++) {
            stringBuffer.append(STR.charAt(random.nextInt(STR.length())));
        }
        return stringBuffer.toString();
    }

    public static String randPhone() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < PHONE_LEN; i++) {
            stringBuffer.append(random.nextInt(9));
        }
        return stringBuffer.toString();
    }
}
