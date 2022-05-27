package com.example.projekt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo extends CrudRepository<Film, Long> {

}
