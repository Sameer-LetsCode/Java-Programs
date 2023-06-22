// agenda - to implement super key word
// super is a key which is used to use or to print   referance variable immediate to a parent class
class D {
    String s = "superkeyword implementation";
}// D
class E extends D{  // when we are going to derive from parent class ,
    // we should add extends key word before implementing super keyword
    int a;
    void e(){
        System.out.println(a);
        System.out.println(super .s);  // 1.when we are using the super key word in sub class -
        // we have to remember that we have to use super.variable
    }
}
public class WordExample {
    public static void main(String[] args) {  // for intialization and call - main method
        E e1 = new E();
        e1.e();
    }
}
