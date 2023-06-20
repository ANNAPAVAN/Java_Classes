class Test 
{
    int x=10;
}

public class Constructors extends Test
{
    public void m1()
    {
        System.out.println(super.x);
    }
    public static void main(String[] args)
    {
        Constructors c = new Constructors();
        c.m1();
    }
}