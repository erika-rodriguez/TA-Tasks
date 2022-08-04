/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.ArrayList;

/**
 *
 * @author Erika92
 */
public interface ISeatsManager {
    
    public void checkAvailability(ArrayList<Seats> seatsList);
    public void selectSeat(TheaterManagment tm);
    
}
