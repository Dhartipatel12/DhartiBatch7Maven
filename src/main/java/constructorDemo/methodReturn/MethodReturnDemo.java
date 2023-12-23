package constructorDemo.methodReturn;

import constructorDemo.ConstructorPractice;

public class MethodReturnDemo {

 public void location(){
     System.out.println("hello");
 }

  public String location1(){
     String location = "Texas";
     return "Hello";
  }

  public int zipcode(){
     int myZip = 12345;
     return 12345;

  }

    public static void main(String[] args) {
        MethodReturnDemo obj = new MethodReturnDemo();
        obj.location();
        obj.zipcode();
        System.out.println(obj.location1());
        int myZipfromClass= obj.zipcode();
        System.out.println(obj.zipcode());


        ConstructorPractice obj1= new ConstructorPractice("Dharti",101, 7);
        String newname=obj1.name;
        System.out.println(obj1.id);
        System.out.println(obj1.batch);
    }



}
