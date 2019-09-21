package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int b = 10;
        int i = 1;
        while (((x + y) / b) > 0) {
            b *= 10;
            i++;
        }

        return i;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
