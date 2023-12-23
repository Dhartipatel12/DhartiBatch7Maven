package variablesTypePackage;

public class VariablesTypes {
/* There are three types of variables:
1. Instance/Global Variables -- the variables declares inside the class is called Instance variables
2. Local Variables -- The variables declare inside the method, are called local variables.Local variables
   born inside the method and die inside the method.
3. Static Variables/ methods -- static variables belongs to the class.This is called class variable.
   static variables we create when we see the variable/ variables are common to all objects.
*/
   Byte age = 100;// we declare the variable and initialize/define the variable
    Short checkingAccount; // we declare the variable


 public void study () { // function--Method can Hold Variables, statements
     System.out.println(age);
     checkingAccount = 32767; // initialize/ define the variable
     System.out.println(checkingAccount);
     boolean snoringInTheClass;
     snoringInTheClass = true;
 }
    public static void main(String[] args) { // Method can hold variables and statements
        String name = "dharti";
    }













}
