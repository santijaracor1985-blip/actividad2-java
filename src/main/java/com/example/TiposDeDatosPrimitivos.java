package com.example;

public class TiposDeDatosPrimitivos {

    
    public static void demostrarEnteros() {
        byte numeroByte = 100;
        short numeroShort = 20000;
        int numeroInt = 500000;
        long numeroLong = 9000000000L;

        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
    }

    public static void demostrarFlotantes() {
        float numeroFloat = 5.75f;
        double numeroDouble = 10.456;

        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        char simbolo = '#';

        System.out.println("char letra: " + letra);
        System.out.println("char simbolo: " + simbolo);
    }


    public static void demostrarBooleanos() {
        boolean activo = true;
        boolean apagado = false;

        System.out.println("activo: " + activo);
        System.out.println("apagado: " + apagado);
    }


    public static void demostrarValoresPorDefecto() {
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0;
        char c = '\u0000';
        boolean bool = false;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}