public class polk {
    // agenda - write a method which contain porameter and return

    int a;
    int b;
    polk(int a,int b){
        this.a = a; ///
        this.b = b;
    }

    public static void main(String[] args) {
        polk p = new polk(1,2);
        System.out.println((p.a)+(p.b));
    }
}
// if you want instance variables we should use parameter constructor