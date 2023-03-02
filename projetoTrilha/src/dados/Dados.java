package dados;

import main.ProjetoMusica;
import musicproject.Musica;
import musicproject.Ouvinte;

public class Dados {

  public static int dadosMusica() {
    Musica set1 = new Musica(1, "Wicked Games", "The Weenknd");
    Musica set2 = new Musica(2, "When I Was Your Man", "Bruno Mars");
    Musica set3 = new Musica(3, "Back In Black", "AC/DC");
    Musica set4 = new Musica(4, "Faint", "Linkin Park");
    Musica set5 = new Musica(5, "I Want You Back", "The Jackson 5");

    ProjetoMusica.dadosMusic.setMusica(set1);
    ProjetoMusica.dadosMusic.setMusica(set2);
    ProjetoMusica.dadosMusic.setMusica(set3);
    ProjetoMusica.dadosMusic.setMusica(set4);
    ProjetoMusica.dadosMusic.setMusica(set5);

    return 6;
  }

  public static int dadosUser() {
    Ouvinte set6 = new Ouvinte(1, "Fulgêncio", 19, 'M', "FThierry");
    Ouvinte set7 = new Ouvinte(2, "Maria", 22, 'F', "Maria1BR");
    ProjetoMusica.dadosUser.setUser(set6);
    ProjetoMusica.dadosUser.setUser(set7);

    return 3;
  }
}
