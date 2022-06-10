/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject2;

/**
 *
 * @author dhruvmukherjee
 */
public class DVDs extends Product
{

    public DVDs(String name, double price, int inventory) 
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

    