import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição do Curso JS");
        curso2.setCargaHraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());



/*      System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

// só mostra os conteúdos após a inscrição no Bootcamp.

        Dev devMarcos = new Dev();
        devMarcos.inscreverBootcamp(bootcamp);
        devMarcos.setNome("Marcos");
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("O XP de Marcos é: " + devMarcos.calcularTotalXp());




System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("----------------------------------------------------------------------------------------------");

        Dev devDiego = new Dev();
        devDiego.inscreverBootcamp(bootcamp);
        devDiego.setNome("Diego");

        System.out.println("Conteúdos Inscritos Diego: " + devDiego.getConteudosInscritos());
        devDiego.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Diego: " + devDiego.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Diego: " + devDiego.getConteudosConcluidos());
        System.out.println("O XP de Diego é: " + devDiego.calcularTotalXp());






        }
    }
