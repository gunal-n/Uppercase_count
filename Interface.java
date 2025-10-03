// interface hello {
//      void say(String meg);
// }
// class word implements hello {
//      public void say(String meg){
//         System.out.println(meg);
//      } 
// }
// public class Interface {
//     public static void main(String[] args) {
//       hello h = new word();
//       h.say("Hi..");  
//     }
// }

// Interface with Lambda function
// interface hello {
//      void say(String meg);
// }
// class word implements hello {
//      public void say(String meg){
//         System.out.println(meg);
//      } 
// }
// public class Interface {
//     public static void main(String[] args) {
//       hello h = (meg) ->{
//         System.out.println("Message : " + meg);
//       };
//           h.say("Hi.. Gunal...");

//     }
// }

// import java.util.Scanner; 

// class Interface 
// { 
//    public static void main(String args[]) 
//    { 
//       int x, y, temp; 
//       System.out.println("Enter x and y"); 
//       Scanner inn = new Scanner(System.in); 

//       x = inn.nextInt(); 
//       y = inn.nextInt(); 

//       System.out.println("Before Swapping\nx = "+x+"\ny = "+y); 

//       temp = x; 
//       x = y; 
//       y = temp; 

//       System.out.println("After Swapping\nx = "+x+"\ny = "+y); 
//       inn.close();
//    }
// }

// import java.util.*;

// class employee {
//    String name ;
//    String address;
//    int salary ;
//    String jobtitle ;

//    employee(String name, String address, int salary, String jobtitle) {
//         this.name = name;
//         this.address = address;
//         this.salary = salary;
//         this.jobtitle = jobtitle;
//     }

//    void display(){
//       System.out.println("name = " + name);
//       System.out.println("address = " + address);
//       System.out.println("salary = " + salary);
//       System.out.println("jobtitle = " + jobtitle);
//    }
// }

// class manager extends employee {
//     manager(String name, String address, int salary, String jobtitle){
//       super(name,address,salary,jobtitle);
//     }
// }

// class developer extends employee {
//       developer(String name, String address, int salary, String jobtitle){
//          super(name,address,salary,jobtitle);
//       }
// }

// class programer extends employee {
//         programer(String name, String address, int salary, String jobtitle){
//          super(name,address,salary,jobtitle);
//         }
// }

// public class Interface{
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);

//         System.out.print("Enter role (manager / developer / programer): ");
//         String role = sc.nextLine().toLowerCase();

//         // Ask for details
//         System.out.print("Enter Name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter Address: ");
//         String address = sc.nextLine();

//         System.out.print("Enter Salary: ");
//         int salary = sc.nextInt();
//         sc.nextLine(); // consume leftover newline

//         System.out.print("Enter Job Title: ");
//         String jobtitle = sc.nextLine();

//         // Create object based on role
//         employee emp = null;
//         if (role.equals("manager")) {
//             emp = new manager(name, address, salary, jobtitle);
//         } 
//         else if (role.equals("developer")) {
//             emp = new developer(name, address, salary, jobtitle);
//         } 
//         else if (role.equals("programer")) {
//             emp = new programer(name, address, salary, jobtitle);
//         } 
//         else {
//             System.out.println("Invalid role!");
//             sc.close();
//             return;
//         }

//         // Display details
//         emp.display();

//         sc.close();
//    }
// }