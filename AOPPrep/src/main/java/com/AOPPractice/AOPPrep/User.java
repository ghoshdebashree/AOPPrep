package com.AOPPractice.AOPPrep;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    public String getUserDetails(){
        return "The User Details are listed below --- ";
    }
}
