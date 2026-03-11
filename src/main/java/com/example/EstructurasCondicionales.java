package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
    }

    public static void ejemploIfElse() {
        int edad = 16;

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }

    public static void ejemploIfElseIfElse() {
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bueno");
        } else {
            System.out.println("Debe mejorar");
        }
    }

    public static void ejemploSwitch() {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }
    }

    public static void ejemploSwitchExpression() {
        int dia = 2;

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Otro día";
        };

        System.out.println(nombreDia);
    }
}