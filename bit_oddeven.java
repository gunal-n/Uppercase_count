import java.util.*;
public class bit_oddeven {
    
    public static void oddeven(int n){
        if((n&1) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        oddeven(n);
    }
}
