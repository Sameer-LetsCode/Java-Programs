public class Test4 {
    //Agenda to impliment Conversion and Casting   and Type Promotion
        public static void main(String args[]) {
            byte b = 10;
            int i = b;
            System.out.println("conversion      " + b);

            int n = 127;
            byte c = (byte)n;
            System.out.println("casting       " + c);


            int n1 = 500;
            byte d = (byte)n1;
            System.out.println("casting -outer range Values " + d);


            int n2 = 400;
            float f1 = 1.3f;
            double d1 =n2*f1;
            System.out.println("Type Promotion       " + d1);

        }
    }

