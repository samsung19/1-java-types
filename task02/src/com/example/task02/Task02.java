package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long in = Long.parseLong(input);
        if (in < 0) {
            in *= -1;
            in--;
        }

        if (in <= 127) {
            return "byte";
        }
        if (in <= 32767) {
            return "short";
        }
        if (in <= 2147483647) {
            return "int";
        }
        if (in > 2147483647) {
            return "long";
        }

        System.out.println(in);
        return "";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }
}
