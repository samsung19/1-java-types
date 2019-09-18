package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        // сложна!1!
        // TODO исправьте функцию, чтобы избежать накопления ошибки
        float ending;
        int counter = 0;
        int multiplier = 1;

        /*
        В цикле while мы увеличиваем сумму до
        тех пор, пока результатом умнажения на процент
        не станет число > 0

        В общем это нужно, чтобы число бит в двоичном представлении
        числа sum + sum * percent не превышало число бит в мантиссе,
        иначе просто обрежутся последние биты для восстановления длины,
        если я не ошибаюсь, то длина мантиссы 24 или 23+1 бит.
         */
        while (sum * percent < 1 && percent != 0){
            ++counter;
            multiplier *= 10;
            sum *= 10;
        }
        /*
         Если нужно, то объясню, чем руководствовался
         при написании кода ниже.
         */
        if (counter != 0){
            ending = sum * percent;
            if (sum / ending < 99900){ // Придел погрешности
                sum /= multiplier;
                for (int i = 1; i <= 12; i++) {
                    sum += sum * percent;
                }
                return sum;
            }
            ending = sum * percent * 12;
            return (sum + ending) / multiplier;
        }else{
            // Считаем проценты за год, если цикл while не понадобился.
            for (int i = 1; i <= 12; i++) {
                sum += sum * percent;
            }
            return sum;
        }

    }

    public static void main(String[] args) {

        float sum = 150; // 500 руб. на счете
        float percent = 0.001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);
    }
}
