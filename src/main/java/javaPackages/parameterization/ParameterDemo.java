package parameterization;

public class ParameterDemo {
    //parameterization is a part of the method signature.

    public void play(String game){
        System.out.println(game);
    }

   public static void main(String[] args) {
        ParameterDemo Arafat = new ParameterDemo(); // object of the class
        Arafat.play("Soccer"); // argument

        ParameterDemo Farzana = new ParameterDemo(); // object of the class
        Farzana.play("Chess"); // argument

        ParameterDemo Shefali = new ParameterDemo(); // object of the class
       Shefali.play("bingo");
   }




}
