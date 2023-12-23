package finalKeyword;

public  class FinalDemo {

 /*Final Keyword can be used before Class,Method and Variables.
   final class cannot be extended.This class cannot have any child
   final variable cannot be modified the value is final.
   final method cannot be overridden.

   Override-- is a part of oop concept
   Dharti and Shifat -- they both of them work in the same project
  */

  final String name = "Dharti";

    /**
     * Created by Shifat
     */


public  void printName(){
    System.out.println("print name");

}

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
       // obj.name = "Dharti Patel";
        System.out.println(obj.name);
    }


}
