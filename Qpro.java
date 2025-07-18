
import java.util.Scanner;


// public class Qpro {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         char[] arr = {'e', 'b', 'f', 'g'};
        
//         for(int i = 0; i < arr.length; i++){
//             int count = 0;
//             for(int j = 0; j < str.length(); j++){
//                 if(arr[i] == str.charAt(j)){
//                     count++;
//                 }
//             }
//             System.out.println( arr[i] + ":" + count);
//         }
//     }   
// }

// class Qpro{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         System.out.println(sym(str));
//     }

//     static boolean sym(String str){
//          if(str.length()%2 != 0){
//             return false;
//          }
//          int mid = str.length()/2;
//          for(int i = 0; i < str.length()/2; i++){
//             if(str.charAt(i) !=  str.charAt(mid)){
//                 return false;
//             }
//             mid++;
//          }
//          return true;
//     }
// }

// class Qpro{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         int count = 0;
//         for(int i = 0; i < str.length(); i++){
//             //String to charater
//             char ch = str.charAt(i);
//             if(Character.isLetter(ch)){
//                 count++;
//             }
//         }
//          System.out.println(count);
//     }
// }

// class Qpro{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         int count = 0;
//         for(int i = 0; i < str.length(); i++){
//             //String to charater
//             char ch = str.toLowerCase().charAt(i);
//             if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
//                 count++;
//             }
//         }
//          System.out.println(count);
//     }
// }

// class Qpro{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
        
//         List<String> words = Arrays.asList(str.split(" "));
//         Collections.reverse(words);

//         System.out.println(String.join(" ", words));
//     }
// }


// class Qpro{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         int countletter = 0;
//         int countdigit = 0;
//         for(int i = 0; i < str.length(); i++){
//             //String to charater
//             char ch = str.charAt(i);
//             if(Character.isLetter(ch)){
//                countletter ++;
//             }
//             if (Character.isDigit(ch)) {
//                 countdigit++;
//             }
//         }
//         if(countletter > 0 && countdigit > 0 ){
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
// }


// class Qpro {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
        
//         boolean a = false, e = false, i = false, o = false, u = false;

//         for (int j = 0; j < str.length(); j++) {
//             char ch = str.toLowerCase().charAt(j);
//             if (ch == 'a') a = true;
//             if (ch == 'e') e = true;
//             if (ch == 'i') i = true;
//             if (ch == 'o') o = true;
//             if (ch == 'u') u = true;
//         }

//         if (a && e && i && o && u) {
//             System.out.println("Accepted");
//         } else {
//             System.out.println("Not Accepted");
//             if(!a) System.out.println("'a'");
//             if(!e) System.out.println("'e'");
//             if(!i) System.out.println("'i'");
//             if(!o) System.out.println("'o'");
//             if(!u) System.out.println("'u'");
//         }
//     }
// }

class Qpro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char str2[] = str.toCharArray();
        int x = 1;
        int i,j;
        for (i = 1; i < str2.length; i++) {
                for(j = i-1; j >= 0; j--){
                    if(str2[i] == str2[j])
                        break;
                }
                if(j == -1){
                    str2[x++] = str2[i];
                }
            }
            for(j = 0; j < x; j++)
                System.out.print(str2[j]);
    }    
}



