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
public class Book{
    private String name;
    private double price;
    private String author;
    private String genre;
    
    public Book (String aname, double aprice, String anauthor, String agenre) {
        this.name = aname;
        this.price = aprice;
        this.author = anauthor;
        this.genre = agenre;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getGenre() {
        return genre; 
    }

}
