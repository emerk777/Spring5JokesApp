/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Spring5JokesApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Spring5JokesApp.services.JokeService;

/**
 *
 * @author emer
 */

@Controller
public class JokesController {
    
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        
        model.addAttribute("joke", jokeService.getJoke());

        return "Jokes/index";
    }
    
}
