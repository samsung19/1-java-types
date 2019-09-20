package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        int multiplier = 1;
        if (a + 1 != a + 1 && b + 1 != b + 1){
            return true;
        }else if (a == a + 1 && b == b + 1){
            return  a == b;
        }else if (a + 1 != a + 1 && b != b + 1 ||
                  b + 1 != b + 1 && a != a + 1){
            return false;
        }
        for (int i = 0; i < precision; ++i){
            multiplier *= 10;
        }
        return (int)(a * multiplier) == (int)(b * multiplier);

    }

    public static void main(String[] args) {

        float a = 0f;
        float b = 0.0f / 0.0f;

        boolean result = compare(a, b, 10);
        System.out.println(result);


    }

}
