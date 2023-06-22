// initialization through method
public class Banana {
    // instance Variables

    void display (int a , String s){
        System.out.println(a +"       " + s);
    }

    public static void main(String[] args) {
        // non statci variables to call in static we have to create a objec
        Banana b = new Banana();
        //class-Name  + reference = new (allocating new instance or Memory) + Constructer
        b.display(10, "fruiits"); // intialization through method
    }// main method
} // Banana
