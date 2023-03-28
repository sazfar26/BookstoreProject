/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azfarsufianproject1;
import java.util.ArrayList;
/**
 *
 * @author sufia
 */
public class Stock {
    public ArrayList<Book> bookStock;
    public ArrayList<CD> cdStock;
    public ArrayList<DVD> dvdStock;
    
    public Stock() {
        this.bookStock = new ArrayList();
        this.cdStock = new ArrayList();
        this.dvdStock = new ArrayList();
    }
}
