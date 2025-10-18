package com.hs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hs.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
