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
public class DVD {
    private String name;
    private double price;
    private String director;
    private String genre;
    
    public DVD (String aname, double aprice, String adirector, String agenre) {
        this.name = aname;
        this.price = aprice;
        this.director = adirector;
        this.genre = agenre;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getDirector() {
        return director;
    }
    
    public String getGenre() {
        return genre; 
    }
    
}
