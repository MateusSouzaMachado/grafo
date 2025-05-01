package com.example;

public class AtividadeStringUtil {

    public static String inverterString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    public static int contarVogais(String str) {
        int count = 0;
        String lowerCaseStr = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = lowerCaseStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    
    public static boolean isPalindromo(String str) {
        String reversed = inverterString(str);
        return str.equalsIgnoreCase(reversed);
    }
}
