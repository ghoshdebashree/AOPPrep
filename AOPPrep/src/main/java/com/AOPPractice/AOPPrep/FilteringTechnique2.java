package com.AOPPractice.AOPPrep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique2 {
    @Autowired
    User user;
    public String collaborativeBased(){
        String userDetails = user.getUserDetails();
        return userDetails;
    }
}
