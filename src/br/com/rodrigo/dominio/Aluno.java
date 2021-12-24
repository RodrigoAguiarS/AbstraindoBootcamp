package br.com.rodrigo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Aluno {
    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<Conteudo> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    public void progredir(){

    }
    public void calcularTotalXp(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(conteudosInscrito, aluno.conteudosInscrito) && Objects.equals(conteudosConcluido, aluno.conteudosConcluido);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluido);
    }
}
