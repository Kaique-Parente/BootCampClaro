package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o n�mero da Conta!");
        numeroConta = sc.nextInt();
        
        System.out.println("Por favor, digite o n�mero da Ag�ncia !");
        agencia = sc.next();
        
        sc.nextLine();
        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o seu saldo!");
        saldo = sc.nextDouble();
        
        System.out.printf("Ol� %s, obrigado por criar uma conta em nosso banco, sua ag�ncia � %s, conta %d e seu saldo %.2f j� est� dispon�vel para saque%n", 
                nomeCliente, agencia, numeroConta, saldo);
    }
}
