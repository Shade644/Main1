package com.example.projekt.repo;

import com.example.projekt.model.Actors;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ActorsRepo extends CrudRepository<Actors, Long> {
    @Transactional
    @Modifying
    @Query()
    int deleteByimie(String imie);

}