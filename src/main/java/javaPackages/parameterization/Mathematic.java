package parameterization;

public class Mathematic {

    public void add (int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[]args){
       Mathematic obj = new Mathematic();
       obj.add(10,20);
       obj.add(25, 35);
       obj.add(37,45);
       obj.add(51,65);
    }
    /*
 1. what is static in java?
    Static keyword can be applied to variables and methods.
    This belongs to the class not to the instance, but this is common to all instances.

 2. Can we call a non-static variable in static method?
     No

 3. Can a static method be called in non-static method?
     Yes

 4.  Why is the main method static?
     Because compiler need to call it without creating an object.
     Another reason is in java program compiler starts executing programs from main method.

 5.  Can static method or static variable be private?
     Yes

 6.  What is the difference between static and constance?
     Constance is a variable are fixed during compile time with value doesn't change in the runtime.
     but static variable can be changed in the runtime.
     */








}
