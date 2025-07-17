// import java.util.*;

// public class Keypad {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 1. Get input from user
//         System.out.print("Enter a number (digits 2-9 only): ");
//         String digits = sc.next();

//         // 2. Keypad mapping
//         String[] map = {
//             "",     // 0
//             "",     // 1
//             "abc",  // 2
//             "def",  // 3
//             "ghi",  // 4
//             "jkl",  // 5
//             "mno",  // 6
//             "pqrs", // 7
//             "tuv",  // 8
//             "wxyz"  // 9
//         };

//         // 3. Handle empty input
//         if (digits.length() == 0) {
//             System.out.println("No digits entered.");
//             return;
//         }

//         // 4. List to store combinations
//         List<String> result = new ArrayList<>();
//         result.add(""); // start with empty combination

//         // 5. Process each digit
//         for (int i = 0; i < digits.length(); i++) {
//             int digit = digits.charAt(i) - '0';

//             // Skip invalid digits (0 or 1)
//             if (digit < 2 || digit > 9) {
//                 System.out.println("Invalid digit '" + digits.charAt(i) + "'! Only digits 2-9 allowed.");
//                 return;
//             }

//             String letters = map[digit];
//             List<String> temp = new ArrayList<>();

//             // 6. Combine previous results with new letters
//             for (String combination : result) {
//                 for (int j = 0; j < letters.length(); j++) {
//                     temp.add(combination + letters.charAt(j));
//                 }
//             }

//             result = temp; // update result
//         }

//         // 7. Print result
//         System.out.println("Combinations: " + result);
//     }
// }
