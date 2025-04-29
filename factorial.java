
import java.util.Scanner;

public class factorial {

    // public static int fact(int a){
    //     if(a >= 1) return (a*fact(a-1));
    //     return  1;
    // }

    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     int a = s.nextInt();
    //     System.out.println(fact(a));
    // }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); //5
        int fact = 1;
        for(int i = 2; i <=a; i++){
            fact = fact*i;   
        }
        System.out.println(fact);
       
    }
}
