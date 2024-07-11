package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());                   // estudar linda de código
        bootcamp.getDevsIncritos().add(this);                                      // estudar linda de código
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();         // estudar linda de código
            if (conteudo.isPresent()) {                                                     // estudar linda de código
                this.conteudosConcluidos.add(conteudo.get());                               // estudar linda de código
                this.conteudosInscritos.remove(conteudo.get());                             // estudar linda de código
            }else {
                System.err.println("VOCÊ NÃO ESTÁ INSCRITO EM NENUM CONTEÚDO");
            }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos                                                     // estudar linda de código
                .stream()                                                                   // estudar linda de código
                .mapToDouble(Conteudo::calcularXp)                                          // estudar linda de código
                .sum();                                                                     // estudar linda de código
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
