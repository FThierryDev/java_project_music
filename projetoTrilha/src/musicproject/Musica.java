package musicproject;

import java.util.ArrayList;
import java.util.List;

public class Musica implements AcoesMusica {

  private List<Musica> musicas = new ArrayList<>();

  //atributos privados
  private String titulo;
  private String artista;
  private int id;
  private int numeroDeAcessos;
  private int curtidas;
  private boolean tocando;

  public Musica() {}

  //constructor da classe Musica
  public Musica(int id, String titulo, String artista) {
    this.id = id;
    this.titulo = titulo;
    this.artista = artista;
    this.numeroDeAcessos = 0;
    this.curtidas = 0;
    this.tocando = false;
  }

  public void setMusica(Musica newMusic) {
    musicas.add(newMusic);
  }

  public List<Musica> getMusicas() {
    return musicas;
  }

  // getters e setters dos atributos

  public String getTitulo() {
    return titulo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public int getNumeroDeAcessos() {
    return numeroDeAcessos;
  }

  public void setNumeroDeAcessos(int numeroDeAcessos) {
    this.numeroDeAcessos = numeroDeAcessos + 1;
  }

  public int getCurtidas() {
    return curtidas;
  }

  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public boolean isTocando() {
    return tocando;
  }

  public void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  //Metodos abstratos
  public void play() {
    this.tocando = true;
  }

  public void pausar() {
    this.tocando = false;
  }

  public void curtir() {
    this.curtidas++;
  }

  public String toString() {
    return (
      "Titulo: " +
      titulo +
      "\nArtista: " +
      artista +
      "\nNumeroDeAcessos: " +
      numeroDeAcessos +
      "\nCurtidas: " +
      curtidas +
      "\nTocando: " +
      tocando +
      "\n"
    );
  }
}
