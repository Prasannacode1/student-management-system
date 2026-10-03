class Father{
    String bike(){
        String a = "old";
        System.out.println("XL 100");
        return a;
    }
}
class Son extends Father{
    String bike(){
        String a = "new";
        System.out.println("Enfield");
        return a;
    }
}
public class MethodOverRidding {
    public static void main(String[] args) {
        Son s = new Son();
        String result = s.bike();
        System.out.println(result);

        
        
    }
}
