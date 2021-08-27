/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Spring5JokesApp.controller;

import com.example.Spring5JokesApp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author emer
 */

@Controller
public class JokesController {
    
    JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }
    
    @RequestMapping("/")
    public String returnJokes(Model model){
        
        model.addAttribute("jokes", jokesService.getJoke());

        return "Jokes/index";
    }
    
}
