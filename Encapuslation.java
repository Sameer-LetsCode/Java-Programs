class Logic {
    private int a = 10;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}

public class Encapuslation {
    public static void main(String[] args) {
        Logic encapuslation = new Logic();
        encapuslation.setA(20);
        System.out.println(encapuslation.getA());
    }
}

