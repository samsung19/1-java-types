package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number =  Long.parseLong(input);

        if (number < 0){
            number *= -1;
        }

        if (number <= 27){
            return "byte";
        }
        else if (number <= 32767){
            return "short";
        }
        else if (number <= 2147483647){
            return "int";
        }
        else {
            return "long";
        }
        return "";
    }

    public static void main(String[] args) {
        String result = solution("2147483648");
        System.out.println(result);
    }

}
