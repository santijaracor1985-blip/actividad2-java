package com.example;

public class ManipulacionCadenas {

    public static void demostrarMetodosUtiles() {
        String texto = "Hola Mundo";
        System.out.println(texto.length());
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.substring(0, 4));
        System.out.println(texto.contains("Mundo"));
    }

    public static void demostrarConcatenacion() {
        String a = "Hola";
        String b = "Mundo";
        String resultado = a + " " + b;
        System.out.println(resultado);
    }

    public static void demostrarInmutabilidad() {
        String texto = "Hola";
        texto.concat(" Mundo");
        System.out.println(texto);
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder("Hola");
        sb.append(" Mundo");
        System.out.println(sb.toString());
    }
}
