package com.yfgz.es.utils;

import org.joda.time.DateTime;

/**
 * Created by zhanzhenchao on 16/4/6.
 */
public class Random {

    private static final int NUMBER = 1;
    private static final int CHART = 2;
    private static final int ALPHABET = 3;

    private static final String number = "0123456789";
    private static final String chart = "abcdefghijklmnopqrstuvwxzy";
    private static final String alphabet = "0123456789abcdefghijklmnopqrstuvwxzy";

    public static String randomNum(int count) {
        return randomUtil(count, NUMBER);
    }

    public static String randomChart(int count) {
        return randomUtil(count, CHART);
    }

    public static String random(int count) {
        return randomUtil(count, ALPHABET);
    }

    protected static String randomUtil(int count, int type) {
        int length = 0;
        StringBuilder randomString = new StringBuilder();
        java.util.Random random = new java.util.Random();
        switch (type) {
            case 1:
                length = number.length();
                for (int i = 0; i < count; i++) {
                    randomString.append(number.charAt(random.nextInt(length)));
                }
                break;
            case 2:
                length = chart.length();
                for (int i = 0; i < count; i++) {
                    randomString.append(chart.charAt(random.nextInt(length)));
                }
                break;
            case 3:
                length = alphabet.length();
                for (int i = 0; i < count; i++) {
                    randomString.append(alphabet.charAt(random.nextInt(length)));
                }
                break;
            default: return null;
        }
        return randomString.toString();
    }

    public static String generateUuid(String id) {
        int length = id.length();
        if (length < 4) {
            int dateTime = new DateTime().getMillisOfDay();
            int len = 4 - length;
            return id + randomNum(len) + dateTime;
        } else {
            return randomNum(12);
        }
    }
}
