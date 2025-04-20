
import java.util.Scanner;

class moorevoting {
    public int majorityElement(int[] nums) {
        int candi = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                candi = nums[i];
                count = 1;
            }
            else if(candi == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        int numberOfTimes = 0;
        for(int num : nums){
            if(num == candi){
                numberOfTimes++;
            }
        }
        return (numberOfTimes > nums.length/2) ? candi : -1;
    }

    public static void main(String[] args) {
        moorevoting moore = new moorevoting();
        Scanner s = new Scanner(System.in);
        System.out.println("Size");
        int n = s.nextInt();
        System.out.println("Array");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = s.nextInt();
        }
        System.out.println("Majoer number" + moore.majorityElement(nums));
    }

}
