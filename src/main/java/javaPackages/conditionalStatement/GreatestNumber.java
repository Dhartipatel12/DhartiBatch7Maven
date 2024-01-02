package javaPackages.conditionalStatement;

import java.util.Scanner;

public class GreatestNumber {
 /*
  1.Write a Java function and take three int parameters and print the greatest number.
 */


public void GreatestNumber( int a, int b, int c){
    if ((a>b)&&(a>c)){
        System.out.println(a + " is the greatest number ");
    }
    else if ((b>a)&&(b>c)){
        System.out.println(b + " is the greatest number ");
    }
    else if ((c>a)&&(c>b)){
        System.out.println(c + " is the greatest number ");
    }
}

    public static void main(String[] args) {
     GreatestNumber obj = new GreatestNumber();
     obj.GreatestNumber(49,35,29);


    }







}
