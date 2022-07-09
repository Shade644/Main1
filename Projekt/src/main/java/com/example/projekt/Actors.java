package com.example.projekt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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


}