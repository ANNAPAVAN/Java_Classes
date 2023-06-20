class Test 
{
    public void m1()
    {
        System.out.println("m1.........");
    }
    public void m1(int x)
    {
        System.out.println("int m1.....");
    }
}
class Test1 extends Test
{
    public void m2()
    {
        System.out.println("m2.......");
    }
    public void m2(int x)
    {
        System.out.println("int m2........");
    }
}

public class Day8_Overload 
{
    public static void main(String[] str)
    {
        // Test t = new Test();
        // Test1 t1 = new Test1();
        Test t1= new Test1();
        // Test1 t1 = new Test();  //not possible
        // t1.m1();
        // t1.m1(10);
        // t1.m2();
        // t1.m2(10);

        
    }
}