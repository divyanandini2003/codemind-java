import java.util.*;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i;
        int m=sc.nextInt();
        int[] a=new int[100];
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {
            if(a[i]%2!=0)
            {
                c++;
            }
        }
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}