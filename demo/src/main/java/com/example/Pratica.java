package com.example;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public boolean calculaMediaFinal(double notaA, double notaB, double exame) {
        double media = (notaA + notaB) / 2;
        boolean aprovado = false;

        if (media >= 6) {
            aprovado = true;
        } else {
            double mediaExame = (media * 1.7) + (exame * 1.3);
            if (mediaExame >= 14) {
                aprovado = true;
            } else {
                aprovado = false;
            }
        }

        return aprovado;
    }

    public static int calcularSoma(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double calcularDesconto(double valorCompra) {
        double desconto;
        if (valorCompra < 50) {
            desconto = 0;
        } else if (valorCompra >= 50 && valorCompra < 100) {
            desconto = valorCompra * 0.05;
        } else {
            desconto = valorCompra * 0.1;
        }
        return desconto;
    }

    public static double calcularDesconto2(int valorCompra) {
        double desconto;

        switch (valorCompra / 10) {
            case 0:
                desconto = 0;
                break;
            case 1:
                desconto = 1;
                break;
            case 2:
                desconto = 2;
                break;
            case 3:
                desconto = 4;
                break;
            case 4:
                desconto = 5;
                break;
            case 5:
                desconto = 6;
                break;
            case 6:
                desconto = 8;
                break;
            case 7:
                desconto = 9;
                break;
            case 8:
                desconto = 9;
                break;
            case 9:
                desconto = valorCompra * 0.05;
                break;
            default:
                desconto = valorCompra * 0.1;
                break;
        }
        return desconto;
    }

    public static boolean isCPFValido(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() != 11)
            return false;
        if (cpf.matches("(\\d)\\1{10}"))
            return false;
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (10 -
                    i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9)
            digito1 = 0;
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 -
                    i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9)
            digito2 = 0;
        return Integer.parseInt(cpf.substring(9, 10)) == digito1 &&
                Integer.parseInt(cpf.substring(10, 11)) == digito2;
    }

     public static LocalDateTime validarData(String dataString) {
        try {
            // Definindo o formato da data
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            
            // Convertendo a string para LocalDateTime
            LocalDateTime data = LocalDateTime.parse(dataString, formatter);
            
            return data;
        } catch (DateTimeException e) {
            // Se ocorrer uma exceção ao fazer o parsing da data
            // significa que a data não está em um formato válido
            System.out.println("Erro ao validar data: " + e.getMessage());
            return null;
        }
    }
}
