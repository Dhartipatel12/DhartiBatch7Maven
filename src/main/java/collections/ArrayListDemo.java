package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
/* List is an interface and Arraylist implements List.
   ArrayList is not fixed.it is dynamic.
   Arraylist can hold duplicate value.
   ArrayList Always follow Insertion order
 */
   public void arrayListPractice() {

       //  String name[]={"Dharti","Sadia","Shifat","Fayza"};
       //     System.out.println(name.length);

       ArrayList<String> name = new ArrayList<>();

       boolean isEmptyOrNotBeforeAdd = name.isEmpty();
       System.out.println(isEmptyOrNotBeforeAdd);
       name.add("Dharti");
       name.add("Sadia");
       name.add("Lota");
       name.add("Fayza");


       boolean isEmptyOrNotAfterAdd= name.isEmpty();
       System.out.println(isEmptyOrNotBeforeAdd);

       System.out.println(name);
       System.out.println(name.size());

       name.add("Shifat");
       System.out.println(name);

       name.remove("Sadia");
       System.out.println(name);

       name.add(1,"Sadia");
       System.out.println(name);


 //      for(int i=0; i<name.size();i ++){
 //          System.out.println(name.get(i));
 //      }

    public void arrayListPractice2() {
    ArrayList<Integer> number = new ArrayList<>();//Integer is a wrapper Class

    boolean isEmptyBefore = number.isEmpty();
    System.out.println(isEmptyBefore);

    number.add(50);
    number.add(60);
    number.add(70);
    number.add(80);
    number.add(80);
    number.add(90);

    boolean isEmptyAfter = number.isEmpty();
    System.out.println(isEmptyAfter);

    int size = number.size();
    System.out.println("Size of the numberList is " + size);

    System.out.println(number);

    int thirdNumber = number.get(2);
    System.out.println(thirdNumber);

    number.remove(70);
    number.remove(2);

    System.out.println(number);

    number.add(2, 70);
    System.out.println(number);

    boolean ninetyIsThereOrNot = number.contains(90);
    System.out.println(ninetyIsThereOrNot);


    Collections.shuffle(number);
    System.out.println(number);

    Collections.sort(number);
    System.out.println(number);

    Collections.reverse(number);
    System.out.println(number);

    int minimumNumber = Collections.min(number);
    System.out.println(minimumNumber);

    int maximumNumber = Collections.max(number);
    System.out.println(maximumNumber);

    // for loop for accessing the list and print all element of the list
    for (int i = 0; i < number.size(); i++);
    System.out.println(number.get(i));
}
    // for each loop

    for (Integer n : number){
        System.out.println(n);
    }
}

    public static void main(String[] args) {
        ArrayListDemo obj =new ArrayListDemo();
        obj.arrayListPractice();
       // obj.arrayListPractice2();
    }

}
