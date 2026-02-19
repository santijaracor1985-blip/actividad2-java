package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerEntradaConScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}
