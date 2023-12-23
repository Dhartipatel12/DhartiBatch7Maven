package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    /* Map is an Interface but HashMap is a class.
       HashMap implements Map
       HashMap can hold two datatypes
       Hashmap is a key value pairs
       One object is used a key and another is used as value
       The key should be Unique
     */


    public void HashMapPractice(){
      Map<Integer, String> cars = new HashMap<>();

      cars.put(1,"Toyota");// Here 1 is Key and Toyota is a value
      cars.put(2,"Nissan");
      cars.put(3,"BMW");
      cars.put(4,"Lexus");
      cars.put(5,"Tesla");
      cars.put(5,"Kia");
      cars.put(6,"Honda");
      cars.put(7,"Honda");

        System.out.println(cars.get(3));
        System.out.println(cars);

        cars.remove(7);
        System.out.println(cars);
        cars.put(7,"Honda");


        boolean boo= cars.containsKey(3);
        System.out.println(boo);

       boolean ford = cars.containsValue("Ford");
       System.out.println(ford);
    }
public void hashMapPractice2(){
  Map<String, String> capitolCity= new HashMap<>();

  capitolCity.put("India","Delhi");
  capitolCity.put("Pakistan","Islamabad");
  capitolCity.put("Bangladesh","Dhaka");
  capitolCity.put("Australia","Sydney");
  capitolCity.put("UnitedKingdom","London");

  Map<String, Integer>Zipcode= new HashMap<>();
  Zipcode.put("Sadia",11223);
  Zipcode.put("Fayza",12345);
  Zipcode.put("Lota",28749);
  Zipcode.put("Jannat",13579);
  Zipcode.put("Shifat",45612);
}



  public static void main(String[] args) {
    HashMapDemo ref = new HashMapDemo();

  }
}
