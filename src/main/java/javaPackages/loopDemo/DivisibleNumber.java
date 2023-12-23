package loopDemo;

public class DivisibleNumber {
 /*1. Write a function and create a loop inside it from 20-50
       and find which number is divisible by 7.
*/





 public void DivisibleNumber(){
      // 20-50
    for (int a = 20; a <= 50; a++) {
        if (a % 7 == 0)
            System.out.println(a + " is divided by 7");
    }

}

    public static void main(String[] args) {
        DivisibleNumber obj = new DivisibleNumber();
        obj.DivisibleNumber();
    }





}

