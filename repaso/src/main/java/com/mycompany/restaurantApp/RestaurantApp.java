
package com.mycompany.restaurantApp;

import people.Customer;
import values.CustomerRole;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "ert","fulanito de tal");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE,"hgtedk","sultanito de tal");
        administrative.sellFood();
    }
}
