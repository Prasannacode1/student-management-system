import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(51);
        list.add(65);
        list.add(4);
        list.add(58);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2,100);
        System.out.println(list.get(2));
        list.remove(4);
        System.out.println(list);
        System.out.println(list.size());
        //----------------------------------------------------
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("prasanna");
        hashSet.add("praveen");
        hashSet.add("mukesh");
        hashSet.add("steve");
        hashSet.add("vijay");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("praveen"));
        hashSet.remove("prasanna");
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        //---------------------------------------------------------
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"kumar");
        map.put(102,"naveen");
        map.put(103,"manoj");
        map.put(104,"sumith");
        System.out.println(map);
        map.put(104,"ravi");
        System.out.println(map);
        System.out.println(map.get(103));
        System.out.println(map.containsKey(101));
        map.remove(102);
        System.out.println(map);
        System.out.println(map.keySet());




    }
    
}
