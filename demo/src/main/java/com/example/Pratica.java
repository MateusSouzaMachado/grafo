package com.example;

public class Pratica {
    public static double calcularAumento(double salario) {
        double aumento;
        if (salario < 1500) {
        aumento = salario * 0.15;
        } else if (salario >= 1500 && salario <= 3000) {
        aumento = salario * 0.12;
        } else {
        aumento = salario * 0.07;
        }
        return aumento;
    }

    public static boolean verificarPrimo(int num) {
        if (num <= 1) {
        return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
        return false;
        }
        }
        return true;
    }

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
        int temp = b;
        b = a % b;
            a = temp;
        }
               
        return a;
    }

    public static String classificarAluno(double nota) {
        String classificacao;
        if (nota < 5) {
        classificacao = "Reprovado";
        } else if (nota >= 5 && nota < 7) {
        classificacao = "Recuperação";
        } else {
        classificacao = "Aprovado";
        }
        return classificacao;
    }
            
}
