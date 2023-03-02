package musicproject;

//classe abstrasta
public abstract class Pessoa {

  protected int id;
  protected String nome;
  protected int idade;
  protected char sexo;
  protected String login;

  public Pessoa() {}

  public Pessoa(int id, String nome, int idade, char sexo, String login) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    this.login = login;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
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

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String toString() {
    return ("\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
  }
}
