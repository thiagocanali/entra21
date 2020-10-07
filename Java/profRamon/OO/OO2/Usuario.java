package projetooo;

public class Usuario {

    private String nome;
    private int idade;
    private String sexo;
    private Carro carro;
    
    /**
     * Construtor vazio
     */
    Usuario() {
    }

    /**
     * Construtor informando Nome
     *
     * @param nome
     */
    Usuario(String nome) {
        this.nome = nome;
    }

    /**
     * Construtor completo
     *
     * @param nome
     * @param idade
     */
    Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Construtor passando idade
     *
     * @param idade
     */
    Usuario(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public Carro getCarro() {
        return this.carro;
    }
    
    
}
