package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Info;
import com.example.demo.repository.InfoRepository;

@Service
public class InfoService {
    @Autowired
    private InfoRepository infoRepository;

    public List<Info> findAll() {
        return infoRepository.findAll();
    }

    public Info findOne(Long id) {
      
        return infoRepository.findById(id).orElse(null);
    }

    public Info save(Info player) {
        return infoRepository.save(player);
    }

    public void delete(Long id) {       
        infoRepository.deleteById(id);
    }
}