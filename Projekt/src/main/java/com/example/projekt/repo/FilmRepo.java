package com.example.projekt.repo;

import com.example.projekt.model.Film;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface FilmRepo extends CrudRepository<Film, Integer> {
 @Transactional
 @Modifying
 @Query("delete from Film f where f.tytul = ?1")
 int deleteBytytul(String tytul);

 Film findById(int id);

}
