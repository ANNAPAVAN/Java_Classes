// abstract 
abstract class Test
{
    public abstract void m1();
    public abstract void m2();
    public void m3()
    {
        System.out.println("khiran");
    }
}
abstract class Test1 extends Test 
{
    public void m1()
    {
        System.out.println("anna pavan");
    }   
}
class Test2 extends Test1 
{
    public void m2()
    {
        System.out.println("anjali");
    }
}
class Day5_Abstract 
{
    public static void main(String[] args)
    {
       Test2 t = new Test2();
       t.m1();
       t.m2();
       t.m3();
    }
}