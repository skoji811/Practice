package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private InfoRepository syainRepository;

    @RequestMapping(value = "/")
    public List<Information> get() {
        return syainRepository.findAll();
    }
}