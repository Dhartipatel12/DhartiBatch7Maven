package dataTypePackage;

public class DataTypes { // Curly Braces
    // Class can hold Variables and methods

    // String group = "Evening"
    // int batch = 7;

    // programme is a set of instructions for the computer to follow

    /* There are two types of methods
    1. main method -- very special-- Coming from java-all commands come from here.
    2.custom method -- creating by us- for particular groups of code.

*/

    public static void main(String[] args) { // main method is used for commands
    /* There are many types of data.

     1. byte-- it can store whole numbers up to 127;
     2. short-- stores whole numbers up to 32767;
     3. int --  Stores whole number up to 2147,483,647;
     4. long -- Stores whole number up to 9,223,372,036,854,775,807;
     5. float --Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits;
     6. double -- Stores fractional numbers. Sufficient for storing 15 decimal digits;
     7. boolean-- Stores true or false values';
     8. char -- MiddleInitial 'B';

      String name = "Dharti" (here Dharti is a data)-- Name is a properties
      int age = 100 (100 is a data) -- age is a properties

       */


        //String name = "Dharti";// variable.. name, value= Bashir, data type=string
        byte age = 100; // variable = age, value = 100, data type = int ( integer-- number );

        //System.out.println(name);
        System.out.println(age);
        short CheckingAccount = 32767;
        int savingsAccount = 2147483647;
        long regNum = 9223372036854775807L;
        float height = 5.533434f;
        double stock = 5435.2058403258345454;
        boolean snoringInTheClass = true;
        char MiddleInitial = 'B';

        System.out.println("The checking account balance is " + CheckingAccount);// concatenation
        System.out.println(savingsAccount + " My Number");
        System.out.println(regNum + " This is my regNum" );
        System.out.println(height + " My height");
        System.out.println(stock);
        System.out.println(snoringInTheClass);
        System.out.println(MiddleInitial);

        //ImpNote:
        //double quotation" " -- String
        // single quotation' '-- char
        // ctrl+C = Copy
        // ctrl+S = Save
        // ctrl+V = Paste
        // ctrl+X = Cut
        // ctrl+Z = Undo
        // ctrl+A = Select whole in the page
        // Curly Braces= { }
        // Parenthesis= ( )
        //Square Brackets= [ ]
        // Out = output
        // println= Println(line)
    }

}





