class Test 
{
    public void m1()
    {
        System.out.println("m1.........");
    }
    public void m2(int x)
    {
        System.out.println("int m2.....");
    }
}
class Test1 extends Test
{
    public void m1()
    {
        System.out.println("m1.......override");
    }
    // public void m2(int x)
    // {
    //     System.out.println("int m2........override");
    // }
}

public class DaY8_Override
{
    public static void main(String[] str)
    {
        // Test t1 = new Test();
        // t1.m1();
        // t1.m2(100);
        // Test1 t1 = new Test1();
        // t1.m1();
        // t1.m2(100);
        Test t1 = new Test1();
        t1.m1();
        t1.m2(100);

        
    }
}