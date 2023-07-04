import java.util.*;
public class Decode_2 {
    public static void main(String[] args) {
        String str="3[a2[bc]]d";
        Stack<String> s=new Stack<>();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char k=str.charAt(i);
            if(k==']')
            {
                String temp="",out="";
                while(!s.peek().equals("["))
                {
                    temp=s.pop()+temp;
                }
                s.pop();
                String n="";
                while(!s.empty()&&s.peek().charAt(0)>='0'&&s.peek().charAt(0)<='9')
                n=s.pop()+n;

                for(int j=1;j<=Integer.parseInt(n);j++)
                {
                    out=out+temp;
                }
                s.push(out);
            }
            else
            {
                s.push(k+"");
            }
        }
        String out="";
        while(!s.isEmpty())
        {
            out=s.pop()+out;
        }
        System.out.println(out);
    }    
}
