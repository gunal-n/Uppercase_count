// class rotatearray {
//     public void rotate(int[] nums, int k) {
//         k = k% nums.length;
//         int n = nums.length;
//       int start = 0 , end = n - 1;
//       revers(0,n-1,nums);
//       revers(0,k-1,nums);
//       revers(k,n-1,nums);
//     }

//     public void revers(int start, int end, int nums[]){
//         while(start < end){
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

// class Solution {
//     public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int[] temp = new int[n];
//        for(int i = 0; i < n; i++){
//         temp[(i + k) % n] = nums[i];
//        }
//         for(int i = 0; i < n; i++){
//         nums[i] = temp[i];
//        }
//     }
// }

// import java.util.Scanner;
// class rotate{
//     public static void main(String[] args) {
//         Scanner s = new Scanner (System.in);
//         int n = s.nextInt();
//         int k = s.nextInt();
//         int[] nums = new int[n];
//         for(int i = 0; i < n; i++){
//             nums[i]=s.nextInt();
//         }
//         rotatea( nums, k);
//     }

//     public static void rotatea(int[] nums, int k) {
//         k = k % nums.length;
//         int a = nums.length;
//       int start = 0 , end = a - 1;
//       revers(start,end,nums);
//       revers(start,k-1,nums);
//       revers(k,end,nums);
//       for (int num : nums) {
//         System.out.print(num + " ");
//     }
//     }

//       public static void revers(int start, int end, int nums[]){
//            while(start < end){
//                int temp = nums[start];
//                nums[start] = nums[end];
//                nums[end] = temp;
//                start++;
//                end--;
//             }
//         }
// }