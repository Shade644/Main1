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
@Table(name = "Actors")
public class Actors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_actor;
    private String imie;
    private String nazwisko;
    private String Kraj_pochodzenia;
    private Date Data_urodzenia;



}