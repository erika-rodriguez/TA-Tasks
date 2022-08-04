/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Erika92
 */
public class Seats implements ISeatsManager{
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
    public  void createSeats(Theater t){
        ArrayList<Seats> seatsList=new ArrayList();
        RandomBoolean rb=new RandomBoolean();
        
        for (int i = 0; i < t.getCapacity(); i++) {
            Seats seat=new Seats(rb.nextBoolean(), i+1);
            seatsList.add(i, seat);
        }
        t.setSeatList(seatsList);
    }
    
    public void showSeatsList(ArrayList<Seats> seatsList){
        System.out.println("");
        System.out.println("List of Seats: ");
        for (int i = 0; i < seatsList.size(); i++) {
            System.out.print("["+seatsList.get(i).getSeatId()+" , "+seatsList.get(i).isAvailableSeat()+"] ");
        }
        System.out.println("");
    }
    
    @Override
    public void checkAvailability(ArrayList<Seats> seatsList){
        int availableSeats=0;
        int occupiedSeats=0;
        for (int i = 0; i < seatsList.size(); i++) {
            if (seatsList.get(i).isAvailableSeat()==true) {
                availableSeats++;
            }else   occupiedSeats++;
        }     
        System.out.println("");
        //System.out.println("The Hall is "+100*(occupied/(available+occupied))+"% occupied."); DOUBLE
        System.out.println("There are "+availableSeats+" seats free and "+occupiedSeats+" seats occupied.");
    }
    
    
    @Override
    public void selectSeat(TheaterManagment tm) throws IndexOutOfBoundsException,InputMismatchException{
        ArrayList<Seats> seatsList=tm.getTicket().getTheater().getSeatList();
        Scanner sc=new Scanner(System.in);
        boolean exception=false;

            do {
            int option;
                try{
                    System.out.println("");
                    System.out.println("Select a seat number:");
                    option=sc.nextInt();

                    for (int i = 0; i < seatsList.size(); i++) {

                        if (seatsList.get(option-1).isAvailableSeat()==false) {
                            System.out.println("The seat is not available. Try again.");
                            exception=true;
                            break;
                        }else if (seatsList.get(option-1).isAvailableSeat() && seatsList.get(i).getSeatId()==option) {
                            int seatNumber=seatsList.get(i).getSeatId();
                            System.out.println("You have selected seat number "+seatNumber);
                            tm.getTicket().setSeatNumber(seatNumber);
                            seatsList.get(i).setAvailableSeat(false);
                            exception=false;
                            break;
                        }
                    }
                }catch (IndexOutOfBoundsException|InputMismatchException e) {
                        System.out.println("Please, enter a valid option."); 
                        sc.next();
                        exception=true;
                }
                
            } while (exception);

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
