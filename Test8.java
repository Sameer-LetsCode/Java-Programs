public class Test8 {
    public static void main(String[] args) {
        // agenda to implement throw and throws
        int a =10;
        try {
            int j = a/1;
            if(j==10) {
                throw new ArithmeticException("I am throwing an Exception");   // It will throw to catch block
            }
            System.out.println(j);
        } //try
        catch (ArithmeticException ae){
            System.out.println(ae );
            System.out.println("handled");
        } //catch
    }
}


