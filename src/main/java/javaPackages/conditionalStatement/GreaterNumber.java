package conditionalStatement;

import java.util.Scanner;

public class GreaterNumber {

/*
1. take two numbers from user and print the greater number
 */




    public void GreaterNumber(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("the first number is" + a);
        int b = scan.nextInt();
        System.out.println("the second number is " + b);




}

    public static void main(String[] args) {
      GreaterNumber obj = new GreaterNumber();
      obj.GreaterNumber();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

       if ( a>b) {
           System.out.println("the greater number is A ");
       }
       else if (a==b) {
           System.out.println( a + "is equal to " + b);
       }
       else {
           System.out.println(a + "is the smaller number ");
       }

    }







}
