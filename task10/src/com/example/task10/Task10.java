package com.example.task10;
import java.math.BigDecimal;
import java.util.Objects;

public class Task10 {
    public static boolean compare(float a, float b, int precision) {
        BigDecimal newA = new BigDecimal(a).setScale(precision, BigDecimal.ROUND_UP);
        BigDecimal newB = new BigDecimal(b).setScale(precision, BigDecimal.ROUND_UP);
        return Objects.equals(newA, newB);
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;
        boolean result = compare(sum, c, 2);
        System.out.println(result);
    }
}
