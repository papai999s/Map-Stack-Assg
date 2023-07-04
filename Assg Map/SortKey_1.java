import java.util.*;
public class SortKey_1 {
    public static void main(String[] args) {
        Map<Integer,String> m=new LinkedHashMap<>(); //Order is preserved
        m.put(5,"Rahul");
        m.put(7,"Lakshman" );
        m.put(1, "Ram");
        m.put(4,"Krrish" );
        m.put(2 ,"Lakshay");
        System.out.println(m);
        // Set s=m.entrySet();
        // Iterator i=s.iterator();
        // while(i.hasNext())
        // {
        //     Map.Entry entry=(Map.Entry)i.next();
        //     System.out.println(entry.getKey()+" = "+entry.getValue());
        // }
        System.out.println("After Sorting");
        Map <Integer,String> sortedM=new TreeMap<>(m);
        System.out.println(sortedM);

    }
}
