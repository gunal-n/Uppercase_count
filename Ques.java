// Q1. Problem Statement
// Kochouseph Chittilappilly went to Dhruv Zplanet, a gaming space, with his friends and played a game called “Guess the Word”. 
// Rules of games are –
// Computer displays some strings on the screen and the player should pick one string/word if this word matches with the random word that the computer picks then the player is declared as Winner.
// Kochouseph Chittilappilly’s friends played the game and no one won the game. This is Kochouseph Chittilappilly’s turn to play and he decided to must win the game. 
// What he observed from his friend’s game is that the computer is picking up the string whose length is odd and also that should be maximum. Due to system failure computers sometimes cannot generate odd-length words. In such cases, you will lose the game anyways and it displays “better luck next time”. He needs your help. Check the below cases for a better understanding
// Sample Input & Output
// •	Sample input 0:
// 5   → ( number of strings )
// Hello Good morning Welcome you
// •	Sample output 0: morning
// •	Explanation: First word that is picked by the computer is morning 
// Hello → 5
// Good → 4
// Morning → 7
// Welcome → 7 
// You → 3
 
// •	Sample input 1:
// 3
// Go to hell 
// •	Sample output 1: Better luck next time 
// •	Explanation: Here is no word with odd length so computer confuses and gives better luck next time

// import java.util.Scanner;
// public class Ques {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         scanner.nextLine(); 
//         String[] words = scanner.nextLine().split(" ");
//         String maxWord = "";
//         int maxLength = 0;
//         for (String word : words) {
//             int length = word.length();
//             if (length % 2 == 1) { 
//                 if (length > maxLength) {
//                     maxLength = length;
//                     maxWord = word;
//                 }
//             }
//         }
//         if (!maxWord.isEmpty()) {
//             System.out.println(maxWord);
//         } else {
//             System.out.println("Better luck next time");
//         }
//         scanner.close();
//     }
// }


// Q2. Problem Statement
// Ratan is a crazy rich person. And he is blessed with luck, so he always made the best profit possible with the shares he bought. That means he bought a share at a low price and sold it at a high price to maximize his profit. Now you are an income tax officer and you need to calculate the profit he made with the given values of stock prices each day. You have to calculate only the maximum profit Ratan earned.
// Note that: Ratan never goes into loss.
// •	Example 1:
// Price = [ 1, 6, 2 ]
// Ratan buys it on the first day and sells it on the second. 
// •	Example 2:
// Price = [ 9, 8, 6 ] 
// The Price always went down, Ratan never bought it.
// Input Format:
// First line with an integer n, denoting the number of days with the value of the stack
// Next n days, telling the price of the stock on that very day.
// Output Format:
// Maximum profit done by Ratan in a single line.
// Constraints:
// Number of days <=10^8
// Sample Input for Custom Testing
// •	Sample Input: 7, [ 1, 9, 2, 11, 1, 9, 2 ]
// •	Sample Output:  10
// •	Explanation: The maximum profit possible is when Ratan buys it in 1 rupee and sells it in 11.

// import java.util.Scanner;
// public class Ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Read the number of days
//         int n = sc.nextInt();

//         // Handle empty input edge case
//         if (n == 0) {
//             System.out.println(0);
//             return;
//         }

//         // Read the stock prices
//         int[] prices = new int[n];
//         for (int i = 0; i < n; i++) {
//             prices[i] = sc.nextInt();
//         }

//         // Initialize min price as the first day's price
//         int minPrice = prices[0];
//         int maxProfit = 0;

//         // Iterate through the price array
//         for (int i = 1; i < n; i++) {
//             if (prices[i] < minPrice) {
//                 minPrice = prices[i]; // update minPrice
//             } else {
//                 int profit = prices[i] - minPrice;
//                 if (profit > maxProfit) {
//                     maxProfit = profit; // update maxProfit
//                 }
//             }
//         }

//         System.out.println(maxProfit);
//     }
// }

