import java.util.Scanner;
public class Exception2 {
    public static void checkage(int age)throws Exception{
        if(age<18){
            throw new Exception("Not Eligible");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            checkage(age);
        }
        catch(Exception e){
            System.out.println(e.getmessage());

        }
    }
    
}
