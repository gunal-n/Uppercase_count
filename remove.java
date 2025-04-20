import java.util.*;
public class remove {
    public int removeRepeat(int[] nums){
          int k = 1;
          for(int i = 1; i < nums.length; i++){ 
            if(nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
          }
          return  k;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        //create the object//
        remove sub = new remove();
        int k = sub.removeRepeat(nums);

        System.out.println("Repate number is" + k);
    }
}
