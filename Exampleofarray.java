public class Exampleofarray {
    public static void main(String[] args) {
        // 1.declaration of array
        int a[] = new int[3];
        // 2. stroring values in array
        a[0]=1; a[1]=2; a[2]=3;
        int n = a.length; // size of an array
        for(int i = 0 ; i < n;i++){
            System.out.println(a[i]);
        } // for loop close
        System.out.println("size of arry " + "   "+ a.length);
    }// main method
}// class
