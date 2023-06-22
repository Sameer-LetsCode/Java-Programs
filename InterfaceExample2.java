
interface Mango1 {
    int a = 10;
    void m1();
} // mango
public class InterfaceExample2  implements Mango1 {
    public void m1(){
        System.out.println(a);
    }
    public static void main(String[] args) {
//        InterfaceExample2 interfaceExample2 = new InterfaceExample2();
//        interfaceExample2.m1();
        Mango1 mango = new InterfaceExample2();
        mango.m1();

    }
}
