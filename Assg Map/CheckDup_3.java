import java.util.*;
public class CheckDup_3 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int len=a.length;
        Set<Integer> s=new HashSet<>();
        int flag=0;
        for(int i=0;i<len;i++)
        {
            int val=a[i];
            if(s.contains(val))
            {
                flag=1;
                break;
            }
            else
            {
                s.add(val);
            }
        }
        if(flag==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
