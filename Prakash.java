// initializing through object
class Mango {
    // instance variable 
    int a;  // declaration of Variable
    String s; // declaration of String s
} // Mango class
    public class Prakash {
        // Now creating a object of class mango to access its instance variable and initializa to the objects
        public static void main(String[] args) {

        Mango mango = new Mango();
        mango.a = 10;  // initialization through object
        mango.s = "fruits";
        System.out.println(mango.a + "  " + mango.s);
    }
    
}
