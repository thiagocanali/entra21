package newpackage;

public class Dono {

    private String nome;
    private String endereco;
    private int idade;
    private Pet pet;

    public Dono() {
    }

    public Dono(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idadeParam) {
        idade = idadeParam;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}
