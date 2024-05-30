package br.com.dio.desafio.dominio;

import java.util.List;

public class Instrutor {

    private int id;
    private String name;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Bootcamp> bootcamps;

    public Instrutor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Curso> getCurso() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Mentoria> getMentoria() {
        return mentorias;
    }

    public void addMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public List<Bootcamp> getBootcamp() {
        return bootcamps;
    }

    public void addBootcamp(Bootcamp bootcamp) {
        bootcamps.add(bootcamp);
    }
}