// Q3. Problem Statement
// Frogs are sitting on the x-axis of the plane. The x-axis is represented by a given string. * represents a frog and | represents a stone.
// The string consists of only the above-mentioned characters. You are given a start index array and end index array, and calculate the number of frogs between the two stones including the endpoint.
// Note – Array is 1 indexed
// •	Example:
//  s = ” |**|*| ”  
// start Index = [ 1, 1 ]
// end Index = [ 5, 6 ]
// For the first pair of indices (1,5), the substrings are “|**|*”. There are 2 stars between a pair of bars. For the second pair of indices (1,6), the substring is  “|**|*|” and there are 2+1=3 stars in between the bars. Both of the answers are returned to the array [2,3].
// Constraints
// •	1 <= n <= 105
// •	1 <= Start Index[i] <= end Index[i]
// •	Each Character of s is either  ” * ”  or  ” | “
// Input Format for Custom testing
// First line contains a string S the next line contains an integer n, the no.of elements in startIndex. Each line i of the n subsequent lines contains an integer of the start index. the next line contains an integer n, the no. of elements in end Index. Each line i of the n subsequent lines contains an integer of the end index  
// Sample Input for Custom Testing
// •	Sample Case 0
// *|*|  → s = ” *|*| ”
// 1 → startindex[] size=1
// 1 → startindex= 1
// 1 → endindex[] size=1
// 3 → endindex=3
// •	Sample output: 0
// •	Explanation: The substring from index =1 to index=3 is “*|*”. there is no consecutive pair of bars in this string.

// prefix sums and preprocessing

// import java.util.Scanner;

// public class Ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         String s = sc.nextLine();
//         int n = s.length();

//         // Precompute prefix sum of frogs between bars
//         int[] prefixSum = new int[n];
//         int frogCount = 0;
//         int barCount = 0;
//         int[] lastBar = new int[n];
//         int lastSeenBar = -1;

//         // Left to right: build prefixSum and lastBar
//         for (int i = 0; i < n; i++) {
//             if (s.charAt(i) == '|') {
//                 lastSeenBar = i;
//                 barCount++;
//             } else if (s.charAt(i) == '*' && barCount > 0) {
//                 frogCount++;
//             }
//             prefixSum[i] = frogCount;
//             lastBar[i] = lastSeenBar;
//         }

//         // Right to left: build next bar positions
//         int[] nextBar = new int[n];
//         int nextSeenBar = -1;
//         for (int i = n - 1; i >= 0; i--) {
//             if (s.charAt(i) == '|') {
//                 nextSeenBar = i;
//             }
//             nextBar[i] = nextSeenBar;
//         }

//         // Read start index array
//         int q = sc.nextInt(); // number of queries
//         int[] start = new int[q];
//         for (int i = 0; i < q; i++) {
//             start[i] = sc.nextInt();
//         }

//         // Read end index array
//         int[] end = new int[q];
//         int m = sc.nextInt(); // should be same as q
//         for (int i = 0; i < m; i++) {
//             end[i] = sc.nextInt();
//         }

//         // Answer queries
//         for (int i = 0; i < q; i++) {
//             int left = nextBar[start[i] - 1];     // convert to 0-based
//             int right = lastBar[end[i] - 1];      // convert to 0-based

//             if (left != -1 && right != -1 && left < right) {
//                 System.out.println(prefixSum[right] - prefixSum[left]);
//             } else {
//                 System.out.println(0);
//             }
//         }

//         sc.close();
//     }
// }


// Q4. Problem Statement
// Stephan is a vampire. And he is fighting with his brother Damon. Vampires get energy from human blood, so they need to feed on human blood, killing human beings. Stephan is also less inhuman, so he will like to take less life in his hand. Now all the people’s blood has some power, which increases the powers of the Vampire. Stephan just needs to be more powerful than Damon, killing the least human possible. Tell the total power Stephan will have after drinking the blood before the battle.
// Note: Damon is a beast, so no human being will be left after Damon drinks everyone’s blood. But Stephan always comes early to the town.
// Input Format:
// First line with the number of people in the town, n.
// Second line with a string with n characters, denoting the one-digit power in every blood.
// Output Format:
// Total minimum power Stephan will gather before the battle.
// Constraints:
// n <= 10 ^ 4
// •	Sample Input :
// 6
// 093212
// •	Sample output:
// 9
// Explanation: Stephan riches the town and drinks the blood with power 9. Now Damon cannot reach 9 by drinking all the other blood.

// import java.util.Scanner;

// public class Ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();  // number of people
//         String powerString = sc.next();  // n-digit string of powers

//         // Counting occurrences of each digit (0 to 9)
//         int[] count = new int[10];
//         int totalPower = 0;

//         for (int i = 0; i < n; i++) {
//             int digit = powerString.charAt(i) - '0';
//             count[digit]++;
//             totalPower += digit;
//         }

//         int stephanPower = 0;
//         int damonPower = totalPower;

