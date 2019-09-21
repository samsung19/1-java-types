package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int summ, counter;
        summ = x + y;
        String str = Integer.toString(summ);
        if (summ > 0) counter = str.length();
        else if (summ == 0) counter = 1;
        else counter = str.length() - 1;

        return counter;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(634234, 78623423);
        System.out.println(result);

    }

}
