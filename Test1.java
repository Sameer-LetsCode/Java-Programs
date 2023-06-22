class A {
    private String toy = "sameer";
    private int a = 2023;
    public String getToy (){


        return toy;
    }
    public int geta (){
        return a;
    }
}


public class Test1 {
    public static void main(String[] args) {
        A  a1 = new A();
        System.out.println(a1.geta());
        System.out.println(a1.getToy());
    }

}
