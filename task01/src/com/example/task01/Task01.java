package com.example.task01;

public class Task01 {

    public static String solution() {
        System.out.println("\"Я думаю, быть программистом - это круто\"");

        return "здесь какая-то неправильная строка";
    }

    public static void main(String[] args) {
        String result = solution();
        System.out.println(result);
    }
}
