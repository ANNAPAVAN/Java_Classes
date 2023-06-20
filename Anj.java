interface anj1
{
    void m1();
    //void m2();

}

 class dulam implements anj1
{
    public void m1()
    {
        System.out.println("m1");

    }

    // public void m2()
    // {
    //     System.out.printl("m1");

    // }

    
}

public class Anj{
    public static void main(String[] args)
    {
        dulam obj= new dulam();
        obj.m1();
    }

}