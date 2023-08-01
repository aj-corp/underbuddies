package com.pack1;

import com.pack2.*;
import lombok.Data;

@Data
public class Customer {
    // Customer Details + the action that a customer can perform  (state behavior)
    // Common Properties , different values
     // Modifier -> private, public, protected, default
    protected   int id;
     protected String name;
     protected Communication communication;
     protected String deliveryMethod;
     protected Payment payment;
     protected long accountBalance;
     protected int loyaltyPoints;
     protected boolean isBlocked;
     protected Gender gender;

     protected Country country;

    private static long numberOfCustomers = 0;

    public Customer(){

    }
    public Customer(int id, String name){
        this.name = name;
        this.isBlocked = false;
        this.id = id;

        numberOfCustomers++;
    }


    public Customer(int id){
        isBlocked = false;
        this.id = id;
        numberOfCustomers++;
    }

    public boolean updateTheAccountBalance(long addedBalance){
        // Atleast of $100 to be loaded every time
        if(isBlocked){
            return false;
        }
        if("COD".equals(deliveryMethod)){
            return false;
        }
        if(addedBalance <= 100){
            return false;
        }
        this.accountBalance = this.accountBalance + addedBalance;
        return true;
    }

    public Long getAccountBalance(String passcode){
        if(passcode.equals("2356")){
            return this.accountBalance;
        }
        return null;
    }



     boolean selfBlock(){
         isBlocked = true;
         return isBlocked;
     }

     boolean doIhaveSufficientBalance(){
         if("COD".equals(deliveryMethod)){
             return true;
         }
         return accountBalance > 500;
     }
     boolean unBlock(){
         if(!country.equals("Russia")) {
             isBlocked = false;
         }
         return isBlocked;
     }



     public static long getNumberOfCustomers(){
        return numberOfCustomers;
     }

     public String toString(){
        return id +":"+name;
     }


 }
