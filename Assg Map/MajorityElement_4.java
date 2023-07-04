import java.util.*;
public class MajorityElement_4 {
    public static void main(String[] args) {
        int ar[]={2,9,4,5,8};
        TreeMap<Integer,Integer> m=new TreeMap<>();
        for(int i=0;i<ar.length;i++)
        {
            m.put(ar[i], 0);
        }
        System.out.println(m.lastKey());
    }
}
