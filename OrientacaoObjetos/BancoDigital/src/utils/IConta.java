package utils;

public interface IConta {
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta ct);
    void imprimirExtrato();
    
}
