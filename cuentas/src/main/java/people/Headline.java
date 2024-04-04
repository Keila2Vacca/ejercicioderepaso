
package people;

public class Headline {
    private String name;
    private int id;
    private double consignedMoney ;
    private double moneyToWithdraw;
    private double availableMoney;
    private double totalMoney;

    public Headline(String name, int id, double consignedMoney, double moneyToWithdraw, double availableMoney) {
        this.name = name;
        this.id = id;
        this.consignedMoney = consignedMoney;
        this.moneyToWithdraw = moneyToWithdraw;
        this.availableMoney = availableMoney;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

  

    public double getConsignedMoney() {
        return consignedMoney;
    }

    public void setConsignedMoney(double consignedMoney) {
        this.consignedMoney = consignedMoney;
    }

    public double getMoneyToWithdraw() {
        return moneyToWithdraw;
    }

    public void setMoneyToWithdraw(double moneyToWithdraw) {
        this.moneyToWithdraw = moneyToWithdraw;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney + totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }


    public void Withdrawals () {
        if( this.moneyToWithdraw > this.totalMoney){
            System.out.println("Lo sentimos la cantidad de dinero a retirar es mayor a la disponible");
            
        }
        else {
            this.totalMoney = this.getTotalMoney() - this.getMoneyToWithdraw();
            System.out.println("Retiro exitoso, su saldo ahora es: " + this.totalMoney );
            
        } 
        
    }
    public void ConsignMoney(){
        if( this.getConsignedMoney() < 0){
            System.out.println("Lo sentimos la cantidad de dinero a consignar no es valida");
            
        }
        else {
            this.totalMoney = this.getAvailableMoney() + this.getConsignedMoney();
            System.out.println("Consignación exitosa, su saldo ahora es: " + this.totalMoney );
            
        }
    }    
}
