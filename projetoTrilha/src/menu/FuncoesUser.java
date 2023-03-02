package menu;

import main.ProjetoMusica;
import musicproject.Ouvinte;
import musicproject.Pessoa;

public class FuncoesUser {

  public static int adicionarUsuario(int id) {
    String nome;
    String nomeUsuario;
    int idade;
    Character sexo;

    System.out.print("Digite o nome: ");
    nome = ProjetoMusica.scanner.nextLine();

    System.out.print("Digite o nome de usuário: ");
    nomeUsuario = ProjetoMusica.scanner.nextLine();

    System.out.print("Digite a idade: ");
    idade = ProjetoMusica.scanner.nextInt();

    ProjetoMusica.scanner.nextLine();
    System.out.print("Digite o sexo: ");
    sexo = ProjetoMusica.scanner.next().charAt(0);

    Ouvinte newUser = new Ouvinte(id, nome, idade, sexo, nomeUsuario);
    ProjetoMusica.dadosUser.setUser(newUser);

    return id++;
  }

  public static void exibirUsuarios() {
    System.out.println("\nUsuarios Disponiveis:");
    for (Pessoa p : ProjetoMusica.dadosUser.getUsers()) {
      System.out.println(p.toString());
    }
  }

  public static int selecionarUsuario() {
    for (Pessoa p : ProjetoMusica.dadosUser.getUsers()) {
      System.out.print("\n" + p.getId() + ". ");
      System.out.print(p.getLogin() + "\n");
    }

    System.out.print("\nDigite o numero do usuário que deseja usar: ");
    return ProjetoMusica.scanner.nextInt();
  }
}
