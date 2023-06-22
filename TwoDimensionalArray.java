public class TwoDimensionalArray {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        a[0][0] = 10;  //first row first coloumn
        a[0][1] = 20;  // first row second coloumn
        a[1][0] = 50;  //second row first coloumn
        a[1][1] = 70;  //second row second coloumn
        int r = a.length;  //size of rows
        int c = a[0].length; // size of coloumns
        for(int i = 0; i<r; i++) {
            for(int j = 0; j<c; j++){
                System.out.println(a[i][j] + " ");
            } //2for
            System.out.println();
        } //1for
    }// main method
}// class
