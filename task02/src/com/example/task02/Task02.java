package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long input_copy = Long.parseLong(input);
        if (input_copy >= -128 & input_copy <= 127)
            return "byte";
        else if(input_copy >= -32768 & input_copy <= 32767)
            return "short";
        else if(input_copy >= -2147483648 & input_copy <= 2147483647)
            return "int";
        else return "long";

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
