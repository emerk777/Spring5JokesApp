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
public class NorrisJokesService implements JokesService {
    
    ChuckNorrisQuotes chuckNorrisQuotes;

    public NorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
      
        return chuckNorrisQuotes.getRandomQuote();
        
    }
    
    
    
}
