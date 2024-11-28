/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.alumno.controller;

import com.example.alumno.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Eduardo
 */
@Controller
public class FromController {
    
    @GetMapping("/form")
    public String showForm(Model modelo){
        modelo.addAttribute("user", new User());
        return "form";
    }
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model modelo){
        modelo.addAttribute("user", user);
        return "success";
    }
}