/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaiqueps.pratica01.models.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import lombok.AllArgsConstructor;

/**
 *
 * @author kaiqu
 */
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }
    
    public boolean maiorDeIdade() {
        return getIdade() >= 18;
    }
}
