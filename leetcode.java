
import java.util.Scanner;

class leetcode {
    public int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = s.nextInt();
        }

        int val = s.nextInt();

        leetcode obj = new leetcode();

        int k = obj.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.print("Modified array: ");
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }
}





// import java.util.Scanner;

// public class HappyNumberEasy {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 1. Get the number from the user
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         // 2. Store the original number to print later
//         int original = number;

//         // 3. Repeat the process
//         while (number != 1 && number != 4) {
//             int sum = 0;

//             // 4. Break number into digits and square them
//             while (number > 0) {
//                 int digit = number % 10;      // get last digit
//                 sum += digit * digit;         // add square of digit
//                 number = number / 10;         // remove last digit
//             }

//             // 5. Set number = sum to repeat the process
//             number = sum;
//         }

//         // 6. Check result
//         if (number == 1) {
//             System.out.println(original + " is a Happy Number! 🎉");
//         } else {
//             System.out.println(original + " is NOT a Happy Number. 😢");
//         }
//     }
// }








