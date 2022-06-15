package com.example.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private FilmRepo filmRepo;

    @Autowired
    public Start(FilmRepo filmRepo){
        this.filmRepo=filmRepo;
    }

@EventListener(ApplicationReadyEvent.class)
    public void  Run(){


    }
}
