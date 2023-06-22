public class Test11 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        try {
            System.out.println(a[6]);
        }catch (StringIndexOutOfBoundsException se){
            System.out.println(se);

        }finally {
            System.out.println("finaaly - StringIndexOutException_Not handlled ");
            System.out.println("Hello java");
        }
    }
}
//finaaly - StringIndexOutException_Not handlled
//Hello java
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
//	at Test11.main(Test11.java:5)