package celular;

import navegador.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;
import telefone.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, Telefone {

    private String color;
    private String modelo;

    public Iphone(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void pesquisar(String assunto) {
        System.out.println("Pesquisa Realizada: " + assunto);
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando para a P�gina anterior");
    }

    @Override
    public void recarregarPagina() {
        System.out.println("P�gina recarregada");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo P�gina");
    }

    @Override
    public void iniciarMusica() {
        System.out.println("M�sica Iniciada");
    }

    @Override
    public void pausarMusica() {
        System.out.println("M�sica Pausada");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Tocando pr�xima m�sica");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando M�sica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " Selecionada");
    }

    @Override
    public void realizarChamada(int numero) {
        System.out.println("Chamada Realizada pelo n�mero: " + numero);
    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligando Chamada");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo Chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

}
