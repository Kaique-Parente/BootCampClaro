/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaiqueps.pratica01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_24;
import org.junit.jupiter.api.condition.OS;

/**
 *
 * @author kaiqu
 */
public class CondicionaisTest {

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    @EnabledOnJre(JRE.JAVA_20)
    @EnabledForJreRange(min = JAVA_11, max = JAVA_24)
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "SYSTEM")
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "SYSTEM")
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
