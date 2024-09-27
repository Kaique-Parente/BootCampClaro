/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaiqueps.pratica01.models.entities;

/**
 *
 * @author kaiqu
 */
public class TransferenciaEntreContas {
    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
