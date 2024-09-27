/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaiqueps.pratica01.models.entities;

import java.util.logging.Logger;

/**
 *
 * @author kaiqu
 */
public class GerenciadorDeConexaoComBancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no DB
        LOGGER.info("removeu dados");
    }
}
