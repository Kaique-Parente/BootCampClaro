package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio08 {
    public static void main(String[] args) {
        int unidades=0, dezenas=0, total=0;
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        unidades = numeros.stream()
                .filter(n -> n<10)
                .reduce(0, Integer::sum);
        
        dezenas = numeros.stream()
                .filter(n -> n>=10)
                .map(n -> n%10 + n/10)
                .reduce(0, Integer::sum);
        
        total = unidades + dezenas;
        System.out.println(total);
    }
}
