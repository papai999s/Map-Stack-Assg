import java.util.*;
public class BaseballGame_3 {
    public static void main(String[] args) {
        String input[]={"5","2","C","D","+"};
        Stack<String> s=new Stack<>();
        int len=input.length;
        for(int i=0;i<len;i++)
        {
            String j=input[i];
            if(j.equals("C"))
            s.pop();
            else if(j.equals("+"))
            {
                int a=Integer.parseInt(s.pop());
                int b=Integer.parseInt(s.pop());
                int c=a+b;
                s.push(b+"");
                s.push(a+"");
                s.push(c+"");
            }
            else if(j.equals("D"))
            {
                int a=Integer.parseInt(s.peek());
                a=a*2;
                s.push(a+"");
            }
            else
            {
                s.push(j);
            }
            System.out.println(s);
        }
        int sum=0;
        while(!s.empty())
        {
            sum=sum+Integer.parseInt(s.pop());
        }
        System.out.println(sum);
    }
}
