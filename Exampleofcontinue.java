public class Exampleofcontinue {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            } // if
            System.out.println(i);
        } // for loop
    }// main method
}// class
//Note
//1. continue key word should be inside if only
// 2.printing should be inside forloop - But not inside the if