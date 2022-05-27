package com.example.projekt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nazwa;
    private  String Kategoria;
    private String Ocena;

    private Date Data;

    public Film(Long id, String nazwa, String kategoria, String ocena,Date data) {
        this.id = id;
        Nazwa = nazwa;
        Kategoria = kategoria;
        Ocena = ocena;
        Data = data;
    }

    public Film(String test, String kategoria, String comedy,Date date) {
    }

    public Film() {

    }

    public Long getId() {
        return id;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public String getOcena() {
        return Ocena;
    }

    public Date getData() {
        return Data;
    }
}
