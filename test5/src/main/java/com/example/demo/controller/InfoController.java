package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Info;
import com.example.demo.service.InfoService;

@Controller
@RequestMapping("/info") // ①
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping
    public String index(Model model) { // ②
        List<Info> info = infoService.findAll();
        model.addAttribute("info", info); // ③
        return "info/index"; // ④
    }

    @GetMapping("new")
    public String newInfo(Model model) {
        return "info/new";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable Long id, Model model) { // ⑤
        Info info = infoService.findOne(id);
        model.addAttribute("info", info);
        return "info/edit";
    }

    @GetMapping("{id}")
    public String show(@PathVariable Long id, Model model) {
        Info info = infoService.findOne(id);
        model.addAttribute("info", info);
        return "info/show";
    }

    @PostMapping
    public String create(@ModelAttribute Info info) { // ⑥
        infoService.save(info);
        return "redirect:/info"; // ⑦
    }

    @PutMapping("{id}")
    public String update(@PathVariable Long id, @ModelAttribute Info info) {
        info.setId(id);
        infoService.save(info);
        return "redirect:/info";
    }

    @DeleteMapping("{id}")
    public String destroy(@PathVariable Long id) {
    	infoService.delete(id);
        return "redirect:/info";
    }
}