// class Parant{
//     void add(int a, int b){
//             System.out.println(a + b);
//     }
// }
// class child extends Parant{
//     void sub(int a, int b){
//         System.out.println(a - b);
//     }
// }
// class grandpa extends child{
//     void mult(int a, int b){
//         System.out.println(a * b);
//     }
// }

// public class Level {
//     public static void main(String[] args) {
//         grandpa n = new grandpa();
//         n.add(5,5);
//         n.sub(5,1);
//         n.mult(1,2);
        
//     }
    
// }


// constractor methods


class grandpa{
    grandpa(int a, int b){
            System.out.println(a + b);
    }
    void add(){
        System.out.println("Abb");
    }
}
class Parant extends grandpa{
    Parant(int a, int b){
        super(a, b);
        System.out.println(a - b);
    }
        void sub(){
        System.out.println("sub");
    }
}
class child extends Parant{
    child(int a, int b){
        super(a, b);
        System.out.println(a * b);
    }
        void mult(){
        System.out.println("mult");
    }
}

public class Level {
    public static void main(String[] args) {
      child c = new child(10,5);
      c.add();
      c.sub();
      c.mult(); 
    }
    
}
