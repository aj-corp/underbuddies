package com.pack1;

import com.pack2.Communication;
import com.pack2.Country;
import com.pack2.Gender;
import com.pack2.Payment;

public class RetailCustomer {
    private  int id;
    private String name;
    private Communication communication;
    private String deliveryMethod;
    private Payment payment;
    private long accountBalance;
    private int loyaltyPoints;
    private boolean isBlocked;
    private Gender gender;

    private Country country;
}
