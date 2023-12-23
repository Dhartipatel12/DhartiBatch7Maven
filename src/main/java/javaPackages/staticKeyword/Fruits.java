package staticKeyword;

public class Fruits {
  // instance variable
  /*
  Class - Fruits - name, color, size, vitamin--properties
  Objects - Banana,Apple,Mango, Orange,Avocado,Grape.

  Class- Vegetables-- name,color, size, vitamin, nutritions,price.-properties
  Objects - Tomatoes,Cucumber,Potato,Carrots,Cabbage.

  Class - Cats - size, color, tail, eyes - properties
  Objects - my cat, your cat, shorna's cat,Diksha's cat

  Class - Students - name,id, group,batch - properties
  Objects- sadia,Dharti,Diksha, Jannat,Keya

*/
 /*
    Variables has three parts---
    1.declare the variable
    2.initialize the variable
    3.use the variable.

*/
    String name; // instance variables/properties // Declaring the variable
   String color; // Declaring the variable
   static String size ="Small"; // static variables and method belongs to class not objects
   String vitamin; // Declaring the variable


   // When we see the value of variable/variables are common to all objects
    // one method can be called from other method


   public static void hello (){
       String location = "USA"; // local variable // declare an initialize
       System.out.println(location);// use the variable
       // state = "East";
   }

   public void price(int amount){
       System.out.println(amount);
       hello();
   }

    public static void main(String[] args) {
        Fruits banana = new Fruits();// created an object of the class. that means I instantiated the class.
        banana.name = "banana";   // initializing/defining the variable// banana is a reference variable or obj.
        banana.color = "yellow";  // initializing/defining the variable
        size = "small";
        banana.vitamin = "c";     // initializing/defining the variable

        System.out.println(banana.name); // using the variable
        System.out.println(banana.color);// using the variable
        System.out.println(size);    // using the variable
        System.out.println(banana.vitamin); // using the variable
        hello();// calling the method
        banana.price(20);
        System.out.println("----------------------------");


        Fruits Apple = new Fruits();// created an object of the class. that means I instantiated the class.
        Apple.name = "Apple";       // initializing/defining the variable
        Apple.color = "Red";        // initializing/defining the variable
        size = "small";
        Apple.vitamin = "c";        // initializing/defining the variable

        System.out.println(Apple.name);  // using the variable
        System.out.println(Apple.color); // using the variable
        System.out.println(size);        // using the variable
        System.out.println(Apple.vitamin); // using the variable
        hello();
        System.out.println("-----------------------------");

        Fruits Orange = new Fruits();// created an object of the class. that means I instantiated the class.
        Orange.name = "Orange";      // initializing/defining the variable
        Orange.color = "Orange";     // initializing/defining the variable
        size = "small";
        Orange.vitamin = "c";        // initializing/defining the variable

        System.out.println(Orange.name); // using the variable
        System.out.println(Orange.color);// using the variable
        System.out.println(size);        // using the variable
        System.out.println(Orange.vitamin);// using the variable
        hello();
        System.out.println("-----------------------------");
    }





    }
