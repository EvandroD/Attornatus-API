package com.attornatus.person.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attornatus.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    public Optional<Person> findById(Long id);
}