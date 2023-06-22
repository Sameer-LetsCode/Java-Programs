// agenda - multilevel inheritance with3 classes
class  Abhishek {
    void m1() {
        System.out.println("first bats man -openers ");
    }
}// Abhishek
class Hary extends Abhishek {
  void m2(){
      System.out.println("Harry -broke");
  }
}//Harry
class Tripati extends Hary {
    void m2(){
        System.out.println("indian batsman");
    }
}//tripati
public class SRH {
    public static void main(String[] args) {
        Hary hary = new Hary();
        hary.m2();
        hary.m1();
        Tripati tripati = new Tripati();
        tripati.m2();
    }
}
