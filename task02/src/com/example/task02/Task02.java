package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String result;
        long variable = Long.parseLong(input);
        if (variable >= -128 && variable <= 127) result = "byte";

        else if (variable >= -32768 && variable <= 32767) result = "short";

        else if (variable >= -2147483648 && variable <= 2147483647) result = "int";

        else result = "long";
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("0");
        System.out.println(result);

    }

}
