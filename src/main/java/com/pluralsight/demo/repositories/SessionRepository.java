package com.pluralsight.demo.repositories;

import com.pluralsight.demo.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}