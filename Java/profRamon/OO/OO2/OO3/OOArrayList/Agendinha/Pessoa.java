package newpackage;

import java.util.ArrayList;

public class Pessoa {

    String nome;
    char sexo;
    private ArrayList<Compromisso> compromissos = new ArrayList<Compromisso>();

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Compromisso> getCompromissos() {
        return compromissos;
    }

    public void setCompromisso(Compromisso compromissos) {
        this.compromissos.add(compromissos);
    }

    public Compromisso getCompromisso(int index) {
        return compromissos.get(index);
    }

}
