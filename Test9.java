import java.io.IOException;

public class Test9 {
    // Accident place -- Method-Name
    // Accident indicator throws - which-type-of-Accident(Example-IOException)
    // AccidentLocation - InsideMethod -By throwkeyword
    public void accident() throws IOException {
        //Proof-of- Accident-
        throw new IOException("Message - Accident done by throw");
    }

    public static void main(String[] args) {
        //Creating an Object to call method throw reference variable
        Test9 test9 = new Test9();
        try{
            test9.accident();    // try to call Accidentmethod
        }catch (IOException ie){  // catching the accidentmethod- because it died
            System.out.println(ie);
        }
    }
}
