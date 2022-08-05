/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.Date;

/**
 *
 * @author Erika92
 */
public class Artist extends Employee {
    private String playRole;
    private boolean canSing;
    private boolean playInstrument;
    private boolean canAct;
    
    //constructor
    public Artist(String playRole, boolean canSing, boolean playInstrument, boolean canAct, String employeeId, double salary, int id, String name, Date dateOfBirth) {
        super(employeeId, salary, id, name, dateOfBirth);
        this.playRole = playRole;
        this.canSing = canSing;
        this.playInstrument = playInstrument;
        this.canAct = canAct;
    }

    //methods
    public void rehearse() {
        System.out.println("The artist is rehearsing.");
    }
    
}
