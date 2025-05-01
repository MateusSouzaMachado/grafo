package com.example;

public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }
    public static String classificaoAluno(Double nota) {
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
    public static double calcularTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularQuadrado(double lado) {
        return lado * lado;
    }
}


