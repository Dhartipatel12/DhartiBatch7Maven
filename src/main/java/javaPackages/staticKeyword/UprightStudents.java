package staticKeyword;

 public class UprightStudents {
     // instance variables
     String name;
     Character ID;
     String Group;
     String Batch;

    /*
    Class -- UprightStudents-- name , id , group , batch -- Properties
    Objects -- Sadia, Keya , Diksha

  */

     public static void main(String[] args) {
         UprightStudents sadia = new UprightStudents();// created an object of the class. that means I instantiated the class.
         sadia.name = "Sadia";
         sadia.ID = '1';
         sadia.Group = "Java";
         sadia.Batch = "7";

         UprightStudents keya = new UprightStudents();// created an object of the class. that means I instantiated the class.
         keya.name = "Keya";
         keya.ID = '2';
         keya.Group = "Selanium";
         keya.Batch = "6";

         UprightStudents Diksha = new UprightStudents();// created an object of the class. that means I instantiated the class.
         Diksha.name = "Diksha";
         Diksha.ID = '3';
         Diksha.Group = "Jenkin";
         Diksha.Batch = "5";
     }

 }




