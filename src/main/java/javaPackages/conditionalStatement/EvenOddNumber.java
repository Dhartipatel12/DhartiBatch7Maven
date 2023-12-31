package javaPackages.conditionalStatement;

import java.util.Scanner;

public class EvenOddNumber {
/* 1. Write a Java function and take an int parameter and determine that the number
      is divided by 2 or not. If divided by 2 that is even else the number is odd.
 */
// when we declare the variable inside method signature and we initialize the variable while we call the method



    public void evenoddNUmber(int number) { //method signature (int num = parameter)
           // int num = 9 ;
        if (number % 2 == 0) {
            System.out.println(number + " is an even number ");
        }
        else if (number % 2 == 1){
            System.out.println(number + " is an odd number ");
        } // method body

    }




    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();
        obj.evenoddNUmber(9); // calling the method/function //giving argument

    }




}
