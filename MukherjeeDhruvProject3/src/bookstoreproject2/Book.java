/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject2;

/**
 *
 * @author dhruvmukherjee
 */
public class Book extends Product
{
    
/**
 * 
 * @param name
 * @param price
 * @param bookInventory
 * @param bookPrice 
 */
    public Book(String name, double price, int inventory) 
    {
        super(name, price, inventory);
    }


    @Override
     public int compareTo(Product inv) 
    {
        if(this.getInventory() > inv.getInventory())
        {
            return 1;
        }
        else if(this.getInventory() < inv.getInventory())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }    
    
    
}
