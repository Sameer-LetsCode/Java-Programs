import java.util.Scanner;

public class Brocode1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I know you Name please  ");
        String s =scanner.nextLine();


        System.out.println("How old are you ");
        int age = scanner.nextInt();
        System.out.println("Hello" + s);
        System.out.println("Nice to meet you you are "+ age +"old");
        scanner.nextLine();
        System.out.println("your Favorite Programming Language ");
        String language = scanner.nextLine();
        System.out.println("your Favorite programming Language is"+"  "+ language);


    }
}

