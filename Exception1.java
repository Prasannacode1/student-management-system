import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            System.out.println(a);

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("hii");
        }
        
    }
}
