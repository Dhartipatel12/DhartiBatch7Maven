package javaPackages.abstractDemo;

public abstract class AbstractA {
/*  Abstract is a Process when Hiding the implementation
    showing only functionality.
//  Abstract class cannot be instantiated.
//  Abstract class can be 0-100% abstraction.
// Abstract class can hold abstract and non-Abstract methods.
*/
    int cardNo;
    String customerName;
    int cvvNo;
    String billingAddress;
    int exp;




 public abstract void placeOrder();

 public abstract void emailMessage();

public void cardInfo(){

  cardNo =244535353;
  customerName= "Dharti";
  cvvNo= 921;
  billingAddress= "123 South St";
  exp=1236;



}

    public static void main(String[] args) {
 // Abstract obj= new AbstractA();
 // Obj.placeOrder();
    }



}
