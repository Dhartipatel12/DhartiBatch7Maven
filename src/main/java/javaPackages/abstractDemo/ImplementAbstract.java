package javaPackages.abstractDemo;

public class ImplementAbstract extends AbstractA{



    public void placeOrder(){
       // Connect with the bank server
       // verify info
       // return positive or negative response

       // emailMessage();
        super.cardInfo();
        System.out.println(cardNo);
        System.out.println(customerName);
        System.out.println(cvvNo);
        System.out.println(billingAddress);
        System.out.println(exp);
        System.out.println("My order has been placed");
    }


    public void emailMessage() {
        System.out.println("Your order has been Successful");
        placeOrder();
    }


    public static void main(String[] args) {
        ImplementAbstract obj = new ImplementAbstract();
       // obj.emailMessage();
        obj.placeOrder();

    }



}
