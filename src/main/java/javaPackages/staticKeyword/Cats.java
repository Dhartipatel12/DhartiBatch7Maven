package staticKeyword;

public class Cats {

    String name;
    String color;
    String size;
    String Eyes;
    String Tail;



    public static void main(String[] args) {

        Cats myCat = new Cats();// created an object of the class. that means I instantiated the class.
        myCat.name = "garfield";
        myCat.color = "black";
        myCat.size = "small";
        myCat.Eyes = "blue";
        myCat.Tail = "long";

        Cats yourCat = new Cats();// created an object of the class. that means I instantiated the class.
        yourCat.name = "snowball";
        yourCat.color = "white";
        yourCat.size = "medium";
        yourCat.Eyes = "green";
        yourCat.Tail = "long";
    }



}
