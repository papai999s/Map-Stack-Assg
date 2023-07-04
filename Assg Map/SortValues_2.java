import java.util.*;

public class SortValues_2 {
    public static void main(String[] args) {
        Map<Integer,String> m=new LinkedHashMap<>(); //Order is preserved
        m.put(5,"Rahul");
        m.put(7,"Lakshman" );
        m.put(1, "Ram");
        m.put(4,"Krrish" );
        m.put(2 ,"Lakshay");
        System.out.println(m);
        Map<String,Integer> m2=new TreeMap<>();
        Set s=m.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Map.Entry entry=(Map.Entry)i.next();
            int key=(int)entry.getKey();
            String val=(String)entry.getValue();
            m2.put(val, key);
        }
        System.out.println(m2);
    }
}
