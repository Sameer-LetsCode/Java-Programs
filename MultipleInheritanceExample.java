// concept of Multiple inheritance through inface
interface Ch {
    int a = 10;
    void m1();
}//A
interface Bh {
    int b = 10;
    void m2();
}//B
// Now lets implements these two interfaces to class - implements will comwe

public class MultipleInheritanceExample implements  Ch,Bh {
public void m1(){
    System.out.println(a);
}
public void m2(){
    System.out.println(b);
}

    public static void main(String[] args) {
        MultipleInheritanceExample mi = new MultipleInheritanceExample();
        mi. m1();
        mi. m2();
    }
}
