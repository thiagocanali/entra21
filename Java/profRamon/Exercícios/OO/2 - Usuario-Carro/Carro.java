package projetooo;

public class Carro {

    private int ano;
    private String nome;
    
    Carro(){}
    Carro(String nome){
        this.nome = nome;
    }
    Carro(int ano) {
        this.ano = ano;
    }
    Carro(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
