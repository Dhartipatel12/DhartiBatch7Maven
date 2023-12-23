package loopDemo;

public class PositiveNegativenumber {
 /* 2. Write a function that create a loop between 1-10,And determine
       which number is Positive and which number is negative.
 */

 public void PositiveNegativenumber(){
     for (int a = 1; a <=10; a++) {
         System.out.println(a);
         if (a==0){
             System.out.println(a + " is a positive number");
         }
         else if (a>0){
             System.out.println(a + " is a positive number");
         }
         else if (a<0){
             System.out.println(a + " os a negative number");
         }
     }

 }


    public static void main(String[] args) {
        PositiveNegativenumber obj = new PositiveNegativenumber();
        obj.PositiveNegativenumber();

    }




}
