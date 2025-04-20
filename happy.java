import java.util.*;
public class happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 1 && n != 4){
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;      
                sum += digit * digit;         
                n = n / 10;         
            }
            n = sum;
        }
        if(n == 1){
            System.out.println(" is a Happy Number");
        }
        else{
            System.out.println(" is not a Happy Number");
        }
    }
}
