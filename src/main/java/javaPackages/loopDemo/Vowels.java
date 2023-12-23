package loopDemo;

public class Vowels {

/* 3. Write your name and check if there is/are any vowels there.
      if found print them.
 */

    public void Vowels() {
        String Name = "DhartiPatel";
        String Vowels = "AEIOU";
        int lengthofname = Name.length();
            System.out.println(lengthofname);

        char sixthLetter=Name.charAt(5);
             System.out.println(sixthLetter);

         char ninthLetter=Name.charAt(8);
             System.out.println(ninthLetter);

        char firstletter = Name.charAt(0);
             System.out.println(firstletter);
        for (int i = 0; i < Name.length(); i++) {

            if (Name.charAt(i) == 'a' || Name.charAt(i) == 'e' || Name.charAt(i) == 'i'
                    || Name.charAt(i) == 'o' || Name.charAt(i) == 'u') {
                System.out.println(Name.charAt(i) + " is Vowel ");
            }
        }

    }


    public static void main(String[] args) {
        Vowels Obj = new Vowels();
        Obj.Vowels();
    }

}





