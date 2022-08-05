/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Erika92
 */
public class Theater {
    private String theaterName;
    private int capacity;
    private ArrayList<Seats> seatList;
    
    //constructors
    public Theater() {
//        ArrayList<Seats> seatsList=new ArrayList();
    }

    public Theater(String theaterName, int capacity) {
        this.theaterName = theaterName;
        this.capacity = capacity;
    }
    
    public Theater(String theaterName, int capacity, ArrayList<Seats> seatList) {
        this.theaterName = theaterName;
        this.capacity = capacity;
        this.seatList = seatList;
    }

    public ArrayList <Theater> createTheaters(TheaterManagment tm){//funciona
        Theater astor=new Theater("Astor", 10);
        Theater colon=new Theater("Colon", 20);
        Theater phoenix=new Theater("Phoenix", 30);
        Theater royal=new Theater("Royal", 40);

        ArrayList <Theater> theatersList=new ArrayList();
        theatersList.add(astor);
        theatersList.add(colon);
        theatersList.add(phoenix);
        theatersList.add(royal);
        
        return theatersList;
    }
    
    public void readTheaters(ArrayList <Theater> theatersList){
        for (int i = 0; i < theatersList.size(); i++) {
            System.out.println((i+1)+". "+"["+theatersList.get(i).getTheaterName()+"] ");
        }
    }
    
    
    public void createSeats(Theater t){
        Seats s=new Seats();
        s.createSeats(t);
        //s.showSeats(t);
    }
    
    public void checkAvailability(ArrayList<Seats> seatsList){
        Seats s=new Seats();
        s.checkAvailability(seatsList);
    }
    
    public void selectSeat(TheaterManagment tm){
        Seats s=new Seats();
        s.selectSeat(tm);

    }
    


    //getters and setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public ArrayList<Seats> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seats> seatList) {
        this.seatList = seatList;
    }
    
        
    //toString HashCode Equals
    @Override
    public String toString() {
        return "Theater{" + "theaterName=" + theaterName + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.theaterName);
        hash = 37 * hash + this.capacity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Theater other = (Theater) obj;
        if (this.capacity != other.capacity) {
            return false;
        }
        if (!Objects.equals(this.theaterName, other.theaterName)) {
            return false;
        }
        return true;
    }
}
    
 
