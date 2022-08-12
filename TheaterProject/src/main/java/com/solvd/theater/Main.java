/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solvd.theater;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //FOR ADMIN
//        Manager m=new Manager();
//        m.createEmployeeList();
//        m.createCustomersList();

        //For the USER
        logger.info("Welcome!This is your Ticket Assistant");
        logger.info("----------------------------------------");
        TheaterManagement tm=new TheaterManagement();
        tm.createTM(tm);
        System.out.println("Enjoy the show!");
        System.out.println("-----------------------------------------");
    }
}
