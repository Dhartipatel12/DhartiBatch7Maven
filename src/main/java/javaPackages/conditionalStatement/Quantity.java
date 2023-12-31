package javaPackages.conditionalStatement;

import java.util.Scanner;

public class Quantity {
 /* 1.A shop gives discount of 10% if the cost of purchased quantity is more than 1000 unit .
      ask user for quantity suppose,one unit will cost 20 dollar .
 */


    public void discount() {

        System.out.println("Enter the quantity " );
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        int total_cost = quantity * 20;
        if (quantity>1000){
            int discount =  ((total_cost/100)*10);
            System.out.println(discount);
        }
        else{
            System.out.println("No discount");
        }


    }






    public static void main(String[] args) {
    Quantity obj = new Quantity();
    obj.discount();

    }
}