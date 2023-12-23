package stringFunction;

public class ReverseString2 {
//Take any String and validate that it is palindrome or not.
    public static void palindrome() {
        String name = "madam";
        String reverse = " ";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);//string + char=String
        }
        System.out.println(reverse);
        if (reverse.equals(name)) {
            System.out.println(" This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }


    public static void main(String[] args) {
       palindrome();
    }









}
