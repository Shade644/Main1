package com.example.projekt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_user;
    @Column(unique = true)
    private String login;
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    private Long number;


}