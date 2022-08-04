/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Erika92
 */
public class Play extends Show implements IShow {
    private Artist artist;
    //constructors
    public Play() {
        super();
    }
    
    public Play(String playName, int playDuration,String kind){
        showName=playName;
        duration=playDuration;
        genre=kind;
    }
        
    //Methods
    @Override
    public Play[] createShow() {
        Play play1=new Play("Moulin Rouge", 120, "Musical");
        Play play2=new Play("The Lion King", 150, "Musical");
        Play play3=new Play("Cats musical", 130,"Musical");
        Play play4=new Play("Hamlet", 160, "Drama");
        Play play5=new Play("Swan Lake", 160, "Ballet");
        
        Play [] plays=new Play[5];
        plays[0]=play1;
        plays[1]=play2;
        plays[2]=play3;
        plays[3]=play4;
        plays[4]=play5;
        
        return plays;
    }
    
    @Override
    public void readShow(Show[] plays) {
         for (int i = 0; i < plays.length; i++) {
            System.out.println((i+1)+". "+"["+plays[i].getShowName()+"] "+"Duration(min): "+plays[i].getDuration());
        }
    }

    //getters and setters
    @Override
    public String getShowName(){
        return showName;
    }

    @Override
    public void setShowName(String showName) {
        this.showName = showName;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    //toString HashCode Equals
    @Override
    public String toString() {
        return "Play{" + "playName=" + showName + ", duration=" + duration + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.showName);
        hash = 79 * hash + this.duration;
        hash = 79 * hash + Objects.hashCode(this.artist);
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
        final Play other = (Play) obj;
        if (this.duration != other.duration) {
            return false;
        }
        if (!Objects.equals(this.showName, other.showName)) {
            return false;
        }
        return Objects.equals(this.artist, other.artist);
    }

    @Override
    public String getGenre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGenre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getShowType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setShowType(String showType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void updateShow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteShow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

   
    
    
}
