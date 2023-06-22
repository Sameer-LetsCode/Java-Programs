public class Test6 {
    public static void main(String[] args) {
        int a = 10;
         try {
             int j = a/0; // try block tries to handle the exception
             // if it cant it will jump to catch block and
             // rest of the code will execute

             System.out.println(j);
         }
         catch (Exception e) {
             System.out.println(e);    // In the catch block we are printing the exception as well
             System.out.println("I cant handled arthmetic Exception pls");
         }

        System.out.println("bye");
    }
}
