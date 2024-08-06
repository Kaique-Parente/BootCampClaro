package application;

import java.util.Locale;
import models.Banco;
import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Cliente[] clientes = new Cliente[4];
        Conta[] contas = new Conta[clientes.length];
        Banco banco = new Banco("Axiac");

        clientes[0] = new Cliente("Julio Cocielo");
        clientes[1] = new Cliente("Rafael Silva");
        clientes[2] = new Cliente("Williaw Lemos");
        clientes[3] = new Cliente("Murilo Couto");
        
        for(int i=0; i<clientes.length; i++){
            contas[i] = new Conta(clientes[i]);
            contas[i].depositar(Math.random() * 600);
            banco.addCliente(contas[i]);
        }
        
        banco.imprimirClientes();
        
        //Teste Transferencia
        contas[1].transferir(300, contas[2]);
        contas[1].imprimirExtrato();
        contas[2].imprimirExtrato();
        
        //Teste Conta Poupança e Corrente
        Conta cp = new ContaPoupanca(new Cliente("Laercio"));
        Conta cc = new ContaCorrente(new Cliente("Fabricio"));
        cp.imprimirExtrato();
        cc.imprimirExtrato();
    }

}
