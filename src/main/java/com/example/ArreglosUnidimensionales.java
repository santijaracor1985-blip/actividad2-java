package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        int[] a = new int[3];
        int[] b = {1, 2, 3};
        int[] c = new int[]{4, 5, 6};
        System.out.println(a.length);
        System.out.println(b[0]);
        System.out.println(c[0]);
    }

    public static void mostrarLongitud() {
        int[] numeros = {1, 2, 3, 4};
        System.out.println(numeros.length);
    }

    public static void recorrerConForClasico() {
        int[] numeros = {1, 2, 3};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void recorrerConForEach() {
        int[] numeros = {1, 2, 3};
        for (int n : numeros) {
            System.out.println(n);
        }
    }

    public static void arrayComoParametroYRetorno() {
        int[] datos = {1, 2, 3};
        int suma = sumar(datos);
        System.out.println(suma);
    }

    public static int sumar(int[] arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        return total;
    }
}