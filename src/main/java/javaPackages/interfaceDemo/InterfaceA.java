package javaPackages.interfaceDemo;

public interface InterfaceA {
    /* Interface is a Process when Hiding the implementation
       showing only functionality.
   //  Interface class cannot be instantiated.
   //  Interface can be 100% abstraction.
   //  Abstract can hold Only abstract methods.
   // In interface the variables are final by default.
*/
    int cardNo = 244535353;
    String customerName = "Dharti";
    int cvvNo = 921;
    String billingAddress = "123 South St";
    int exp = 1236;

    public void placeOrder();

    public void emailMessage();




}
