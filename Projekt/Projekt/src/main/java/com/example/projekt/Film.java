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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String tytul;
    private int ocena;
    private  String Kategoria;

    private Integer data;

    public Film() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public void setKategoria(String kategoria) {
        Kategoria = kategoria;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Film(String tytul, int ocena, String kategoria, Integer data) {
        this.tytul = tytul;
        this.ocena = ocena;
        Kategoria = kategoria;
        this.data = data;
    }
}