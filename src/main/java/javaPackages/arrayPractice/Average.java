package arrayPractice;

import loopDemo.EvenOddnumber;

import java.util.Scanner;

public class Average {
/* 1.Take 5 numbers like 100,200,300,400,500.
     and find the average of those numbers.
 */


    public void Average() {

        int[] Num = {100, 200, 300, 400, 500};
        int sum = 0;
        for (int i = 0; i <Num.length; i++) {
           // System.out.println(Num[i]);
            sum= sum+Num[i];
        }
        System.out.println(sum);

        float average = sum/Num.length;
        System.out.println(average);
    }


    public static void main(String[] args) {
        Average obj = new Average();
        obj.Average();
    }

}
