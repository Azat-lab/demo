package com.example.HAndbook.demo.repository;



import com.example.HAndbook.demo.entity.Handbook;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface HandbookRepository extends JpaRepository<Handbook, Integer> {

}
