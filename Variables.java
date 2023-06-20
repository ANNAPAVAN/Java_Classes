class Test 
{
    int x=100; //instance
}

public class Variables 
{
    int a=10; //instance
    static int b=20;  //static
    public static void main(String[] pavan)
    {
        int c=30;  //local 
        System.out.println(c);
        System.out.println(b);
        Variables v = new Variables();
        v.m1();

    }
    public void m1()
    {
        System.out.println(a);
        Test t=new Test();
        System.out.println(t.x);
    }
}