package com.example.HAndbook.demo.repository;


import com.example.HAndbook.demo.service.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HandbookRepository extends JpaRepository<Country, Long> {

    Optional<Country> findByName(String name);
}
