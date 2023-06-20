import java.util.*;
public class C1
{
    public static void main(String []pavan)
    {
        Scanner sc = new Scanner(System.in);
        int size,n,i;
        System.out.println("Enter size of array:");
        size=sc.nextInt();
        
        int a[] = new int[size];
        System.out.println("Enter "+size+" numbers:");
        for(i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int max = a[a.length-1]-a[0];
        
        System.out.println("Max Diff:"+max);
    }
}