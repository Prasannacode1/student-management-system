class A{
    void printA(){
        System.out.println("A");
    }
}
class B extends A{
    void printB(){
        System.out.println("B");
    }
}
class C extends B{
    void printC(){
        System.out.println("C");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.printA();
        obj.printB();
        obj.printC();
        
    }
}
