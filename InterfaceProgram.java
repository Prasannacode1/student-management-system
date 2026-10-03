interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment using upi");
    }
}
class CC implements Payment{
    public void pay(){
        System.out.println("Payment using credit card");
    }
}
class DC implements Payment{
    public void pay(){
        System.out.println("payment using debit card");
    }
}
public class InterfaceProgram {
    public static void main(String[] args) {
        Payment obj1 = new UPI();
        Payment obj2 = new CC();
        Payment obj3 = new DC();
        obj1.pay();
        obj2.pay();
        obj3.pay();
        
    }
    
}
