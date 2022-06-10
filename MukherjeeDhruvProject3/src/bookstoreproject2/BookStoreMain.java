/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstoreproject2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dhruvmukherjee
 */
public class BookStoreMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        try
        {
            BookStoreOperations store = new BookStoreOperations();
            File file = new File("endOfDay.txt");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
        
            pw.println("---------------------------------------------");
            pw.println(" ");
            pw.println("END OF DAY REPORT");
            pw.println(" ");
            pw.println("---------------------------------------------");
        
            Scanner sc = new Scanner(System.in);
            boolean open = true;
        
            
        
            while(open = true)
            {
                int employeeAcsessCode = (int)(Math.random() * 243) + 1;
                System.out.println("Employee Acsess Code: " + employeeAcsessCode );
                System.out.println("Please select from the following menu of options, by typing a number:");
                System.out.println("\t 1. Check Out");
                System.out.println("\t 2. Become a premium Member");
                System.out.println("\t 3. Become a Regular Member");
                System.out.println(" ");
                System.out.println(" Employees Only ");
                System.out.println("\t 4. Check Member data base ");
                System.out.println("\t 5. Check inventory ");
                System.out.println(" Store Officals Only (no acsess code reqired) ");
                System.out.println("\t 6. Compare inventory ");
                System.out.println("\t 7. Organize Inventory");
                int num = sc.nextInt();
                Scanner scr = new Scanner(System.in);
                switch(num) 
                {
                    // Complete a pruchase action
                    case 1:
                        System.out.println("Hello How are you today? My name is Dhruv I will be aassisting you today :)");
                        System.out.println("Are you a member?");
                   
                        String memberResponse = scr.nextLine();
                        // only if the user is a Member
                        if(memberResponse.equals("yes") || memberResponse.equals("Yes"))
                        {
                            pw.println(" ");
                            pw.println("---------------------------------------------");
                            System.out.println(" ");
                            System.out.println("How many books do we have today?");
                            //method
                            int bookNum = scr.nextInt();
                            Book newBook = new Book("book", (10 * bookNum), bookNum);
                            store.addBook(newBook);
                            store.removeBook(bookNum);
                            pw.println("Books purchased: " + bookNum);
                        
                            
                            System.out.println("How many CDs do we have today?");
                            int cdNum = scr.nextInt();
                            Cd newCD = new Cd("cd", (10 * cdNum), cdNum);
                            store.addCd(newCD);
                            store.removeCd(cdNum);
                            pw.println("Cd purchased: " + cdNum);

                            
                            System.out.println("How many DvDs do we have today?");
                            int dvdNum = scr.nextInt();
                            DVDs newDvd = new DVDs("Cd", (10 * dvdNum), dvdNum);
                            store.addDvd(newDvd);
                            store.removeDvd(dvdNum);
                            pw.println("DVD purchased: " + dvdNum);
                            
                       
                            System.out.println("Alright looks like your total will be: $" + store.printTotal(bookNum, dvdNum, cdNum));
                            int c = store.printTotal(bookNum, dvdNum, cdNum);
                        
                            System.out.println(" ");
                            System.out.println("How will you be paying today");
                            System.out.println("\t 1. Cash");
                            System.out.println("\t 2. Card");
                        
                            int paymentType = scr.nextInt();
                            Scanner scnr = new Scanner(System.in);
                            if(paymentType == 2)
                            {
                                //Scanner scnr = new Scanner(System.in);
                                System.out.println("please enter your Card Number (Must be 6 Digits)");
                                String cardNum = scnr.nextLine();
                            
                                if(cardNum.length() == 6)
                                {
                                    System.out.println(" Thank you for you purchase Have a wonderful day");
                                    pw.println("Payed Credit card: " + c);
                                }
                                else
                                {
                                    System.out.println("Wrong number Please try again");
                                }
                            }
                            else
                            {
                                pw.println("Payed cash: " + c);
                                System.out.println(" Thank you for you purchase Have a wonderful day");
                            }
                        
                            pw.println("Purchase of: $" + c);
                            pw.println("---------------------------------------------");
                            pw.println(" ");
                        
                        }
                        // If the user is not a Member 
                        else if(memberResponse.equals("no") || memberResponse.equals("No"))
                        {
                            System.out.println("Would you like to become a regular Member");
                            String regMember = scr.nextLine();
                        
                            // The user wants to become a regular member
                            if(regMember.equals("Yes")|| regMember.equals("yes"))
                            {
                                pw.println(" ");
                                pw.println("---------------------------------------------");
                                System.out.println("Okay what is your name please");
                                String regularName = scr.nextLine();
                                int memberId = (int)(Math.random()* 233) + 1;
                                RegularMember member = new RegularMember(regularName, memberId);
                                store.addRegularMember(member);
                                pw.println("New regular Member: " + regularName + " ID: " + memberId);
                                System.out.println(" ");
                                System.out.println("How many books do we have today?");
                            
                                int bookNum = scr.nextInt();
                                Book newBook = new Book("book", (10 * bookNum), bookNum);
                                store.addBook(newBook);
                                store.removeBook(bookNum);
                                pw.println("Books purchased: " + bookNum);
                        
                                System.out.println("How many CDs do we have today?");
                                int cdNum = scr.nextInt();
                                Cd newCD = new Cd("cd", (10 * cdNum), cdNum);
                                store.addCd(newCD);
                                store.removeCd(cdNum);
                                pw.println("Cd purchased: " + cdNum);
                            
                                System.out.println("How many DvDs do we have today?");
                                int dvdNum = scr.nextInt();
                                DVDs newDvd = new DVDs("Cd", (10 * dvdNum), dvdNum);
                                store.addDvd(newDvd);
                                store.removeDvd(dvdNum);
                                pw.println("DVD purchased: " + dvdNum);
                       
                                //System.out.println("Alright looks like your total will be: ");
                                //store.printTotal(bookNum, dvdNum, cdNum);
                            
                                System.out.println("Alright looks like your total will be: $" + store.printTotal(bookNum, dvdNum, cdNum));
                                int b = store.printTotal(bookNum, dvdNum, cdNum);
                                System.out.println(" ");
                                System.out.println("How will you be paying today");
                                System.out.println("\t 1. Cash");
                                System.out.println("\t 2. Card");
                            
                                int paymentType = scr.nextInt();
                            
                                if(paymentType == 2)
                                {
                                    Scanner scnr = new Scanner(System.in);
                                    System.out.println("please enter your Card Number (Must be 6 Digits)");
                                    String cardNum = scnr.nextLine();
                            
                                    if(cardNum.length() == 6)
                                    {
                                    System.out.println(" Thank you for you purchase Have a wonderful day");
                                    pw.println("Payed Credit card: " + b);
                                    }
                                    else
                                    {
                                    System.out.println("Wrong number Please try again");
                                    }
                                    
                                }   
                                else
                                {
                                    pw.println("Payed cash: " + b);
                                    System.out.println(" Thank you for you purchase Have a wonderful day");
                                }
                            
                                pw.println("Purchase of: $" + b);
                                pw.println("---------------------------------------------");
                                pw.println(" ");
                            }
                            // the user deos not want to become a member
                            else
                            {
                                pw.println(" ");
                                pw.println("---------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("How many books do we have today?");
                                //method
                                int bookNum = scr.nextInt();
                                Book newBook = new Book("book", (10 * bookNum), bookNum);
                                store.addBook(newBook);
                                store.removeBook(bookNum);
                                pw.println("Books purchased: " + bookNum);
                        
                                System.out.println("How many CDs do we have today?");
                                int cdNum = scr.nextInt();
                                Cd newCD = new Cd("cd", (10 * cdNum), cdNum);
                                store.addCd(newCD);
                                store.removeCd(cdNum);
                                pw.println("Cd purchased: " + cdNum);
                                                     
                                System.out.println("How many DvDs do we have today?");
                                int dvdNum = scr.nextInt();
                                DVDs newDvd = new DVDs("Cd", (10 * dvdNum), dvdNum);
                                store.addDvd(newDvd);
                                store.removeDvd(dvdNum);
                                pw.println("DVD purchased: " + dvdNum);
                       
                                //System.out.println("Alright looks like your total will be: ");
                                //store.printTotal(bookNum, dvdNum, cdNum);
                                System.out.println("Alright looks like your total will be: $" + store.printTotal(bookNum, dvdNum, cdNum));
                                int a = store.printTotal(bookNum, dvdNum, cdNum);
                                System.out.println(" ");
                                System.out.println("How will you be paying today");
                                System.out.println("\t 1. Cash");
                                System.out.println("\t 2. Card");
                        
                                int paymentType = scr.nextInt();
                        
                                if(paymentType == 2)
                                {
                                    Scanner scnr = new Scanner(System.in);
                                    System.out.println("please enter your Card Number (Must be 6 Digits)");
                                    String cardNum = scnr.nextLine();
                            
                                    if(cardNum.length() == 6)
                                    {
                                    System.out.println(" Thank you for you purchase Have a wonderful day");
                                    }
                                    else
                                    {
                                    System.out.println("Wrong number Please try again");
                                    }
                                    pw.println("Payed Credit card: " + a);
                                }
                                else
                                {
                                    pw.println("Payed cash: " + a);
                                    System.out.println(" Thank you for you purchase Have a wonderful day");
                                }
                                pw.println("Purchase of: $" + a);
                                pw.println("---------------------------------------------");
                                pw.println(" ");
                            }
                        
                        }
                    
                        break;
                    
                        // the user tries to become a premium memebr 
                    case 2:
                        Scanner console = new Scanner(System.in);
                        System.out.println("Hello looks like you trying to become a premium member");
                        System.out.println("the monthly fee is going to be $5.00, and you will get an update whenever we restock,"
                            + "as well as be able to skip the wait on putting your items on hold, however you will be paying "
                            + "the same ammount when checking out. is that okay? (yes / no)");
                        String pmResponse = console.nextLine();
                        // the user agrees to the membership request
                        if(pmResponse.equals("yes") || pmResponse.equals("Yes"))
                        {
                            pw.println(" ");
                            pw.println("---------------------------------------------");
                            System.out.println("What is your first and last name? (example: first last)");
                            String pmName = console.nextLine();
                            int memberId = (int)(Math.random()* 233) + 1;
                            PremiumMember pMember = new PremiumMember(pmName, memberId, 5, true);
                            store.addPremiumMember(pMember);
                            System.out.println("You have now been added to our system, your Member Id is: " + memberId);
                            System.out.println("Have a nice day :)");
                            pw.println("New Premium Member: " + pmName + " ID: " + memberId);
                            pw.println("---------------------------------------------");
                            pw.println(" ");
                        }
                        // the mmeber denies the membership request
                        else
                        {
                        System.out.println("Thats okay maybe another time have a good day :)");
                        }
  
                        break;
                    
                        // the user tries to become a regular member
                    case 3:
                        Scanner console2 = new Scanner(System.in);
                        System.out.println("Hello Looks like you are trying to beocome a Reuglar member,"
                            + "your membership is free and your perks are that you can now place items on hold"
                            + "would you like to continue (yes / no)");
                        String rmResponse = console2.nextLine();
                        // the user agrees to the membership request
                        if(rmResponse.equals("yes") || rmResponse.equals("Yes"))
                        {
                            pw.println(" ");
                            pw.println("---------------------------------------------");
                            System.out.println("What is your first and last name? (example: first last)");
                            String rmName = console2.nextLine();
                            int memberId = (int)(Math.random()* 233) + 1;
                            RegularMember rmember = new RegularMember(rmName, memberId);
                            store.addRegularMember(rmember);
                            System.out.println("You have now been added to our system, your Member Id is: " + memberId);
                            System.out.println("Have a nice day :)");
                            pw.println("New Regular Member: " + rmName + " ID: " + memberId);
                            pw.println("---------------------------------------------");
                            pw.println(" ");
                        }
                    
                        // the mmeber denies the membership request
                        else
                        {
                            System.out.println("Thats okay maybe another time have a good day :)");
                        }
                        break;
     
                    // the emplyee is trying to check the member Data Base    
                    case 4:
                        System.out.println("You have chosen to chek the member data base ");
                        System.out.println("Please Enter the employee acsess code located at the top of the menu list: " );
                        int employeeAcsess = sc.nextInt();
                        // if emplyee acsess code is correct
                        if(employeeAcsess == employeeAcsessCode)
                        {
                            System.out.println("Checking member Data Bases...");
                            System.out.println("Outputing Regular Member data base");
                            store.printRegularMemberList();
                            System.out.println("Outputting Premium Member data base");
                            store.PrintPremiumMemberList();
                            System.out.println("Data Base Search Completed");
                        }
                        // if eemplyee acsess code is incorrect
                        else
                        {
                            System.out.println("acsess denied");
                        }
                        break;
                    
                    // the emplyee is trying to check the inventory    
                    case 5:
                        System.out.println("You have chose to Check inventory");
                        System.out.println("Please Enter the employee acsess code located at the top of the menu list: " );
                        int employeeAcsess2 = sc.nextInt();
                        // if emplyee acsess code is correct
                        if(employeeAcsess2 == employeeAcsessCode)
                        {
                            System.out.println("Checking Inventory...");
                            store.printInventoryList();
                            System.out.println(" ");
                            System.out.println("Thats all");
                        }
                        // if eemplyee acsess code is incorrect
                        else
                        {
                            System.out.println("acsess denied");
                        }
                        break;
                    //compare innventory among the three products     
                    case 6:
                        System.out.println(" ");
                        System.out.println("Looks like you are trying to compare Inventory");
                        System.out.println("Please enter what you are trying to compare: ");
                        System.out.println("\t 1. Books to Dvds ");
                        System.out.println("\t 2. Books to Cds ");
                        System.out.println("\t 3. Cds to Dvds ");
                  
                        int response = sc.nextInt();
                    
                    switch (response) 
                    {
                        case 1:
                            int a = store.bookItems.get(0).compareTo(store.dvdItems.get(0));
                            if(a == 0)
                            {
                                System.out.println("There are the same amount of books and Dvds"); 
                            }
                            else if(a == 1)
                            {
                                System.out.println("There are the more amount of books than Dvds"); 
                            }
                            else
                            {
                                System.out.println("There are the less amount of books than Dvds"); 
                            }
                            break;
                        case 2:
                            int b = store.bookItems.get(0).compareTo(store.cdItems.get(0));
                            if(b == 0)
                            {
                                System.out.println("There are the same amount of books and Cds"); 
                            }
                            else if(b == 1)
                            {
                                System.out.println("There are the more amount of books than Cds"); 
                            }
                            else
                            {
                                System.out.println("There are the less amount of books than Cds"); 
                            }
                            break;
                        default:
                            int c = store.cdItems.get(0).compareTo(store.dvdItems.get(0));
                            if(c == 0)
                            {
                                System.out.println("There are the same amount of CDs and DVds"); 
                            }
                            else if(c == 1)
                            {
                                System.out.println("There are the more amount of CDs than Dvds"); 
                            }
                            else
                            {
                                System.out.println("There are the less amount of CDs than Dvds"); 
                            }
                            break;
                    }
                        System.out.println("Thank you for checking comparing the Inventory");
                    
                        break;
                    // restock the inventor y and you can calulate the total of the inventory
                    case 7:
                        System.out.println(" ");
                    
                        System.out.println("\t 1. Restock Inventory ");
                        System.out.println("\t 2. Calculate total inventory value ");
                        int option7 = sc.nextInt();
                    
                        if(option7 == 1)
                        {
                            System.out.println("What would you like to restock? (book, dvd, cd) ");
                            String name = scr.nextLine();
                            System.out.println("How much would you like to restock this product too? (100 - 1000)");
                            int number = scr.nextInt();
                            store.restockProduct(name, number);
                            System.out.println("Your item has been restocked you can check the amount by clicking option 5 in the main menu");
 
                        }
                        else if(option7 == 2)
                        {
                            System.out.println("Looks like you are trying to calculate the toal inventory value");
                            System.out.println("The total inventory value is: " + store.inventoryValue());
                        
                        }
                    
                    
                        break;
                    // if a number that i snot in the meb=nue has been entered    
                    default:
                        System.out.println("you need to enter a valid option");
                        break;
                            
                    }
                    // case is compelted allows to go back to main menue or close the store
                    System.out.println(" ");
                    System.out.println("\t 1. Return to main menu"); // returns to main menu
                    System.out.println("\t 2. Close the store"); // ends program
                    int status = sc.nextInt();
                    if (status == 1) 
                    {
                    open = true;
                    }   
                    else
                    {
                        Scanner aScanner = new Scanner(System.in);
                        Scanner aScanner2 = new Scanner(System.in);
                        pw.close();
                        FileOutputStream fs = new FileOutputStream("BookInventoryDay2.csv");
                        PrintWriter outFS = new PrintWriter(fs);
                        System.out.println("You will have to update the inventoruy list.");
                        System.out.println("You will be asked 3 different ");
                        outFS.println("Product Name, Price, Inventory amount");
                        for(int i = 0; i < 3; i ++)
                        {
                        System.out.println("Please enter your Product name ex(DVD, Book, Cd): ");
                        String prodName = aScanner2.nextLine();
                        System.out.println("Please enter your Product price in numbers: ");
                        int ProdPrice = aScanner.nextInt();
                        System.out.println("Please enter your inventory amount: ");
                        int prodInv = aScanner.nextInt();
                        //csv file statment 
                        outFS.println(prodName + "," + ProdPrice + "," + prodInv);
 
                    }
                
                    outFS.close();
                    fs.close();
                
                
                    open = false;
                    System.out.println("End of day report has been updated. Inventory list has been updated");
                    System.out.println("The bookstore is now closed!");
                    break;
                
                }
            
            
            }//endLoop
        }catch(InputMismatchException e)
        {
            System.out.println("you have entered the wrong value please restart the System. ");
        }catch(FileNotFoundException e)
        {
            System.out.println("The file you are trying to reach cannot be found please check the file name");
        }catch(IOException e)
        {
            System.out.println("IOexception has been found please check your responses");
        }catch(Exception e)
        {
            System.out.println("The System has caught an exeption");
        }finally
        {
            System.out.println("Please restart the application");
        }   
        

    }//endMain 
}//endClass
