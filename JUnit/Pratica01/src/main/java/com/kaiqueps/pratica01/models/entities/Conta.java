/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaiqueps.pratica01.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author kaiqu
 */
@Data
@AllArgsConstructor
public class Conta {
    private String numeroConta;
    private int saldo;
    
    public void lancaCredito(int valor) {
        this.saldo += valor;
    }

    public void lancaDebito(int valor) {
        this.saldo -= valor;
    }
}
