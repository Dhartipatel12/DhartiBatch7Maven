package stringFunction;

import java.sql.SQLOutput;

public class StringToInt {

 public static void stringToInt(){
 // int a = 200;
 //    System.out.println(a + 100);

  String dollar = "200"; // "Dharti" instead of number is called Number format Exceptions
     System.out.println(dollar + 100);
     int newDollar = Integer.valueOf(dollar);
     System.out.println(newDollar+100);
 }


    public static void main(String[] args) {
    stringToInt();
    }






}
