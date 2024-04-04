
package com.mycompany.cuentas;

import people.Headline;


public class Cuentas {

    public static void main(String[] args) {
        Headline client1= new Headline("Pedrito", 1346787, 300000,100000, 70000);
        Headline client2= new Headline("Fulanito", 76471691, 50000, 10000, 60000);
        Headline client3= new Headline("Sultanito", 78765413, 700000, 2000, 7000);
        
        
        System.out.println("  ");
        System.out.println("titular: " + client1.getName()); 
        System.out.println("Identificado con id: " + client1.getId());
        client1.ConsignMoney();
        client1.Withdrawals();
        
        System.out.println("  ");
        System.out.println("titular: " + client2.getName()); 
        System.out.println("Identificado con id: " + client2.getId());
        client2.ConsignMoney();
        client2.Withdrawals();
        
        System.out.println("  ");
        System.out.println("titular: " + client3.getName()); 
        System.out.println("Identificado con id: " + client3.getId());
        client3.ConsignMoney();
        client3.Withdrawals();
    }
}
