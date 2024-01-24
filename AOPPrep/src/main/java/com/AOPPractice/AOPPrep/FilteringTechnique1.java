package com.AOPPractice.AOPPrep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {

    @Autowired
    Movie movie;
    public String contentBasedFiltering(){
        String movieDetails = movie.getMovieDetails();
        return movieDetails;
    }
}
