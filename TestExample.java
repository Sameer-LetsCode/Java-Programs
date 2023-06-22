
abstract class PersonA {
   abstract void m1();
}
class PersonB extends PersonA {
    public void m1(){
        System.out.println("implementation in PersonB - of Abstractmethodm1");
    }
}
public class TestExample {
    public static void main(String[] args) {
            PersonB personB = new PersonB();
            personB.m1();

    }
}
