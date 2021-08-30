/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Spring5JokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 *
 * @author emer
 */

@Service
public class JokeServiceImpl implements JokeService {
    
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
      
        return chuckNorrisQuotes.getRandomQuote();
//        return "My Joke";
        
    }
    
    
    
}
