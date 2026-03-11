package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploForClasico() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    public static void ejemploWhile() {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
    }

    public static void ejemploDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            if (i == 4) break;
            System.out.println(i);
        }
    }

    public static void ejemploEtiquetas() {
        externo:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) break externo;
                System.out.println(i + " " + j);
            }
        }
    }
}