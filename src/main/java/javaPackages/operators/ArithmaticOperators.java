package operators;

public class ArithmaticOperators {
  // +, _, *,/

    public void arithmatic(){
       int a = 10;
       int b = 25;
       int c = a+b;
       System.out.println("10+25 =" + c);// + is called concatenation
       int f = b-a;
       System.out.println("25-10 =" + f);
       int g = a*b;
       System.out.println("10*25=" + g);
       float h = (float)b/a; // 2.14
       System.out.println("25/10=" + h);
    }


    public static void newArithmatic(int a , int b){ //parameter
    System.out.println(a+b);
    System.out.println(b-a);
    System.out.println(a*b);
    System.out.println(a/b);



}

    public static void main(String[] args) {
      ArithmaticOperators obj = new ArithmaticOperators();//initiated the class/created an object of the class.
      obj.arithmatic();
      newArithmatic(10,25);//argument
      System.out.println("--------------------------");
      newArithmatic (25,10);
      System.out.println("--------------------------");
      newArithmatic(10,25);
      System.out.println("--------------------------");
      newArithmatic(25, 10);
    }





















}
