/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solvd.theater;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Erika92
 */
public class Seats {
    private boolean availableSeat=true;
    private int seatId;

    //constructors
     public Seats() {
    }
    public Seats(boolean availableSeat, int seatId) {
        this.availableSeat = availableSeat;
        this.seatId = seatId;
    }
   

    
    //methods
    public static void createSeats(Theater t){
        ArrayList<Seats> seatsList=new ArrayList();
        RandomBoolean rb=new RandomBoolean();
        
        for (int i = 0; i < t.getCapacity(); i++) {
            Seats seat=new Seats(rb.nextBoolean(), i+1);
            seatsList.add(i, seat);
        }
        t.setSeatList(seatsList);
    }
    
    public static void showSeatsList(ArrayList<Seats> seatsList){
        System.out.println("");
        System.out.println("List of Seats: ");
        for (int i = 0; i < seatsList.size(); i++) {
            System.out.print("["+seatsList.get(i).getSeatId()+" , "+seatsList.get(i).isAvailableSeat()+"] ");
        }
        System.out.println("");
    }
    
    //@Override
    public static void checkAvailability(ArrayList<Seats> seatsList){
        int availableSeats=0;
        int occupiedSeats=0;
        for (int i = 0; i < seatsList.size(); i++) {
            if (seatsList.get(i).isAvailableSeat()==true) {
                availableSeats++;
            }else   occupiedSeats++;
        }     
        System.out.println("");
        System.out.println("The Hall is "+100*(occupiedSeats/(availableSeats+occupiedSeats))+"% occupied.");
        System.out.println("There are "+availableSeats+" seats free and "+occupiedSeats+" seats occupied.");
    }
    
    
    
    public static void selectSeat(TheaterManagement tm) throws NotAvailableSeatException,NotValidInputException{
        ArrayList<Seats> seatsList=tm.getTicket().getTheater().getSeatList();
        Scanner sc=new Scanner(System.in);
        int option;
        System.out.println("");
        System.out.println("Select a seat number:");
        if (sc.hasNextInt()) {
            option=sc.nextInt();
            for (int i = 0; i < seatsList.size(); i++) {
                if (seatsList.get(option-1).isAvailableSeat()==false) {
                    sc.next();
                    throw new NotAvailableSeatException ("The seat is not available. Try again.");
                }else if (seatsList.get(option-1).isAvailableSeat() && seatsList.get(i).getSeatId()==option) {
                    int seatNumber=seatsList.get(i).getSeatId();
                    System.out.println("You have selected seat number "+seatNumber);
                    tm.getTicket().setSeatNumber(seatNumber);
                    seatsList.get(i).setAvailableSeat(false);
                    break;
                }
            } 
        }
        else    {
            sc.next();
            throw new NotValidInputException("That is not a valid input.");
        }


    }
//    public void Ocupation(int capacity){
//        if (bookedSeats==capacity) {
//            System.out.println("The theater has reached it's full capacity.");
//        }
//            else if (bookedSeats<capacity) {
//                    System.out.println("There are "+freeSeats+" seats available");  
//            }
//            else  { 
//                System.out.println("There is an oversale");
//        }
//    }
    
    //toString HashCode Equals
   
    //getters and setters
    public boolean isAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(boolean availableSeat) {
        this.availableSeat = availableSeat;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }


  
    
}
