package com.example;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida");
        }
    }
}
