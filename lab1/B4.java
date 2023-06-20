import java.util.*;
public class B4
{
    public static void main(String []pavan)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String1:");
        String s1 = sc.next();
        System.out.println("Enter String2:");
        String s2 = sc.next();
        int l1 = s1.length();
        int l2 = s2.length();
        String res="";
        int i=0;
        while(i<l1 && i<l2)
        {
            res=res+s1.charAt(i)+s2.charAt(i);
            i++;
        }
        while(i<l1)
        {
            res = res+s1.charAt(i);
            i++;
        }
        while(i<l2)
        {
            res = res+s2.charAt(i);
            i++;
        }
        System.out.println("Result strning:"+res);
    }
}