import java.util.Stack;

public class LargestAreaSq_1
{
    public static void main(String[] args) {
        int matrix[][]={{ 1 , 0 , 1 , 0 , 0 },{ 1 , 0 , 1 , 1 , 1 },{ 1 , 1 , 1 , 1 , 1 },{ 1 , 0 , 0 , 1 , 0 }};
        System.out.println("Matrix");
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        int area=maximalRectangle(matrix);
        System.out.println("Max area is "+area);
    }
     public static int maximalRectangle(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int sum[]=new int[c];
        for(int i=0;i<c;i++)
        {
            sum[i]=matrix[0][i];
        }
        int max=largestRectangleArea(sum);
        for(int i=1;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    sum[j]=0;
                }
                else
                {
                    sum[j]++;
                }
            }
            int area=largestRectangleArea(sum);
            if(area>max)
            max=area;
        }
        return max;
    }
    public static int largestRectangleArea(int[] ar) {
        int len=ar.length;
        int previousSmallest[]=new int[len];
        int nextSmallest[]=new int[len];
        findPreviousSmallest(ar,previousSmallest);
        findNextSmallest(ar,nextSmallest);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            int area=ar[i]*(nextSmallest[i]-previousSmallest[i]-1);
            if(area>max)
            max=area;
        }
        return max;
    }
    public static void findNextSmallest(int[] ar, int[] nextSmallest) {
        Stack<Integer> s=new Stack<>();
        int len=ar.length;
        for(int i=len-1;i>=0;i--)
        {
            while(!s.empty() && ar[s.peek()]>=ar[i])
            {
                s.pop();
            }
            if(s.empty())
            {
                nextSmallest[i]=len;
            }
            else
            {
                nextSmallest[i]=s.peek();
            }
            s.push(i);
        }
    }
    private static void findPreviousSmallest(int[] ar, int[] previousSmallest) {
        Stack<Integer> s=new Stack<>();
        int len=ar.length;
        for(int i=0;i<len;i++)
        {
            while(!s.empty() && ar[s.peek()]>=ar[i])
            {
                s.pop();
            }
            if(s.empty())
            {
                previousSmallest[i]=-1;
            }
            else
            {
                previousSmallest[i]=s.peek();
            }
            s.push(i);
        }
    }
}