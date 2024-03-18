
package food;

import java.util.ArrayList;

public class Menu {
   
private ArrayList<Dish> dishList;
    
    public Menu (){
        this.dishList = new ArrayList<>();
    }
    
     public Menu(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }
     
    
    public ArrayList<String> getDishesPerType (DishType dishType) {
     //ArrayList<Dish> foundDishes = new ArrayList<>();
     ArrayList<String> foundDishes = new ArrayList<>();
      
      for (Dish dish : dishList){
          if(dish.getType() == dishType){
              foundDishes.add(dish.getName());
          }
      }
    return foundDishes;
    }
     
}
