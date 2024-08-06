package models;

import utils.IConta;

public class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta ct) {
        this.sacar(valor);
        ct.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Nome Titular: " + cliente.getNome());
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero da Conta: " + numero);
        System.out.printf("Saldo Atual: %.2f\n", saldo);
    }

    
}
