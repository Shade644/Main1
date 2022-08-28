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
@Table(name = "Director")

public class Director{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id_director;
        private String imie_dir;
        private String nazwisko_dir;
        private Date data_urodzia_dir;
        private String tytul;

    }

