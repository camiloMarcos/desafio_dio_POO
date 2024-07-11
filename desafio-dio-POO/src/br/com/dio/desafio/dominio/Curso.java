package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHraria;
    }


    public Curso() {
    }


    public int getCargaHraria() {
        return cargaHraria;
    }

    public void setCargaHraria(int cargaHraria) {
        this.cargaHraria = cargaHraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo= " + getTitulo() +
                ", descricao= " + getDescricao() +
                ", cargaHraria= " + cargaHraria +
                '}';
    }
}

