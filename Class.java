import java.util.*;




// 2.	Sort an array according to the order defined by another array
// Given two arrays A1[] and A2[], sort A1 in such a way that the relative order among the elements will be same as those are in A2. For the elements not present in A2, append them at last in sorted order. 
// Example: 
// Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
//            A2[] = {2, 1, 8, 3}
// Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}
// Input: A1[] = {4, 5, 1, 1, 3, 2}
//            A2[] = {3, 1}
// Output: A1[] = {3, 1, 1, 2, 4, 5}

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;

// public class Class {
//     public static void main(String[] args) {
//         // Sample input like A1 and A2
//         ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8));
//         ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(2, 1, 8, 3));

//         ArrayList<Integer> result = new ArrayList<>();

//         // Step 1: Add elements from A1 that are present in A2, in the order of A2
//         for (int n : A2) {
//             while (A1.contains(n)) {
//                 result.add(n);
//                 A1.remove((Integer) n); // Remove by value, not index
//             }
//         }

//         // Step 2: Sort remaining elements and add to result
//         Collections.sort(A1);  // A1 now contains only leftover elements
//         result.addAll(A1);

//         // Final Output
//         System.out.println("Sorted A1 according to A2: " + result);
//     }
// }



// 3.	Check if it is possible to sort an array with conditional swapping of adjacent allowed
// We are given an unsorted array of integers in the range from 0 to n-1. We are allowed to swap adjacent elements in array many number of times but only if the absolute difference between these element is 1. Check if it is possible to sort the array.If yes then print “yes” else “no”. 
// Examples: 
// Input : arr[] = {1, 0, 3, 2}
// Output : yes
// Explanation:- We can swap arr[0] and arr[1].
// Again we swap arr[2] and arr[3]. 
// Final arr[] = {0, 1, 2, 3}.
// Input : arr[] = {2, 1, 0}
// Output : no

