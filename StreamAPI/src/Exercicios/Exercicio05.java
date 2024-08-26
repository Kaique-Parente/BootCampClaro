package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = numeros.stream()
                .filter(n -> n>5)
                .mapToDouble(n -> n * 1.0)
                .average()
                .getAsDouble();
                
        System.out.printf("Essa é a média dos números: %.2f\n", media);
    }
}
