package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicito() {
        int a = 10;
        double b = a;
        System.out.println(b);
    }

    public static void demostrarCastingExplicito() {
        double x = 9.8;
        int y = (int) x;
        System.out.println(y);
    }

    public static void demostrarProblemasDePrecision() {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
    }
}