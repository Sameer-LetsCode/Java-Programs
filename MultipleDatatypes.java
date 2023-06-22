public class MultipleDatatypes {
    public static void main(String[] args) {
        //agenda to add multiple data types with Object
        //Object a [] = new Object[5];
        Object a[] = {1, 1.3,'A',"Tiger",true};
        int Size_of_Array = a.length;
        for (int i = 0 ; i < Size_of_Array; i++){
            System.out.println(a[i]);
        }
    }
}
