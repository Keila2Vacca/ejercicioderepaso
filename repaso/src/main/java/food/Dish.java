
package food;

import values.DishType;


public class Dish {
    DishType type;
    String name;
    String ingredients;
    int price;
    int qty;

    public Dish(DishType type, String name, String ingredients, int price, int qty) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.qty = qty;
    }

      public DishType getType() {
        return this.type;
    }

    public int getPrice(double desc) {
        return (int) Math.ceil(price*desc);
    }
    

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    
}
