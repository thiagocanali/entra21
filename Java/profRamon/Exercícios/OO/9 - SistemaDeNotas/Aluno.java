package br.com.frames2;

public class Aluno extends Pessoa {

    private String turma;
    private String materia;
    private double nota;

    public Aluno(String nome, String turma, String materia, double nota) {

        setNome(nome);
        setMateria(materia);
        setNota(nota);

    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
