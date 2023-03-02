package menu;

import main.ProjetoMusica;
import musicproject.Musica;
import musicproject.Pessoa;

public class Remover {

  public static void remover() {
    boolean run = true;
    do {
      System.out.println("[0] Sair.");
      System.out.println("[1] Remover Música.");
      System.out.println("[2] Remover Usuário.");
      switch (ProjetoMusica.scanner.nextInt()) {
        case 0:
          run = false;
          break;
        case 1:
          removerMusica();
          run = false;
          break;
        case 2:
          removerUsuario();
          run = false;
          break;
        default:
          System.out.println("Valor incorreto, tente novamente.");
      }
    } while (run);
  }

  public static void removerMusica() {
    System.out.println("\nLista de músicas:\n");
    int musicaBuscada = FuncoesMusica.selecionarMusica() - 1;

    for (Musica m : ProjetoMusica.dadosMusic.getMusicas()) {
      if (m.getId() == musicaBuscada) {
        ProjetoMusica.dadosMusic.getMusicas().remove(musicaBuscada);
        break;
      }
    }
    System.out.println("Música Removida.");
  }

  public static void removerUsuario() {
    System.out.println("\nLista de Usuários:\n");
    int usuarioBuscado = FuncoesUser.selecionarUsuario() - 1;

    for (Pessoa m : ProjetoMusica.dadosUser.getUsers()) {
      if (m.getId() == usuarioBuscado) {
        ProjetoMusica.dadosUser.getUsers().remove(usuarioBuscado);
        break;
      }
    }
    System.out.println("Usuário Removido.");
  }
}
