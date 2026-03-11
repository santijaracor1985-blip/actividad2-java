package com.example;

import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida");
        }
    }

    public static void ejemploTryCatchInput() {
        Scanner sc = new Scanner(System.in);
        try {
            int numero = sc.nextInt();
            System.out.println("Número: " + numero);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            int a = 10 / 2;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Bloque finally ejecutado");
        }
    }

    public static void evitarCierrePrograma() {
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (Exception e) {
            System.out.println("Se produjo un error pero el programa continúa");
        }
        System.out.println("Programa sigue ejecutándose");
    }
}