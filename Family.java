abstract class Sameer {
    abstract void m1();
}

interface Imran {
    void m2();
}

class Dad extends Sameer implements Imran {
    public void m1(){
        System.out.println("from abstarct class ");
    }
    public void m2(){
        System.out.println("from interface ");
    }
}

public class Family {
    public static void main (String[] args){
        Dad dad = new Dad();
        dad.m1();
        dad.m2();
    }
}