/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user;

/**
 *
 * @author Rowdy
 */
public class User {
    
    private final String NAME;
    private String gender;
    
    public User(){
        //this.NAME = System.getProperty("user.NAME");
        // OR
        this.NAME = System.getenv("USERNAME");
        // OR
        //this.NAME = new com.sun.security.auth.module.NTSystem().getName();
    }
    
    public String getName() {
        return this.NAME;
    }
}
