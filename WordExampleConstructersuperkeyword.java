// Agenda - implementing super() key word to invoke constructor

class Delhi {
    // constructor
    Delhi(){
        System.out.println("horse");
    }//constructor
} //delhi
class India extends Delhi{
    India (){
        super(); // defining super() inside the India Constructor
    } //constructor india
    int a = 10;
    void m1(){

        System.out.println(a);

    }// method

}//india
public class WordExampleConstructersuperkeyword {
    public static void main(String[] args) {
        India india = new India();
        india.m1();
    }

}
