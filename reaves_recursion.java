public class reaves_recursion {
     
    public static int reaves(int n){
        int rev = 0;
         while(n != 0){
            int a = n % 10;
            rev = rev * 10 + a;
            n /= 10;
         }
         return rev;
    }

    public static void main(String[] args) {
         int b = reaves(4321);
         System.out.print(b);
    }
}
