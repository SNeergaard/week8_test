package com.example.encodingtest;

public class part2 {
    static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static String string = "neergaard";

    private static void find(){
        char[] stringToChar = string.toCharArray();
        for(int i = 0; i < alphabet.length; i++){
            int count = 0;
            for(int j = 0; j < stringToChar.length; j++){
                if(stringToChar[j] == alphabet[i])
                    count++;
            }
            System.out.println(alphabet[i] + ": " + count);
        }
    }

    public static void main(String[] args) {
        find();
    }
}
