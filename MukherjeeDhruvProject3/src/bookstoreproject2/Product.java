/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject2;

/**
 *
 * @author dhruvmukherjee
 */
public abstract class Product implements Comparable<Product>
{
    private String name;
    private double price;
    private int inventory;
    private String author;        


    public Product(String name, double price, int inventory) 
    {
        this.name = name;
        this.price = price;
        this.author = author;
        this.inventory = inventory;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    

    
    public int compareTo(Product inv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
            
    
}
