import org.w3c.dom.ls.LSOutput;

class A1 {
    int x = 10;
    String s = "sameer";
    public void m1(){

    }
}
class B extends A1  {
    public void m2(){
        System.out.println(super.x);
        System.out.println(super.s);
        super.m1();
    }
}
public class Human {
    public static void main(String[] args) {
        B b = new B();
        b.m2();
    }
}
