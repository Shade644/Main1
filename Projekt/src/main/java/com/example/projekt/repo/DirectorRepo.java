package com.example.projekt.repo;

import com.example.projekt.model.Director;
import com.example.projekt.Controller.DirectorController;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DirectorRepo extends CrudRepository<Director, Long> {

}