package Program;

import Exceptions.ParametrosInvalidosException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro par�metro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo par�metro");
        int parametroDois = sc.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println("O segundo par�metro deve ser maior que o primeiro!");
        }
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if(p1 > p2) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = p2 - p1;
            for(int i=1; i <= contagem; i++){
                if(i == 1)
                    System.out.print("Imprimindo o n�mero " + i);
                else if(i == contagem)
                    System.out.print(", Imprimindo o n�mero " + i + "\n");
                else
                    System.out.print(", Imprimindo o n�mero " + i);
            }
        }
    }
}
