package main;

import dados.Dados;
import java.util.Scanner;
import menu.*;
import musicproject.*;

public class ProjetoMusica {

  public static Scanner scanner = new Scanner(System.in);
  public static Musica dadosMusic = new Musica();
  public static Ouvinte dadosUser = new Ouvinte();

  public static void main(String[] args) throws Exception {
    int idMusica = Dados.dadosMusica();
    int idUser = Dados.dadosUser();

    int resposta = 1;
    try (Scanner scanner = new Scanner(System.in)) {
      while (resposta == 1) {
        int opcao;

        System.out.println("\nSelecione a opção desejada!\n");
        System.out.println("[1] Adicionar nova Musica.");
        System.out.println("[2] Lista de Musicas.");
        System.out.println("[3] Adicionar usuário.");
        System.out.println("[4] Exibir usuários.");
        System.out.println("[5] Ouvir musica.");
        System.out.println("[6] Parar de ouvir");
        System.out.println("[7] Remover dados.");
        System.out.println("[0] Sair do Programa.");
        System.out.print("\nDigite: ");
        opcao = scanner.nextInt();

        switch (opcao) {
          case 1:
            idMusica = FuncoesMusica.adicionarNovaMusica(idMusica);
            break;
          case 2:
            FuncoesMusica.exibirMusicas();
            break;
          case 3:
            idUser = FuncoesUser.adicionarUsuario(idUser);
            break;
          case 4:
            FuncoesUser.exibirUsuarios();
            break;
          case 5:
            int idUserSelect = FuncoesUser.selecionarUsuario();
            int idMusicSelect = FuncoesMusica.selecionarMusica();
            FuncoesMusica.ouvirMusica(idUserSelect, idMusicSelect);
            break;
          case 6:
            FuncoesMusica.pararDeOuvir();
            break;
          case 7:
            Remover.remover();
            break;
          case 0:
            resposta = 0;
            break;
          default:
            System.out.println("Insira uma opção valida!");
            break;
        }
      }
    }
  }
}
