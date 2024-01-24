package com.AOPPractice.AOPPrep;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    public String getMovieDetails(){
        return "Listed Movies watched by user.";
    }
}
