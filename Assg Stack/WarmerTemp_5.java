import java.util.*;
public class WarmerTemp_5 {
    public static void main(String[] args) {
        int a[]={73,74,75,71,69,72,76,73};
        Stack<Integer> s=new Stack<>();
        int len=a.length;
        int sol[]=new int[len];
        for(int i=len-1;i>=0;i--)
        {
            while(!s.empty()&&a[s.peek()]<=a[i])
            {
                s.pop();
            }
            if(s.empty())
            {
                sol[i]=0;
            }
            else{
                sol[i]=s.peek()-i;
            }
            s.push(i);
        }
        for (int i : sol) {
            System.out.print(i+" ");
        }
    }
}
