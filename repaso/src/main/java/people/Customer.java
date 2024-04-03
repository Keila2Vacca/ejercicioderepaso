
package people;

import values.CustomerRole;

public class Customer {
   private CustomerRole role;
   private String id;
   private String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
   

    public String getId() {
        return id;
    }

    public CustomerRole getRole() {
        return role;
    }
    

   public void sellFood(){
       if(this.role != CustomerRole.ADMINISTRATIVE){
           System.out.println("Usted no tiene permiso para vender");
       return;
       }
       System.out.println("Ya lo atiendo hijo");
   }
}
