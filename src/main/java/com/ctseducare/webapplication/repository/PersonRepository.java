package com.ctseducare.webapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctseducare.webapplication.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
