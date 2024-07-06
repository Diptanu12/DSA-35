public class Fibonaci {
    public static void main(String[] args) {
        System.out.println( fibn(7)) ;
    }
    static int fibn(int n){
        if(n<2){
            return n;
        }
       return fibn(n-1) + fibn(n-2);
    }
}
