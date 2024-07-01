package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("description");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("description");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("description");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBessa = new Dev();
        devBessa.setNome("Bessa");
        devBessa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos por Bessa: " + devBessa.getConteudosInscritos());
        devBessa.progredir();
        devBessa.progredir();
        devBessa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos por Bessa: " + devBessa.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por Bessa: " + devBessa.getConteudosConcluidos());
        System.out.println("XP: " + devBessa.CalcularTotalXp());

        System.out.println("------------");

        Dev devNanda = new Dev();
        devNanda.setNome("Nanda");
        devNanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos por Nanda: " + devNanda.getConteudosInscritos());
        devNanda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos por Nanda: " + devNanda.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por Nanda: " + devNanda.getConteudosConcluidos());
        System.out.println("XP: " + devNanda.CalcularTotalXp());

    }
}
