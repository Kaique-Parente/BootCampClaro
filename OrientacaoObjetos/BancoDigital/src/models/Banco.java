package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addCliente(Conta c){
        contas.add(c);
    }
    
    public List<Conta> getClientes() {
        return contas;
    }
    
    public void imprimirClientes(){
        for(Conta c: contas){
            System.out.printf("%s, Saldo Atual: %.2f\n",c.cliente.getNome(), c.getSaldo());
        }
    }
}
