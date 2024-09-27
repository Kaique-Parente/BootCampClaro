/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kaiqueps.pratica01;

import com.kaiqueps.pratica01.models.entities.Pessoa;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author kaiqu
 */
public class ProgramTest {
    
    @Test
    void calcularIdade(){
        Pessoa p = new Pessoa("Lucas", LocalDate.of(2003, 1, 1));
        Assertions.assertEquals(21, p.getIdade());
    }
    
    @Test
    public void testMaiorDeIdade() {
        Pessoa p1 = new Pessoa("Lucas", LocalDate.of(2003, 1, 1));
        Assertions.assertTrue(p1.maiorDeIdade()); 
        
        Pessoa p2 = new Pessoa("joao", LocalDate.now());
        Assertions.assertFalse(p2.maiorDeIdade()); 
    }
}
