import java.util.regex.*;
public class C4
{
    public void name(String s)
    {
        
        String str[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int a[] = {2,3,4,5,6,7,8,9};
        String res="";
        for(int i=0;i<s.length();i++)
        {
            Pattern p = Pattern.compile(s.charAt(i)+"");
            for(int j=0;j<8;j++)
            {
                Matcher m = p.matcher(str[j]);
                while(m.find())
                {
                    System.out.print(a[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] ags)
    {
        
        Water w = new Water();
        w.name("amazon");
    }
}
