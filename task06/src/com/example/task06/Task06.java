package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int summ = x + y;
        if (summ == 0) return 1;
        int p = 0;
        while (Math.abs(summ) > 0) {
            ++p;
            summ /= 10;
        }
        return p;
    }

    public static void main(String[] args) {
        int result = solution(-111, -222);
        System.out.println(result);
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
