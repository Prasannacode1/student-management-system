class PSNA{
    private int a;
    int getter(){
        return a;
    }
    void setter(int a){
        this.a=a;
    }
    
}
public class getters {
    public static void main(String[] args){
        PSNA psna = new PSNA();
        psna.setter(80);
        int result = psna.getter();
        System.out.println(result);
    }
}
