/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Erika92
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        // TODO code application logic here
        Manager m=new Manager();
        m.modifyEmployeeList(m.createEmployeeList());
        m.createCustomersList();
        
        
        

//        logger.info("Welcome!This is your Ticket Assistant");
//        logger.error("----------------------------------------");
//        TheaterManagement tm=new TheaterManagement();
//        tm.createTM(tm);
//       
//
//        System.out.println("Enjoy the show!");
//        System.out.println("-----------------------------------------");

        

    }
    
}
