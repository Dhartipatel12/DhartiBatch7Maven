package stringFunction;

public class StringFunctionDemo1 {


    public static void StringFunctionDemo2() {
        String firstString = "I am Learning Information Technology ";
        firstString.toUpperCase();//calling the method java created
        firstString.toLowerCase();
        firstString.length();
        char firstletter = firstString.charAt(0);
        System.out.println(firstletter);
        String oneword = firstString.substring(3, 5);//substring start with 0,and ends with index +1
        System.out.println(oneword);
        boolean InformationWord = firstString.contains("Information");
        System.out.println(InformationWord);

        String[] words = firstString.split(" ");
        System.out.println(words.length);


    }


    public static void main(String[] args) {
        StringFunctionDemo2();// calling the method I created


    }
}