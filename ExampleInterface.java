
interface Nameoftheinterface {
    void m1(); // abstract method // public //No defination // only implementation
} // interface ends
class Samir implements  Nameoftheinterface {
     public void  m1(){
        System.out.println("tiger");
    }// m1method
} // Samir
public class ExampleInterface {
    public static void main(String[] args) {
        Nameoftheinterface n = new Samir();
        n.m1();
    }// main method
} //ExampleInterface
