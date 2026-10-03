abstract class school{
    abstract void study();
}
class student extends school{
    void study(){
        System.out.println("prasanna");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        student obj = new student();
        obj.study();
        
    }
}
