package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int entero = sc.nextInt();

        System.out.println("Ingrese un número decimal:");
        double decimal = sc.nextDouble();

        System.out.println("Ingrese una palabra:");
        String palabra = sc.next();

        sc.nextLine();

        System.out.println("Ingrese una línea completa:");
        String linea = sc.nextLine();

        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(palabra);
        System.out.println(linea);

        sc.close();
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese un texto:");
        String texto = sc.nextLine();

        System.out.println(numero);
        System.out.println(texto);

        sc.close();
    }
}
