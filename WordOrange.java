// agenda - to implement super keyword to invoke the method of parent class

class Room1 {
    void R1() {
        System.out.println("printing the parent class method");
    }
}

class Room2 extends Room1 {
    int a = 10;
    void R2() {
        System.out.println(a);
        super.R1(); // We can call or invoke the parent class method here directly using 'super.methodName'
        // Again, we can call the parent class method within the subclass method only with 'super.methodName'.
        // We should not use it outside of the method of the subclass.
    }
}

public class WordOrange {
    public static void main(String[] args) {
        Room2 room2 = new Room2();
        room2.R2();
    }
}
