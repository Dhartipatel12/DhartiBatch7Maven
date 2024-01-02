package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

  /* Set is an Interface and HashSet is a class. HashSet implements set
     Hashset does not allow duplicate value
     HashSet does not follow insertion order
  */

public void HashSetPractice() {
    HashSet<String> cars = new HashSet<>();

    cars.add("Rickshaw");
    cars.add("Murir Tin");
    cars.add("Leguna");
    cars.add("Tomtom");
    cars.add("CNGcar");
    cars.add("Tomtom");


    int carSize = cars.size();
    System.out.println(carSize);

    System.out.println(cars);

    boolean honda = cars.contains("Honda");
    System.out.println(honda);

    // Add integer value for set and try to use Collections class.

    Set<Integer> Num = new HashSet<>();

    Num.add(1);
    Num.add(2);
    Num.add(13);
    Num.add(14);
    Num.add(50);
    Num.add(61);

    for (int i = 1;i<20; i ++){
        if (Num.contains(i)){
            System.out.println(i + "is there");
        }
        else {
            System.out.println(" ");
        }
        System.out.println();
    }

}

    public static void main(String[] args) {
      HashSetDemo ref = new HashSetDemo();
      ref.HashSetPractice();
    }

}
