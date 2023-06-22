interface ParentA{
    void m1();                           // Bydefault public , abstract methods
}
interface ParentB{
    void m2();                           // Bydefault public , abstract methods
}
 class Child implements ParentA,ParentB{
   public  void m1(){
        System.out.println("sameer");
    }
    public  void m2(){
        System.out.println("reemas");
    }
}
class Boy extends  Child{

}
class Girl extends Child {

}
public class TestIDE1 {
    public static void main(String[] args) {
       Girl girl = new Girl();
       girl.m1();
       girl.m2();
    }
}
