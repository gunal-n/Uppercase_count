// package KAAR_TECH.Mallow_Tech;
// 01) Print characters in decreasing order of frequency.

import java.util.*;

 class Mellow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] arr = new int[256];
        char[] chars = new char[256];

        for (int i = 0; i < 256; i++) {
            chars[i] = (char) i;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int x = (int) ch;
            arr[x]++;
        }
        for (int i = 0; i < 256; i++) {
            for (int j = i + 1; j < 256; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    char tempc = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tempc;

                }
            }
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] > 0) {
                System.out.println(chars[i] + " " + arr[i]);
            }
        }
        s.close();
    }
}        