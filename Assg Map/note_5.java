import java.util.*;
public class note_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of magazine");
        String magazine=sc.next();
        System.out.println("Enter the value of ransomNote");
        String ransomNote=sc.next();
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char k=magazine.charAt(i);
            if(m1.containsKey(k))
            {
                m1.put(k,m1.get(k)+1);
            }
            else
            {
                m1.put(k, 1);
            }
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char k=ransomNote.charAt(i);
            if(m2.containsKey(k))
            {
                m2.put(k,m2.get(k)+1);
            }
            else
            {
                m2.put(k, 1);
            }
        }
        boolean poosible=true;
        Set s=m2.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Map.Entry e=(Map.Entry)i.next();
            char key=(char)e.getKey();
            int freq=(int)e.getValue();
            if(m1.containsKey(key))
            {
                if(freq>m1.get(key))
                poosible=false;
            }
            else
            poosible=false;
        }
        System.out.println(poosible);
    }
}
