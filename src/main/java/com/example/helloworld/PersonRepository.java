package com.example.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // JpaRepository provides CRUD operations by default
}