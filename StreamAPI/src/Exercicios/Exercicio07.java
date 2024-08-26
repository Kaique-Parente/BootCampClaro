package Exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercicio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        int maiorV = numeros.stream()
                .max(Comparator.naturalOrder())
                .get();
        
        int segundoMaior = numeros.stream()
                .filter(n -> n < maiorV)
                .max(Comparator.naturalOrder())
                .get();
        
        System.out.println("Esse é o segundo maior valor: " + segundoMaior);
    }
}
