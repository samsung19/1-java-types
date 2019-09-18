package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long nl = (long)n;
        long ml = (long)m;
        long usableArea = (nl - (nl % k)) * (ml - (ml % k));
        long result = usableArea / (k * k);
        return (int)result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(1000000, 1000000, 50);
        System.out.println(result);

    }

}
