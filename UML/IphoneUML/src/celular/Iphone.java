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
        System.out.println("Voltando para a Página anterior");
    }

    @Override
    public void recarregarPagina() {
        System.out.println("Página recarregada");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void iniciarMusica() {
        System.out.println("Música Iniciada");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música Pausada");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Tocando próxima música");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando Música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " Selecionada");
    }

    @Override
    public void realizarChamada(int numero) {
        System.out.println("Chamada Realizada pelo número: " + numero);
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
