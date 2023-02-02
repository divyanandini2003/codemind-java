import java.util.*;
import java.lang.Math;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double area,s;
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();
        s=(a+b+c)/2;
        area=(s*((s-a)*(s-b)*(s-c)));
        System.out.format("%.2f",Math.sqrt(area));
        
    }
}