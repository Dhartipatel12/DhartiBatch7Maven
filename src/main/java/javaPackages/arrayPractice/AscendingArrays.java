package javaPackages.arrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AscendingArrays {
/* 2. Write a Program to sort Numeric Array in ascending order
      Array ={ 23,5,67,20,3,30,79,3,70,2}
*/

public void AscendingArrays() {
    int Number[] = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
    Arrays.sort(Number);
    for (int i = 0; i < Number.length; i++) {
        System.out.println(Number[i]);

    }

}
    public static void main(String[] args) {
        AscendingArrays obj = new AscendingArrays();
        obj.AscendingArrays();
    }



}
