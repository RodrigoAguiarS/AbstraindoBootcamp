package br.com.rodrigo;

import br.com.rodrigo.dominio.Conteudo;
import br.com.rodrigo.dominio.Curso;
import br.com.rodrigo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso Java");
        curso.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);

    }
}