//         // Stephan drinks strongest powers first
//         for (int i = 9; i >= 0; i--) {
//             while (count[i] > 0 && stephanPower <= damonPower - stephanPower) {
//                 stephanPower += i;
//                 count[i]--;
//             }

//             if (stephanPower > damonPower - stephanPower) {
//                 break;
//             }
//         }

//         System.out.println(stephanPower);

//         sc.close();
//     }
// }

// Q5. Problem Statement
// There are some groups of devils and they split into people to kill them. Devils make People them left as their group and at last the group with maximum length will be killed. Two types of devils are there namely “@” and “$”. People are represented as a string “P”
// Input Format:
// First line with the string for input
// Output Format:
// Number of groups that can be formed.
// Constraints:
// 2<=Length of string<=10^9
// •	Input string: PPPPPP@PPP@PP$PP
// •	Output: 7
// •	Explanation: 4 groups can be formed
// PPPPPP@
// PPP@
// PP$
// PP
// Most people in the group lie in group 1 with 7 members.

// import java.util.*;
// public class Ques {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String input = sc.nextLine();
//     int count = 1;

//     for(int i = 1;i<input.length();i++){
//         if(input.charAt(i) != input.charAt(i-1)){
//             count++;
//         }
//     }
//     System.out.println(count);
//    }   
// }

// Q6. Problem Statement
// Given a string, return the character that appears the minimum number of times in the string. The string will contain only ASCII characters, from the ranges        ( “a” – “z”, “A” – “Z”, 0 – 9 ), and case matters. If there is a tie in the minimum number of times a character appears in the string return the character that appears first in the string.
// Input Format:
// Single line with no space denoting the input string.
// Output Format:
// Single character denoting the least frequent character.
// Constraints:
// Length of string <=10^6
// Sample Input / Output
// •	Sample Input: cdadcda
// •	Sample Output: c
// •	Explanation: C and A both are with minimum frequency. So c is the answer because it comes first with less index.

// import java.util.Scanner;

// public class Ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         sc.close();

//         int[] freq = new int[128]; // Only for ASCII

//         // Count frequency of each character
//         for (int i = 0; i < s.length(); i++) {
//             freq[s.charAt(i)]++;
//         }

//         // Find first character with minimum frequency
//         char minChar = s.charAt(0);
//         int minCount = freq[minChar];

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (freq[ch] < minCount) {
//                 minCount = freq[ch];
//                 minChar = ch;
//             }
//         }

//         System.out.println(minChar);
//     }
// }

// Q7. Problem Statement
// Rohit loves to play with sequences so he has given you a sequence to solve. To prove to him that you are a good coder, you accept the challenge. Find the sum of the sequence. Given three integers i, j, k. Find  i + (i+1) + (i+2) + (i+3) … j + (j-1) + (j-2) + (j-3) …….. k
// •	Example:
// i=5
// j=9
// k=6
//  Sum of all values from i to j and back to k:  5 + 6 + 7 + 8 + 9 + 8 + 7 + 6 = 56
// CONSTRAINTS:
//  -108 <= i, j, k <= 108
//    i, k <= j
 
// •	SAMPLE CASE 0:
//  0  → i = 0
//  5  → j = 5
// -1  → k = -1
// •	SAMPLE OUTPUT 0:  24
// •	EXPLANATION 0:  0 + 1 + 2 + 3 + 4 + 5 + 4 + 3 + 2 + 1 + 0 – 1 = 24

// import java.util.Scanner;

// public class Ques {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int i = s.nextInt();
//         int j = s.nextInt();
//         int k = s.nextInt();
//         int sum = 0;

//         //in first i to j 
//         for(int x = i; x <= j; x++){
//               sum = sum + x;
//         }

//         //in second j t0 k in -
//         for(int x = j - 1; x >= k; x--){
//              sum = sum + x;
//         }

//         System.out.println(sum);
//     }
// }

// Q8. Problem Statement
// The principal has a problem with repetitions. Every time someone sends the same email twice he becomes angry and starts yelling. His assistant filters the mails so that all the unique mails are sent only once, and if someone is sending the same mail again and again, he deletes them. Write a program that will see the list of roll numbers of the student and find how many emails are to be deleted.
// •	Sample Input:  6,  [ 1, 3, 3, 4, 3, 3 ]
// •	Sample Output: 3

// import java.util.*;

// public class Ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//        //to give delete count//
//         int delete = 0;

//         for (int i = 0; i < n; i++) {

//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     delete++;
//                     break; 
//                 }
//             }
//         }

//         System.out.println(delete);
//     }
// }



