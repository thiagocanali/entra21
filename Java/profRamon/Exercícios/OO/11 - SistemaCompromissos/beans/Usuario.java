
package br.com.beans;

public class Usuario extends Pessoa {
    
    private String login;
    private String senha;
    
    public Usuario(){}
    
      public Usuario(String login, String nome, int idade, String sexo, String senha){
          super(nome, idade, sexo);
          this.login = login; 
          this.senha = senha;
      }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
