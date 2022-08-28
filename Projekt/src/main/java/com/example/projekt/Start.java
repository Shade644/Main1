package com.example.projekt;

import com.example.projekt.repo.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private final FilmRepo filmRepo;

    @Autowired
    public Start(FilmRepo filmRepo){
        this.filmRepo=filmRepo;
    }

@EventListener(ApplicationReadyEvent.class)
    public void  Run(){


    }
}
