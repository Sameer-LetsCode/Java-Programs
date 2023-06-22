public class Hello {
    // agenda -static block
    // non static block
    // method
    static {
        System.out.println("static block ");  // static block
    }
    {
        System.out.println("static block "); // Non static block
    }
    public void m1(){
        System.out.println("method");
    }
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.m1();
        System.out.println( hello);
    }
}
