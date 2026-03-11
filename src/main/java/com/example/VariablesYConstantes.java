package com.example;

public class VariablesYConstantes {

    
    public static void demostrarDeclaracionAsignacion() {
        int edad = 20;
        double altura = 1.75;
        char letra = 'A';
        boolean activo = true;
        String nombre = "Juan";

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Letra: " + letra);
        System.out.println("Activo: " + activo);
        System.out.println("Nombre: " + nombre);
    }

    
    public static void demostrarConvencionesNombres() {
        int numeroDeEstudiantes = 30;
        String nombreCompleto = "Carlos Perez";

        System.out.println("Numero de estudiantes: " + numeroDeEstudiantes);
        System.out.println("Nombre completo: " + nombreCompleto);
    }

    
    public static void demostrarConstantes() {
        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;

        System.out.println("Valor de PI: " + PI);
        System.out.println("Dias de la semana: " + DIAS_SEMANA);
    }
}