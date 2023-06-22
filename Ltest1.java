public class Ltest1 {
    public static void main(String[] args) {
        int a =10;
         try {
             int j = a/2 ;
             System.out.println(j);
             if(j ==5){
                 throw  new ArithmeticException();
             }
         }catch (ArithmeticException ae){
             System.out.println("handled in catch block " + ae);
         }
    }
}
