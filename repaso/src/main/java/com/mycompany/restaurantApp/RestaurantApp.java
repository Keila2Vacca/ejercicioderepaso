
package com.mycompany.restaurantApp;

import food.Dish;
import food.Menu;
import java.util.Scanner;
import people.Clients;
import people.Customer;
import values.CustomerRole;
import values.DishType;

public class RestaurantApp {

    public static void main(String[] args) {
         Scanner option = new Scanner(System.in);
         
        Customer student = new Customer(CustomerRole.STUDENT, "ert","fulanito de tal");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE,"hgtedk","sultanito de tal");
        administrative.sellFood();
        
        Menu menu = new Menu();
      
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevo Fritos", "Huevos, sal y pimienta", 2400 , 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Papa rellena", "Huevos, carne y papa", 2400 , 14);
        Dish lunch1 = new Dish(DishType.LUNCH, "Carne asada", "Arroz, papa, Patacones y ensalada", 2400 , 28);
        Dish lunch2 = new Dish(DishType.LUNCH, "Cerdo en salsa blanca", "Arroz, pastas, papas fritas y sopa", 2400 , 43);
        Dish dinner1 = new Dish(DishType.DINNER, "Pizza", "Papitas firtas y gaseosa", 2400 , 45);
        Dish dinner2 = new Dish(DishType.DINNER, "Panqueques con nutella", "Queso y chocolate", 2400 , 67);
        
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        menu.addDish(lunch2);
        menu.addDish(dinner1);
        menu.addDish(dinner2);
        
        
        System.out.println("¿Qué tipo de comida desea comprar?");
        System.out.println("1.  Desayuno");
        System.out.println("2.  Almuerzo");
        System.out.println("3.  Cena");
        int a = option.nextInt();
        
        switch(a){
            case 1 -> 
                System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
            case 2 -> 
                System.out.println(menu.getDishesPerType(DishType.LUNCH));
            case 3 -> 
                System.out.println(menu.getDishesPerType(DishType.DINNER));
            default -> 
                System.out.println("Error");
        }
    }
}
