import java.io.IOException;

public class Tech1 {
    public  void me1() throws IOException  {
        //proof
        throw new IOException("Device");
    }

    public static void main(String[] args) {
        Tech1 tech1 = new Tech1();
        try {
            tech1.me1();
        }catch (IOException ie){
            System.out.println(ie);
        }
    }

}
