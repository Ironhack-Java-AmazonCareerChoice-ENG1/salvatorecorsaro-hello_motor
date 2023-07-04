package com.ironhack.hellomotor.repository;

import com.ironhack.hellomotor.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
