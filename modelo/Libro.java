package modelo;

public class Libro {

    //----------------------
    // Atributos
    //----------------------

    private int id = 0;
    private String titulo;
    private String autor;
    private String autor2;
    private String añoEdicion;
    private Boolean deLujo;


    // Contructor

    public Libro(int id, String titulo, String autor, String autor2, String añoEdicion, Boolean deLujo) {
        this.id = id++;
        this.titulo = titulo;
        this.autor = autor;
        this.autor2 = autor2;
        this.añoEdicion = añoEdicion;
        this.deLujo = deLujo;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAutor2() {
        return autor2;
    }

    public String getAñoEdicion() {
        return añoEdicion;
    }

    public Boolean getDeLujo() {
        return deLujo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        if (titulo.length() > 0) {
            this.titulo = titulo;
        }
    }

    public void setAutor(String autor) {
        if (autor.length() > 0) {
            this.autor = autor;
        }
    }

    public void setAutor2(String autor2) {
        if (autor2.length() > 0) {
            this.autor2 = autor2;
        }
    }

    public void setAñoEdicion(String añoEdicion) {
        if (añoEdicion.length() > 0) {
            this.añoEdicion = añoEdicion;
        }
    }   

    public void setDeLujo(Boolean deLujo) {
        this.deLujo = deLujo;
    }

    // Métodos

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", autor2='" + autor2 + '\'' +
                ", añoEdicion='" + añoEdicion + '\'' +
                ", deLujo=" + deLujo +
                '}';
    }


}
