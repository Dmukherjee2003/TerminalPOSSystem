/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject2;

/**
 *
 * @author dhruvmukherjee
 */
public interface BookStoreSpecification 
{
    /**
     * @param productId
     * @param amount
     */
    
    public int restockProduct(String name , int amount);
    public double inventoryValue();
    
}
