package com.example.notasactivity;

public class Notas {
    private String Titulo, Contenido;

    public Notas() {
    }

    public Notas(String titulo, String contenido) {
        this.Titulo = titulo;
        this.Contenido = contenido;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void getTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getContenido() {return Contenido;}

    public void setContenido(String contenido) {
        this.Contenido = contenido;
    }

}
