package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("description");
        curso1.setCargaHoraria(6);

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("description");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}
