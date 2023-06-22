public class Pwer {

    static {
        System.out.println("Static Block"); // its static block - No need to call in main method
    }
    {
        System.out.println("Non Static Block"); // its Non -static block -
        // need to create a Object in main method
    }
    void run(){
        System.out.println("Non Static method");
    }
    public static void main(String[] args) {
         Pwer pwer = new Pwer();
         pwer.run();
    }
}
