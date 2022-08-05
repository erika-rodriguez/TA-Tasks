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
public interface IShow {
//    private String showName;
//    private int duration;
//    private String genre;
//    private String showType;//orchestra, ballet, opera, chore
    
    public Show[] createShow();
    public void readShow(Show[] shows);
    public void updateShow();
    public void deleteShow();

    
    
    
    public String getShowName();

    public void setShowName(String showName);

    public int getDuration();
    
    public void setDuration(int duration);

    public String getGenre(); 
    
    public void setGenre();

    public String getShowType();

    public void setShowType(String showType);
    
}
