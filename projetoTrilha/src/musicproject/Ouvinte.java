package musicproject;
import java.util.ArrayList;
import java.util.List;

public class Ouvinte extends Pessoa {

  private List<Pessoa> users = new ArrayList<>();

  public Ouvinte() {}

  public Ouvinte(int id, String nome, int idade, char sexo, String login) {
    super(id, nome, idade, sexo, login);
  }

  public void setUser(Ouvinte newUser) {
    users.add(newUser);
  }

  public List<Pessoa> getUsers() {
    return users;
  }

  // polimorfismo de sobreposicao
  public String toString() {
    return (super.toString() + "\nLogin: " + login);
  }
}
