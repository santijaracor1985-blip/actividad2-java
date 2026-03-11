package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        int[][] matriz = {{1,2},{3,4}};
        System.out.println(matriz[0][0]);
    }

    public static void recorrerMatriz() {
        int[][] matriz = {{1,2},{3,4}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    public static void ejemploUsosTipicos() {
        int[][] notas = {
            {80,90,85},
            {70,75,78}
        };

        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            System.out.println(suma);
        }
    }
}