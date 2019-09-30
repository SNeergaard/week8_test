package com.example.encodingtest;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class testJava {
    static String string = "Steven";

    public static void encode(String string) {
        byte[] ascii = string.getBytes(StandardCharsets.US_ASCII);
        for(int i = 0; i<ascii.length; i++) {
            if (ascii[i] >= 65 && ascii[i] <= 77) {
                int temp = 77 - ascii[i];
                int returnTemp = temp + 78;
                ascii[i] = (byte) returnTemp;
            } else if (ascii[i] >= 77 && ascii[i] <= 90) {
                int temp = ascii[i] - 78;
                int returnTemp = 77 - temp;
                ascii[i] = (byte) returnTemp;
            } else if (ascii[i] >= 97 && ascii[i] <= 109) {
                int temp = 109 - ascii[i];
                int returnTemp = temp + 110;
                ascii[i] = (byte) returnTemp;
            } else if (ascii[i] >= 110 && ascii[i] <= 122) {
                int temp = ascii[i] - 110;
                int returnTemp = 109 - temp;
                ascii[i] = (byte) returnTemp;
            }
        }
        String s = new String(ascii);
        System.out.println(s);
    }

    public static void main(String[] args) {
        encode(string);
        System.out.println();
    }
}
