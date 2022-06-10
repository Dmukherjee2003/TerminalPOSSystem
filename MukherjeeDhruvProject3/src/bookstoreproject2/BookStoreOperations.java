/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dhruvmukherjee
 */
public class BookStoreOperations implements BookStoreSpecification
{
    private String customerName;
    private String currentDate;
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<Cd> cdList = new ArrayList<Cd>();
    private ArrayList<DVDs> dvdList = new ArrayList<DVDs>();
    private ArrayList<PremiumMember> pMemberList = new ArrayList<PremiumMember>();
    private ArrayList<RegularMember> rMemberList = new ArrayList<RegularMember>();
    public ArrayList<Book> bookItems = new ArrayList<>();
    public ArrayList<DVDs> dvdItems = new ArrayList<>();
    public ArrayList<Cd> cdItems = new ArrayList<>();
    
/**
 * 
 */
    public BookStoreOperations() throws FileNotFoundException, IOException 
    {
        String path = "BookInventoryDay1";
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Integer> inventory = new ArrayList<>();    
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = " ";
        br.readLine();
        
        while((line = br.readLine()) != null)
        {
            String[] values = line.split(",");
            names.add(values[0]);
            price.add(Double.parseDouble(values[1]));
            inventory.add(Integer.parseInt(values[2]));
            
        }
        
        bookItems.add(new Book(names.get(0),price.get(0), inventory.get(0)));
        dvdItems.add(new DVDs(names.get(1),price.get(1), inventory.get(1)));
        cdItems.add(new Cd(names.get(2),price.get(2), inventory.get(2)));
    }
/**
 * 
 * @return 
 */
    public String getCustomerName() {
        return customerName;
    }
/**
 * 
 * @param customerName 
 */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
/**
 * 
 * @return 
 */
    public String getCurrentDate() {
        return currentDate;
    }
/**
 * 
 * @param currentDate 
 */
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
/**
 * 
 * @param object 
 */
    public void addRegularMember(RegularMember object)
    {
        rMemberList.add(object);
    }
/**
 * 
 * @param object 
 */
    public void addPremiumMember(PremiumMember object)
    {
        pMemberList.add(object);
    }
/**
 * 
 */    
    public void printRegularMemberList()
    {
        rMemberList.add(new RegularMember("Jhon doe", 1));
        rMemberList.add(new RegularMember("Zack Doyle", 2));
        rMemberList.add(new RegularMember("Pranav Joshi", 3));
        rMemberList.add(new RegularMember("Dhwani Wadhwa", 4));
        rMemberList.add(new RegularMember("Nithin Chatangi", 5));
        rMemberList.add(new RegularMember("James Lloyd", 6));
        
        for(int i = 0; i < rMemberList.size(); i++ )
        {
            System.out.println((i + 1) + ") " + rMemberList.get(i).getName());
        }
    }
/**
 * 
 */    
    public void PrintPremiumMemberList()
    {
        pMemberList.add(new PremiumMember("Vance Hayes", 1, 5, true));
        pMemberList.add(new PremiumMember("Tommy Cooper", 2, 5, false));
        pMemberList.add(new PremiumMember("Colten Goodman", 3, 5, true));
        pMemberList.add(new PremiumMember("Orlando Olsen", 4, 5, false));
        pMemberList.add(new PremiumMember("Coara Schwartz", 5, 5, false));
        pMemberList.add(new PremiumMember("Jordyn Mccall", 6, 5, true));
        pMemberList.add(new PremiumMember("Lilian Neal", 7, 5, true));
        
        for(int i = 0; i < pMemberList.size(); i++ )
        {
            System.out.println((i + 1) + ") " + pMemberList.get(i).getName() + " Has paid: " + pMemberList.get(i).isIsPayed());
        }
    }
/**
 * 
 * @param object 
 */    
    public void addBook(Book object)
    {
        bookList.add(object);
    }
/**
 * 
 * @param object 
 */
    public void addDvd(DVDs object)
    {
        dvdList.add(object);
    }
/**
 * 
 * @param object 
 */
    public void addCd(Cd object)
    {
        cdList.add(object);
    }
/**
 * 
 * @param bookNum
 * @param DvdNum
 * @param CdNum 
 */   
    public int printTotal(int bookNum, int DvdNum, int CdNum)
    {
        int total = 0;
        int bookTotal = 0;
        int cdTotal = 0;
        int dvdTotal = 0;
        
        for(int i = 0 ; i < bookList.size() ; i++)
        {
            bookTotal += (bookList.get(i).getPrice() * bookNum);
        }
        for(int i = 0 ; i < dvdList.size() ; i++)
        {
            bookTotal += (dvdList.get(i).getPrice() * DvdNum);
        }
        for(int i = 0 ; i < cdList.size() ; i++)
        {
            bookTotal += (cdList.get(i).getPrice() * CdNum);
        }
        
        total = bookTotal + dvdTotal + cdTotal;
        
        return total;
    }
/**
 * 
 */    
    public void printInventoryList()
    {
        int numBooks = 0;
        int numCds = 0;
        int numDvds = 0;
        for(int i = 0; i < bookItems.size(); i++)
        {
            numBooks += bookItems.get(i).getInventory();
        }
        for(int i = 0; i < bookItems.size(); i++)
        {
            numCds += cdItems.get(i).getInventory();
        }
        for(int i = 0; i < bookItems.size(); i++)
        {
            numDvds += dvdItems.get(i).getInventory();
        }
        
        System.out.println(" The number of books in inventory is: " + numBooks );
        System.out.println(" ");
        System.out.println(" The number of Cds in inventory is: " + numCds );
        System.out.println(" ");
        System.out.println(" The number of DvDs in inventory is: " + numDvds );
        
    }
/**
 * 
 * @param num 
 */    
    public void removeBook(int num)
    {
        for(int i = 0; i < bookItems.size(); i++)
        {
         int inv = bookItems.get(i).getInventory();
         inv = (int)(inv - num);
         bookItems.get(i).setInventory(inv);
        }
        
    }
/**
 * 
 * @param num 
 */   
    public void removeDvd(int num)
    {
        for(int i = 0; i < dvdItems.size(); i++)
        {
         int inv = dvdItems.get(i).getInventory();
         inv = (int)(inv - num);
         dvdItems.get(i).setInventory(inv);
        }
    
    }
/**
 * 
 * @param num 
 */   
    public void removeCd(int num)
    {
        for(int i = 0; i < cdItems.size(); i++)
        {
         int inv = cdItems.get(i).getInventory();
         inv = (int)(inv - num);
         cdItems.get(i).setInventory(inv);
        }
    
    }

    @Override
    public int restockProduct(String name, int amount) 
    {
       if(name.equals("book"))
       {
         this.bookItems.get(0).setInventory(amount);
         return bookItems.get(0).getInventory();
       }
       else if(name.equals("dvd"))
       {
           this.dvdItems.get(0).setInventory(amount);
           return dvdItems.get(0).getInventory();
       }
       else if(name.equals("cd"))
       {
           this.cdItems.get(0).setInventory(amount);
           return cdItems.get(0).getInventory();
       }
       else
       {
           return 0;
       }
       
    }

    @Override
    public double inventoryValue() 
    {
        
      
        double bookValue = (bookItems.get(0).getInventory() * bookItems.get(0).getPrice());
        double dvdValue = (dvdItems.get(0).getInventory() * dvdItems.get(0).getPrice());
        double cdValue = (cdItems.get(0).getInventory() * cdItems.get(0).getPrice());
        
        return bookValue + dvdValue + cdValue;
        
        
        
    }
}