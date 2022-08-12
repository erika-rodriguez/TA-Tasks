/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solvd.theater;

import java.util.ArrayList;

/**
 *
 * @author Erika92
 */
public interface IManager {
    public void deleteTheater ();
    public void updateTheater();
    public void checkAvailability(ArrayList<Seats> seatsList);
    public void selectSeat(TheaterManagement tm)throws NotAvailableSeatException;
    
}
