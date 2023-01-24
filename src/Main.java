import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

//        System.out.println(curso);
//        System.out.println(curso2);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMilleny = new Dev();
        devMilleny.setNome("Milleny");
        devMilleny.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Mi " + devMilleny.getConteudosInscritos());
        devMilleny.progredir();
        devMilleny.progredir();
        System.out.println("--------------");
        System.out.println("Conteudos concluídos Mi " + devMilleny.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Mi " + devMilleny.getConteudosInscritos());
        System.out.println("XP MI " + devMilleny.calcularTotalXP());

        System.out.println("-----------------------------------------------------");
        Dev dev = new Dev();
        dev.setNome("dev");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("--------------");
        System.out.println("Conteudos concluídos Dev " + dev.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Dev " + dev.getConteudosInscritos());
        System.out.println("XP Dev " + dev.calcularTotalXP());
    }

}