package bookstoreproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dhruvmukherjee
 */
public class PremiumMember extends Person
{
    //private String name;
    //private int memberId;
    private int monthlyPayment;
    private boolean isPayed;
/**
 * 
 * @param name
 * @param memberId 
 */
    public PremiumMember(String name, int Id, int monthlyPayment, boolean isPayed) {    
        super(name, Id);
        //this.name = name;
        //this.memberId = memberId;
        this.monthlyPayment = monthlyPayment;
        this.isPayed = isPayed;
    }


    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public boolean isIsPayed() {
        return isPayed;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    
    
    
}
