package com.example.projekt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tytul;
    private int ocena;
    private String Kategoria;
    private Date data;

}