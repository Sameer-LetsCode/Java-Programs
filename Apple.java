// Create Multiple objects to create the Multiple Objects
// two rectangles perimeter and Area
 class tiger {
    void display (int x, int y ){
        System.out.println("perimeter of Rectangle " + (x+y));
        System.out.println("Area of Rectangle " + x*y);


    }// method
}// tiger
    public class Apple {
        public static void main(String[] args) {
            tiger t = new tiger();
            tiger t2 = new tiger();
            t.display(2,3);
            t2.display(4,5);
            System.out.println(t);
            System.out.println(t2);



        }// main method
    }// apple


