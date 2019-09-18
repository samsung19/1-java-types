package com.example.task02;


public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long num =  Long.parseLong(input);
        if (num < 0){
            num *= -1;
            --num;
        }
        --num;

        if (num / 2147483647 >= 1){
            return "long";
        }else if (num / 32767 >= 1){
            return  "int";
        }else if (num / 127 >= 1){
            return  "short";
        }

        return "byte";
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
