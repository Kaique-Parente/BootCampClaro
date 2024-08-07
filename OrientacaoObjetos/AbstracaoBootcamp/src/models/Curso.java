package models;

public class Curso extends Conteudo{
    
    private Integer cargaHoraria;

    public Curso() {
    }

    public Curso(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
   
    @Override
    public String toString() {
        return "Titulo = " + getTitulo() + ",\nDescricao = " + getDescricao() + ",\nCarga Horaria = " + cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

}
