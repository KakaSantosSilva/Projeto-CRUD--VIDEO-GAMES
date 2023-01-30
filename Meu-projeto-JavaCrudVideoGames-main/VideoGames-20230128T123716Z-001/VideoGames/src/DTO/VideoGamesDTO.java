
package DTO;

public class VideoGamesDTO {
    private int id_videogame;
    private String data_cadastro, tipo_jogo, titulo_jogo, plataforma, midia, sinopse,
            status;

    public int getId_videogame() {
        return id_videogame;
    }

    public void setId_videogame(int id_videogame) {
        this.id_videogame = id_videogame;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getTipo_jogo() {
        return tipo_jogo;
    }

    public void setTipo_jogo(String tipo_jogo) {
        this.tipo_jogo = tipo_jogo;
    }

    public String getTitulo_jogo() {
        return titulo_jogo;
    }

    public void setTitulo_jogo(String titulo_jogo) {
        this.titulo_jogo = titulo_jogo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
    
}
