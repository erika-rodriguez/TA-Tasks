/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

/**
 *
 * @author Erika92
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Wellcome!This is your Ticket Assistant");
        System.out.println("----------------------------------------");
        TheaterManagment tm=new TheaterManagment();
        tm.createTM(tm);
       

        System.out.println("Enjoy the show!");
        System.out.println("-----------------------------------------");

        

    }
    
}
