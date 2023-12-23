package dataTypePackage;

public class CarsDataType {

 String name = "Honda";
 short year = 2023;
 String color = "Blue";
 boolean backCamera = true;
 String Model= "CR-V";
 byte wheels= 4; //can hold data from 0-127
 int regNo = 8205842; // can hold data 0-2147483647
 long vinNo = 12345678910L;
 float mileage = 5000.999f;


 /*
 byte -- 0-127
 short-- 0-32,767
 int-- 0- 2147483647
  */
 public static void main(String[] args) {
     short id = 101;
     System.out.println(id);

     byte roll= (byte) 31379;  //type casting
     System.out.println(roll);

     int myRegNo= 4845454;
 }






}
