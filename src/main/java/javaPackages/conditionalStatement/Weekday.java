package javaPackages.conditionalStatement;

//import java.time.DayOfWeek;
import java.util.Scanner;

public class Weekday {
/*
  1.Write a Java function and use the parameter of an integer between 1 and 7.
    It displays the weekday name.
*/

public void Weekday(int a) {
    Scanner scan = new Scanner(System.in);


    if (a == 1) {
        System.out.println("sunday");
    } else if (a == 2) {
        System.out.println("Monday");
    } else if (a == 3) {
        System.out.println("Tuesday");
    } else if (a == 4) {
        System.out.println("Thursday");
    } else if (a == 5) {
        System.out.println("Friday");
    } else if (a == 6) {
        System.out.println("Saturday");
    }
}

    public static void main(String[] args) {
        Weekday obj = new Weekday();

    }


    }