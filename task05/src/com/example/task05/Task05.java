package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String message = "FALSE";
        if ((x%10)%2==0 && (x/10%10) % 2==0 && (x / 100 % 10) % 2 ==0 && (x / 1000 % 10) % 2 ==0) message = "TRUE";

        return message;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1);
        System.out.println(result);
    }

}
