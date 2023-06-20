
import java.util.*;
public class C2
{
    public static void main(String []pavan)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        int r1,r2,c1,c2,r;
        System.out.println("Enter size:");
        n=sc.nextInt();
        r1=0;
        r2=n-1;
        c1=0;
        c2=n-1;
        int a1[] = new int[n*n];
        System.out.println("Enter numbers:");
        for(i=0;i<n*n;i++)
        {
            
            a1[i] = sc.nextInt();
            
        }
        int a[][] = new int[n][n];
        int k=0;
        while(k<n*n)
        {
            for(j=c1;j<=c2;j++)
            {
                a[r1][j]=a1[k];
                k++;
            }
            r1++;
            for(j=r1;j<=r2;j++)
            {
                a[j][c2]=a1[k];
                k++;
            }
            c2--;
            for(j=c2;j>=c1;j--)
            {
                a[r2][j]=a1[k];
                k++;
            }
            r2--;
            for(j=r2;j>=r1;j--)
            {
                a[j][c1]=a1[k];
                k++;
            }
            c1++;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}