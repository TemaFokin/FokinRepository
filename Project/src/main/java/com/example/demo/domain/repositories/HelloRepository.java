package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Hello;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends CrudRepository<Hello, Long>{
}
