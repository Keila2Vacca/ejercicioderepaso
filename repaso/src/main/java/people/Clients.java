
package people;

import java.util.ArrayList;
import values.CustomerRole;


public class Clients {
     private ArrayList<Customer> peoplelist;
    
    public Clients() {
        this.peoplelist = new ArrayList<>();
    }
    
    public void addPeople(Customer people){
        this.peoplelist.add(people);
    }
    
    public double getPricePerRole(String id){
        for(Customer people: peoplelist){
            if(id.equals(people.getId())){
                if(people.getRole()==CustomerRole.STUDENT){
                    return 0.3428;
                }else{
                    return 1;
                }
            }
        }
        return 1;
    }
}
