
// Agenda to implement Run time Polymorphism
//parent class referance variable -- Object of subclass

class Bank {
    void m1(){
        System.out.println("intrest from Banks ");
    }
}
class SBI extends Bank {
    void m1(){
        System.out.println("intrest is 7.5");
    }
}

class Icici extends Bank {
    void m1(){
        System.out.println("intrest is 8.0");
    }

}
class Hdfc extends Bank {
    void m1(){
        System.out.println("intrest is 8.2");
    }
}


public class Test7 {
    public static void main(String args[]) {

        Bank b;

        b = new Icici();
        b.m1();

        b = new SBI();
        b.m1();

        b = new Hdfc();
        b.m1();
    }
}