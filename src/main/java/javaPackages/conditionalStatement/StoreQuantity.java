package javaPackages.conditionalStatement;

public class StoreQuantity {
 /*   1.A shop gives discount of 10% if the quantity is more than 1000 unit .
      ask user for quantity suppose,one unit will cost 20 dollar .
*/

    public void discount(int quantity) {
       // int totalcost = 0;
       // int discount = 0;
        if (quantity > 1000) {
            int totalcost = (quantity * 20);
            System.out.println("total_cost" + totalcost);
            int discount = (totalcost / 100) * 10;
            System.out.println("discount " + discount);
        } else if (quantity < 1000) {
            System.out.println("No Discount");
        }
    }
public void buySomethingWithDiscount(){
        int discount = 2400;
    System.out.println("buying some burger and pizza with the discount value" + discount);


}

    public static void main(String[] args) {
        StoreQuantity obj = new StoreQuantity();
        obj.discount(1200);
        obj.discount(900);
    }













}

