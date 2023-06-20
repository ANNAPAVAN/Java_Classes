// interface Pavan 
// {
//     void m1();
//     void m2();
// }
// abstract class Test implements Pavan 
// {
//     public void m1()
//     {
//         System.out.println("M1");
//     }
// }
// class Test1 extends Test 
// {
//     public void m2()
//     {
//         System.out.println("M2");
//     }
// }

// public class Interfaces 
// {
//     public static void main(String[] args)
//     {
//         Test1 t = new Test1();
//         t.m1();
//         t.m2();
//     }
// }

// extends vs implements
// ----------------------------------------------------------------------------------------------------------

// interface A 
// {
//     void m1();
// }
// interface B 
// {
//     void m2();
// }
// interface C extends A,B 
// {
//     void m3();
// }

// class Test implements C 
// {
//     public void m1()
//     {
//         System.out.println("M1");
//     }
//     public void m2()
//     {
//         System.out.println("M2");
//     }
//     public void m3()
//     {
//         System.out.println("M3");
//     }
// }
// public class Interfaces 
// {
//     public static void main(String []pavan)
//     {
//         Test t1 = new Test();
//         t1.m1();
//         t1.m2();
//         t1.m3();
//     }
// }


//class X extends Y implements Z
// ----------------------------------------------------------------------------------------------------------------

// interface A 
// {
//     void m1();
// }
// interface B 
// {
//     void m2();
// }
// interface C extends A,B 
// {
//     void m3();
// }
// class Anna 
// {
//     public void marry()
//     {
//         System.out.println("3sha");
//     }
// }
// class Test extends Anna implements C 
// {
//     public void m1()
//     {
//         System.out.println("M1");
//     }
//     public void m2()
//     {
//         System.out.println("M2");
//     }
//     public void m3()
//     {
//         System.out.println("M3");
//     }
// }
// public class Interfaces 
// {
//     public static void main(String []pavan)
//     {
//         Test t1 = new Test();
//         t1.m1();
//         t1.m2();
//         t1.m3();
//         t1.marry();
//     }
// }

// interface variables
// ------------------------------------------------------------------------------------
// interface A 
// {
//     int x=10;
// }

// public class Interfaces implements A
// {
//     public static void main(String []pavan)
//     {
//        x=123;
//     }
// }

// method naming conflicts
// --------------------------------------------------------------------------------------------------------------------------------------
// interface A 
// {
//    void m1();
// }
// interface B 
// {
//     void m1();
// }
// public class Interfaces implements A,B
// {
//     public void m1()
//     {
//         System.out.println("AB");
        
//     }
//     public static void main(String []argss)
//     {
//         Interfaces t1 = new Interfaces();
//         t1.m1();                                 //withn object creation non static also referred in static area in same class        
//     }
// }

// For different implements

// interface A 
// {
//    void m1();
// }
// interface B 
// {
//     void m1();
// }
// class Test1 implements A 
// {
//     public void m1()
//     {
//         System.out.println("A");
//     }
// }
// class Test2 implements B 
// {
//     public void m1()
//     {
//         System.out.println("B");
//     }
// }
// public class Interfaces 
// {
//     public static void main(String []argss)
//     {
//         Test1 t1 = new Test1();
//         t1.m1();
//         Test2 t2 = new Test2();
//         t2.m1();
//     }
// }


// interface variable naming conflicts
// ---------------------------------------------------------------------------------------------------------------

// interface A 
// {
//     int x=123;
// }
// interface B 
// {
//     int x=456;
// }
// public class Interfaces implements A,B
// {
    
//     public static void main(String []argss)
//     {
//         // System.out.println(x);  // error: reference to x is ambiguous
//         System.out.println(A.x);
//         System.out.println(B.x);
//     }
// }

// Nested interfaces
// ------------------------------------------------------------------------------------------------------
// 1.Interface in class:

// class Test 
// {
//     interface Pavan 
//     {
//         void m1();
//     }
// }
// class Test1 implements Test.Pavan 
// {
//     public void m1()
//     {
//         System.out.println("M1");
//     }
// }
// public class Interfaces 
// {
//     public static void main(String[] pavan)
//     {
//         Test1 t = new Test1();
//         t.m1();
//     }
// }

// 2.Interface inside Interface 
interface A 
{
    interface B
    {
        void m1();
    }
}
class Test implements A.B
{
    public void m1()
    {
        System.out.println("m1");
    }
}
public class Interfaces 
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.m1();
    }
}


