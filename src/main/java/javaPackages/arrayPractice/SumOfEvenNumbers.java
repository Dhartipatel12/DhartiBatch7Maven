package arrayPractice;

import loopDemo.EvenOddnumber;

import javax.imageio.stream.ImageInputStream;

public class SumOfEvenNumbers {
/* 3. Consider an array of the following number 25,26,28,29,30,35
      print the sum of even numbers only from the array element.
 */


    public void SumOfEvenNumbers() {

        int[] Numbers = {25, 26, 28, 29, 30, 35};// last index 5,length 6.
        int sum = 0;
        for (int i =0; i <6; i++){
            //System.out.println("The value of i is : " +Numbers[i]);
            if (Numbers[i]%2 ==0){
                System.out.println(Numbers[i] +  " is an Even Number");
            sum= sum + Numbers[i];  // 26+0=26// 28=26=54 //30+5a=84//
            }
        }
        System.out.println(sum);
    }






    public static void main(String[] args) {
        SumOfEvenNumbers obj = new SumOfEvenNumbers();
        obj.SumOfEvenNumbers();
    }






}









