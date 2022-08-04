/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Erika92
 */
public class TheaterManagment {
    private Play[] plays;
    private ArrayList <Theater> theaters;
    private Ticket ticket;

    //constructors
    public TheaterManagment() {
        this.ticket=new Ticket();
    }

    //Methods
    public TheaterManagment createTM(TheaterManagment tm){
        tm.createPlays(tm);
        tm.selectPlay(tm);
        
        tm.createTheaters(tm);
        tm.selectTheater(tm);
        tm.checkAvailability(tm);
        tm.selectSeat(tm);   

        tm.printTicket(tm);
        return tm;
    }
    
    public void createPlays(TheaterManagment tm){
        Play play=new Play();
        tm.setPlays(play.createShow());
        tm.showPlays(play, tm);
    }
    
    public void showPlays(Play play,TheaterManagment tm){
        play.readShow(tm.getPlays());
    }
    
    public void selectPlay(TheaterManagment tm) throws IndexOutOfBoundsException, InputMismatchException{
        Scanner sc=new Scanner(System.in);
        boolean exception=false;
        
        do {
            exception=false;
            try {
            System.out.println("");
            System.out.println("Choose the show:");
            int option=sc.nextInt();
            Play selectedPlay=tm.getPlays()[option-1];
            tm.getTicket().setPlay(selectedPlay);
            System.out.println("You have selected "+tm.getTicket().getPlay().getShowName());
            System.out.println("");
            } catch (IndexOutOfBoundsException|InputMismatchException e) {
                System.out.println("Please, enter a valid option.");
                sc.next();
                exception=true;
            }
        } while (exception);
    }
    
    
    public void createTheaters(TheaterManagment tm){
        Theater t= new Theater();
        tm.setTheaters(t.createTheaters(tm));
        tm.showTheaters(t, tm);
        tm.createSeatsList(t);
    }
    
    public void showTheaters(Theater t,TheaterManagment tm){
        t.readTheaters(tm.getTheaters());
    }
    
    public void selectTheater (TheaterManagment tm)throws IndexOutOfBoundsException, InputMismatchException{
        Scanner sn=new Scanner(System.in);
        boolean exception=false;
        
        do {
            exception=false;
            try {
            System.out.println("");
            System.out.println("Choose the theater:");
            int option=sn.nextInt();
            Theater selectedTheater=tm.getTheaters().get(option-1);
            selectedTheater.createSeats(selectedTheater);
            tm.getTicket().setTheater(selectedTheater);
            System.out.println("You have selected "+tm.getTicket().getTheater().getTheaterName()+" Theater");
            System.out.println("");

            createSeatsList(selectedTheater);
            showSeatsList(selectedTheater);
            } catch (IndexOutOfBoundsException|InputMismatchException e) {
                System.out.println("Please, enter a valid option.");
                sn.next();
                exception=true;
            }
        } while (exception);
        
        
    }
    
    public void createSeatsList(Theater t){
        Seats seat=new Seats();
        seat.createSeats(t); 
    }
    
    public void showSeatsList(Theater t){
        Seats seat=new Seats();
        seat.showSeatsList(t.getSeatList());
    }
   
    public void selectSeat(TheaterManagment tm){
        Theater t=new Theater();
        t.selectSeat(tm);
        System.out.println("");            
    }   
    
    public void checkAvailability(TheaterManagment tm){
        Theater t=new Theater();
        t.checkAvailability(tm.getTicket().getTheater().getSeatList());
    }

    
    public void printTicket(TheaterManagment tm){
        System.out.println("-------------------------------------------------");
        System.out.println("Your Ticket Number is "+Math.abs(tm.getTicket().hashCode())
        + "\n Theater: "+tm.getTicket().getTheater().getTheaterName()
        +"\n Show: "+tm.getTicket().getPlay().getShowName()
        +"\n Duration: "+tm.getTicket().getPlay().getDuration()
        +"\n Seat number: "+ tm.getTicket().getSeatNumber());
        System.out.println("");
    }

    //getters and setters
    public Play[] getPlays() {
        return plays;
    }

    public void setPlays(Play[] plays) {
        this.plays = plays;
    }

    public ArrayList<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(ArrayList<Theater> theaters) {
        this.theaters = theaters;
    }


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    //toString HashCode Equals
//    @Override
//    public String toString() {
//        System.out.println("---------------------------YOUR TICKET-----------------------------");
//        return "TheaterManagment{" + "theaterName=" + theater.getTheaterName()+ 
//                ", play=" + play.getPlayName() + ", duration(min)=" +
//                play.getDuration()+ ", seat="  + ", Ticket Number=" + 
//                +'}';
//    }

   
}
