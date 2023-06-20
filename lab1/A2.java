import java.util.*;
public class Main
{
    String b1,b2,b3;
    Main(String b1,String b2,String b3)
    {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        m1();
    }
    public void m1()
    {
        LinkedHashMap<String, Integer> l = new LinkedHashMap<>();
        l.put("black", 0);
        l.put("blue", 1);
        l.put("red", 2);
        l.put("orange", 3);
        l.put("yellow", 4);
        l.put("green", 5);
        l.put("violet", 6);
        l.put("gray", 7);
        l.put("white", 8);
        String s="";
        Integer r1 = l.get(b1);
        Integer r2 = l.get(b2);
        Integer r3 = l.get(b3);
        
        String res = r1+""+r2+"*"+r3+"k ohms";
        
        System.out.println("Req:"+res);
        
    }
    public static void main(String []pavan)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three band colors:");
        String b1 = sc.next();
        String b2 = sc.next();
        String b3 = sc.next();
        Main m = new Main(b1,b2,b3);
        
        
    }
}
