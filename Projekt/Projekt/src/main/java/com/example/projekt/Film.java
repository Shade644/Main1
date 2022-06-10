package com.example.projekt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Year;
import java.util.Date;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Tytuł;
    private String Kategoria;
    private Integer Ocena;

    private Year Data;


    public Film(Long id, String tytuł, String kategoria, Integer ocena,Year data) {
        this.id = id;
        Tytuł = tytuł;
        Kategoria = kategoria;
        Ocena = ocena;
        Data = data;
    }



    public Film() {

    }

    public Long getId() {
        return id;
    }

    public String getTytuł() {
        return Tytuł;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public Integer getOcena() {
        return Ocena;
    }

    public Year getData() {
        return Data;
    }
}
