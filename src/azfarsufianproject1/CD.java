/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azfarsufianproject1;

import java.util.*;

/**
 *
 * @author sufia
 */
public class CD {
    private String name;
    private double price;
    private String artist;
    private String genre;
    
    public CD (String aname, double aprice, String anartist, String agenre) {
        this.name = aname;
        this.price = aprice;
        this.artist = anartist;
        this.genre = agenre;
    }
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getGenre() {
        return genre; 
    }
    
}
