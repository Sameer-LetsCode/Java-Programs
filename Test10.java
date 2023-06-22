public class Test10 {
    public static void main(String[] args) {
        try {
            int i = 10/0;
        }catch (ArithmeticException ae){
            System.out.println("ae");
        }finally {
            System.out.println("Hello java ");
        }
    }
}
// Output
//ae
//Hello java