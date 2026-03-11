package com.example;

public class Operadores {

  
    public static void demostrarAritmeticos() {
        int a = 10;
        int b = 3;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }


    public static void demostrarIncrementoDecremento() {
        int x = 5;

        System.out.println("Valor inicial: " + x);
        x++;
        System.out.println("Después de incremento: " + x);
        x--;
        System.out.println("Después de decremento: " + x);
    }


    public static void demostrarRelacionales() {
        int a = 8;
        int b = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }

    
    public static void demostrarLogicos() {
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }


    public static void demostrarAsignacionCompuesta() {
        int numero = 10;

        numero += 5;
        System.out.println("+= : " + numero);

        numero -= 3;
        System.out.println("-= : " + numero);

        numero *= 2;
        System.out.println("*= : " + numero);

        numero /= 4;
        System.out.println("/= : " + numero);
    }


    public static void demostrarOperadorTernario() {
        int edad = 18;

        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println(resultado);
    }
}