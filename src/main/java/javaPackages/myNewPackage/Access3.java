package myNewPackage;

import accessModifier.Access1;

public class Access3 extends Access1{

    public int hours = 24;// is accessible throughout the project.
    private int minutes=60;// is accessible only its own class
    String day="Tuesday";// no access modifier is accessible within the package
    protected int year = 365;//it can be used in other package but needs inheritance.



    public void printhours(){
        System.out.println("This is public method");
    }
    public void printMinutes(){
        System.out.println("This is private method");
    }
    public void printday(){
        System.out.println("This is package private access modifiers");
    }
    public void printyear(){
        System.out.println("This is a Protected method");
    }




    public static void main(String[] args) {
      Access3 Obj = new Access3();
      // Access1 Obj = new Access1();
        System.out.println(Obj.hours);
        System.out.println(Obj.minutes);
        System.out.println(Obj.day);
        System.out.println(Obj.day);
        System.out.println(Obj.year);
    }









}
