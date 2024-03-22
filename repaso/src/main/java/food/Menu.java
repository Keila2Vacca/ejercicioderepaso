
package food;

import java.util.ArrayList;
import values.DishType;

public class Menu {
   
private ArrayList<Dish> dishList;
    
    public Menu (){
        this.dishList = new ArrayList<>();
    }
    
     public Menu(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }
     
    public void addDish(Dish dish){
        this.dishList.add(dish);
    }
    
    public void showMenu(){
        //los enum se puede recorre con for each como un array
        for(DishType dishType : DishType.values()){
            System.out.println("*** --- " + dishType + "*** --- ");
        }
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
