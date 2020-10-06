package projetooo;

public class Pessoa {

    private String nome;
    private double altura;
    private double peso;
    private String voz;
    private int anoNascimento = 0;
    private int idade;

    /**
     * Construtor vazio.
     */
    Pessoa() {

    }

    /**
     * Construtor com parâmetro Nome
     *
     * @param nome
     */
    Pessoa(String nome) {
        this.nome = nome;
    }

    /**
     * Seta o Nome da Pessoa
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o Nome da Pessoa
     *
     * @return String nome
     */
    public String getNome() {
        return this.nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso(double peso) {
        return this.peso;
    }

    public void setVoz(String voz) {
        this.voz = voz;
    }

    public String getVoz(String voz) {
        return this.voz;
    }

    public String falar() {
        return "blá blá";
    }

    public String getApelido() {
        return "User " + this.nome;
    }

    public void setAnoNascimento(int ano) {
        this.anoNascimento = ano;
        calculaIdade();
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void calculaIdade() {
        if (getAnoNascimento() > 0) {
            int idade = 2020 - getAnoNascimento();
            setIdade(idade);
        }
    }

}
