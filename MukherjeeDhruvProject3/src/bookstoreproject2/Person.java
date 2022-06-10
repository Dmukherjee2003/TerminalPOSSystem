package bookstoreproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dhruvmukherjee
 */
public class Person 
{
    private String name;
    private int Id;

    public Person(String Name, int Id) 
    {
        this.name = Name;
        this.Id = Id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String Name)
    {
        this.name = Name;
    }

    public int getId() 
    {
        return Id;
    }

    public void setId(int Id) 
    {
        this.Id = Id;
    }
    
    
    
    
}
