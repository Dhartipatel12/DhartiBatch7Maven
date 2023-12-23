package accessModifier;

public class Access1 {

 public int hours = 24;// is accessible throughout the project.
 private int minutes=60;// is accessible only its own class
 String day="Tuesday";// no access modifier is accessible within the package
 protected int year = 365;//it can be used in other package but needs inheritance.



 public void printhours(){
     System.out.println("This is public method");
 }








    public static void main(String[] args) {
        Access1 obj = new Access1();
        System.out.println(obj.hours);
        System.out.println(obj.minutes);
        System.out.println(obj.day);
        System.out.println(obj.year);
    }






}
