package arrayPractice;

import loopDemo.EvenOddnumber;

import java.util.Enumeration;
import java.util.Scanner;

public class Sum {
//2. Write a Program to find the sum of 20-30.


    public void sum() {
        int sum = 0;
        for (int i=20; i<=30; i++) {
          // System.out.println(i);
         sum=sum + i;// 20+0=sum 20// sum =41// sum=63//
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sum();
    }


}


