package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру
        char bigA = '\u0041';
        char bigB = '\u0042';
        char bigC = '\u0043';
        char bigD = '\u0044';
        char bigE = '\u0045';
        char bigF = '\u0046';
        char bigG = '\u0047';
        char bigH = '\u0048';
        char bigI = '\u0049';
        char bigJ = '\u004A';
        char bigK = '\u004B';
        char bigL = '\u004C';
        char bigM = '\u004D';
        char bigN = '\u004E';
        char bigO = '\u004F';
        char bigP = '\u0050';
        char bigQ = '\u0051';
        char bigR = '\u0052';
        char bigS = '\u0053';
        char bigT = '\u0054';
        char bigU = '\u0055';
        char bigV = '\u0056';
        char bigW = '\u0057';
        char bigX = '\u0058';
        char bigY = '\u0059';
        char bigZ = '\u005A';

        if (c == 'a') c = bigA;
        else if (c == 'b') c = bigB;
        else if (c == 'c') c = bigC;
        else if (c == 'd') c = bigD;
        else if (c == 'e') c = bigE;
        else if (c == 'f') c = bigF;
        else if (c == 'g') c = bigG;
        else if (c == 'h') c = bigH;
        else if (c == 'i') c = bigI;
        else if (c == 'j') c = bigJ;
        else if (c == 'k') c = bigK;
        else if (c == 'l') c = bigL;
        else if (c == 'm') c = bigM;
        else if (c == 'n') c = bigN;
        else if (c == 'o') c = bigO;
        else if (c == 'p') c = bigP;
        else if (c == 'q') c = bigQ;
        else if (c == 'r') c = bigR;
        else if (c == 's') c = bigS;
        else if (c == 't') c = bigT;
        else if (c == 'u') c = bigU;
        else if (c == 'v') c = bigV;
        else if (c == 'w') c = bigW;
        else if (c == 'x') c = bigX;
        else if (c == 'z') c = bigZ;
        else if (c == 'y') c = bigY;

        return c;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        char result = toUpperCase('x');
        System.out.println(result);

    }

}
