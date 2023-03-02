package menu;

import main.ProjetoMusica;
import musicproject.Musica;
import musicproject.Pessoa;

public class FuncoesMusica {

  public static int adicionarNovaMusica(int id) {
    String nomeMusica;
    String nomeArtista;

    System.out.print("\nDigite o nome da musica: ");
    nomeMusica = ProjetoMusica.scanner.nextLine();

    System.out.print("Digite o nome do artista: ");
    nomeArtista = ProjetoMusica.scanner.nextLine();

    Musica newMusic = new Musica(id, nomeMusica, nomeArtista);
    ProjetoMusica.dadosMusic.setMusica(newMusic);

    System.out.println("\nMusica Adicionada com Sucesso!\n");

    return id++;
  }

  public static void exibirMusicas() {
    System.out.println("\nMusicas Disponiveis:\n");
    for (Musica m : ProjetoMusica.dadosMusic.getMusicas()) {
      System.out.println(m.toString());
    }
  }

  public static int selecionarMusica() {
    for (Musica m : ProjetoMusica.dadosMusic.getMusicas()) {
      System.out.print("\n" + m.getId() + ". ");
      System.out.println(m.getTitulo());
    }

    System.out.print("\nSelecione o id de uma música: ");
    return ProjetoMusica.scanner.nextInt();
  }

  public static void ouvirMusica(int idUserSelect, int idMusicSelect) {
    System.out.print("\nO usuário ");
    for (Pessoa p : ProjetoMusica.dadosUser.getUsers()) {
      if (p.getId() == idUserSelect) {
        System.out.print(p.getLogin());
      }
    }

    System.out.print(" está ouvindo a música ");

    for (Musica m : ProjetoMusica.dadosMusic.getMusicas()) {
      Character curtida;

      if (m.isTocando() == true) {
        m.pausar();
      }

      if (m.getId() == idMusicSelect) {
        System.out.println(m.getTitulo() + "\n");
        m.play();
        m.setNumeroDeAcessos(m.getNumeroDeAcessos());
        ProjetoMusica.scanner.nextLine();
        System.out.print("Curtir S?(S p/ sim N p/ não): ");
        curtida = ProjetoMusica.scanner.next().charAt(0);
        if (curtida == 'S') {
          m.curtir();
        }
      }
    }
  }

  public static void pararDeOuvir() {
    for (Musica m : ProjetoMusica.dadosMusic.getMusicas()) {
      if (m.isTocando() == true) {
        m.pausar();
        System.out.println("A musica " + m.getTitulo() + " parou de tocar");
      }
    }
  }
}
