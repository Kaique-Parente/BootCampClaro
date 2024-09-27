/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaiqueps.pratica01;

import com.kaiqueps.pratica01.models.entities.Pessoa;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 * @author kaiqu
 */
public class AssertionsTest {
    
    @Test
    void verificarSeDoisArraysIguais(){
        int[] a = {10, 5, 3};
        int[] b = {10, 5, 3};
        
        assertArrayEquals(a, b);
        
        int[] c = {10, 5, 3};
        int[] d = {-3, 7, 5};
        
        assertNotEquals(c,d);
    }
    
    @Test
    void verificarObjetoNull(){
        Pessoa p = null;
        assertNull(p);
        
        p = new Pessoa("James", LocalDate.of(2003, 10, 8));
        assertNotNull(p);
    }
    
    @Test
    void verificarDoisDoublesIguais(){
        double a = 5d;
        double b = 5.0;
        
        assertEquals(a,b);
    }
    
}
