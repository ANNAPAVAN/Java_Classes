import java.util.*;
class B1
{
    public static void main(String []pavan)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a num:");
        n=sc.nextInt();
        String n1 = n+"";
        String n2 = n1.charAt(0)+""+n1.charAt(n1.length()-1);
        int r = Integer.parseInt(n2);
        if(n%r==0)
        {
            System.out.println("Gapful");
        }
        else
        {
            System.out.println("Not Gapful");
        }
    }
}
