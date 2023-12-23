package oop.polymorphismDemo;

public class OverloadingDemo {
/* overloading can be Achieved by the same method name but
   1. different number of parameter
   2, different data type
   3. different order of parameter
   Overloading is called compiletime polymorphism
 */

    public void add (int a, int b){

        System.out.println(a+b);
    }

    public void add (int a ,int b,int c){
        System.out.println(a+b+c);
    }

   public void add (int a, float b){
       System.out.println(a+b);
   }

   public void add (float b, int a){
       System.out.println(b+a);
   }


    public static void main(String[] args) {
      OverloadingDemo Obj=new OverloadingDemo();
      Obj.add(2,3);
      Obj.add(2,3,5);
      Obj.add(2,5.45f);
      Obj.add(5.45f,4);

    }






}
