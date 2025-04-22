
import java.util.Scanner;

 class basepower {

     public static int pow(int a, int exp){
           if(exp == 0) return 1;
            return a * pow(a, exp -1);
     }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int exp = s.nextInt();
        System.out.println(pow(a,exp));

    }
}
