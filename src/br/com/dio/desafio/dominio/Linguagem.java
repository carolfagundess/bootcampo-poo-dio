package br.com.dio.desafio.dominio;

import java.util.List;

public class Linguagem {

    private int id;
    private String nome;

    private List<Curso> cursoList;

    public Linguagem(int id, String nome, List<Curso> cursoList) {
        this.id = id;
        this.nome = nome;
        this.cursoList = cursoList;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> setCursoList() {
        return cursoList;
    }



    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }
}
