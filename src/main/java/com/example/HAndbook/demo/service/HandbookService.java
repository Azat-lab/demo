package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Handbook;
import com.example.HAndbook.demo.repository.HandbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HandbookService {
    @Autowired
    private HandbookRepository handbookRepository;

    public Handbook save(Handbook handbook){
        return handbookRepository.save(handbook);
    }
//    public Handbook delete(Handbook handbook){
//        return handbookRepository.deleteById(ha);
//    }
}
