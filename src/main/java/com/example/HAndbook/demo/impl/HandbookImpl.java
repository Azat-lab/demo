package com.example.HAndbook.demo.impl;

import com.example.HAndbook.demo.Handbook;
import com.example.HAndbook.demo.repository.HandbookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class HandbookImpl implements Handbook {
    @Autowired
    HandbookRepository handbookRepository;

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }
    @Override
    public void search() {
    }

    @Override
    public void update() {

    }
}
