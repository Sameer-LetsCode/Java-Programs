//Agenda to implement Runtime Polymorphism
class AParent {
    void m1 (){
        System.out.println("from parentclass");
    }
}
class Box extends AParent{
    void m1 (){
        System.out.println("from subclass");
    }

}

public class test5 {
    public static void main(String[] args) {
        AParent a  = new Box();  // Upcasting
        a.m1();

    }
}
