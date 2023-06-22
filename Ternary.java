public class Ternary {
    public static void main(String[] args) {
        // To implement Ternary Operator
        // Implementation
        // data_type + Variable = Condition ? firstcondition : secondcondition;

         double d = 100.0;
         String result = " ";
         double result2 = 0;

        result = d % 2==0 ? "even": "odd";
        System.out.println(result);

        result2 = d % 2==0 ? 10 : 20;
        System.out.println(result2);

    }
}
