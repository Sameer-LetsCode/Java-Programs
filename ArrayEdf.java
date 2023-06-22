public class ArrayEdf {
    public static void main(String[] args) {
       // int a [] = new int[5] // array Normal Declaration
        int a[] = {10, 20 , 30};
        int n = a.length;
        int sum = 0;
        int product = 1;
        for (int i = 0; i <n ;i++){
            sum = sum + a[i];
            product = product *a[i];
            System.out.println(a[i]);
        }
        System.out.println("Size of array " + "  "+  n);
        System.out.println(sum);
        System.out.println(product);
    }
}
