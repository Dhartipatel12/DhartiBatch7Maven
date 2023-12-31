package javaPackages.conditionalStatement;

import java.util.Scanner;

public class PositiveNegative {

/*
Take a number from User find the number is positive or Negative
 */



public void PositiveNegative() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();


    if (a == 0) {
        System.out.println(a + "is a positive number");
    } else if (a > 0) {
        System.out.println(a + " is a positive number");
    } else if (a < 0) {
        System.out.println(a + "is a negative number ");
    }

}

    public static void main(String[] args) {
    PositiveNegative obj = new PositiveNegative();
    obj.PositiveNegative();





}















}
