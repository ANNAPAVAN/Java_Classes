// Definations:
// 1.Any service requirement specification is considered as an interface 
// 2.from client point of view an interface defines the set of services what he is expecting
// 3.from service provider point of view an interface defines as the set of services what he is offering 
// 4.Inside interface every method is public and abstract whether we are declaring or not hence interface is considered as 100% pure abstract classes

// topics:
// 1.extends vs implements
// 2.class X extends Y implements Z
// 3.interface variables
// 4.method naming conflicts
// ---> For different implements
// 5.interface variable naming conflicts
// 6.Marker Interface 
// 7.Adapter Class 
// 8.Nested Interfaces


// interface Pavan 
// {
//     void m1();  //public abstract void m1(); or public void m1(); or abstract void m1(); 
//     void m2();
//     void m3();
// }

// class Test implements Pavan
// {
//     public void m1()
//     {
//         System.out.println("Anna pavan");
//     }
//     public void m2(){}
//     public void m3(){}
// }


// public class Day6_Interfaces
// {
//     public static void main(String[] args)
//     {
//         Test t=new Test();
//         t.m1();
//     }
// }
// --------------------------------------------------------------------------------------
// 1.extends vs implements

// interface A 
// {
//     void m1();
// }
// interface B 
// {
//     void m2();
// }
// class Test implements A,B
// {
//     public void m1()
//     {
//         System.out.println("m1");
//     }
//     public void m2()
//     {
//         System.out.println("m2");
//     }
// }
// public class Day6_Interfaces
// {
//     public static void main(String[] args)
//     {

//     }
// }

// ------------------------------------------------------------------------
// interface A 
// {
//     void m1();
// }
// interface B 
// {
//     void m2();
// }
// class Anna 
// {
//     public void m3()
//     {
//         System.out.println("m3");
//     }
// }
// class Test extends Anna implements A,B
// {
//     public void m1()
//     {
//         System.out.println("m1");
//     }
//     public void m2()
//     {
//         System.out.println("m2");
//     }
// }
// public class Day6_Interfaces
// {
//     public static void main(String[] args)
//     {
//         Test t = new Test();
//         t.m1();
//         t.m2();
//         t.m3();
//     }
// }
// ----------------------------------------------------------------
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
//         System.out.println("m1");
//     }
//     public void m2()
//     {
//         System.out.println("m2");
//     }
//     public void m3()
//     {
//         System.out.println("m3");
//     }
// }
// public class Day6_Interfaces
// {
//     public static void main(String[] args)
//     {

//     }
// }

// ------------------------------------------------------------------------

// interface variable 

// interface A 
// {
//     int x=10; 
// }
// public class Day6_Interfaces implements A
// {
//     public static void main(String[] args)
//     {
//         x=100;  
//     }
// }
// --------------------------------------------------------
// interface A 
// {
//     int x=10; 
// }
// interface B 
// {
//     int x=100;
// }
// public class Day6_Interfaces implements A,B
// {
//     public static void main(String[] args)
//     {
//         // System.out.println(x);  //reference to x is ambiguous
//         System.out.println(A.x);
//         System.out.println(B.x);
//     }
// }
// -----------------------------------------------------------------------

// interface A 
// {
//     void m1();
// }
// interface B 
// {
//     void m1();
// }
// // class Test implements A,B
// // {
// //     public void m1(){}
// // }
// public class Day6_Interfaces implements A,B
// {
//     public void m1()
//     {
//         System.out.println("same implementation");
//     }
//     public static void main(String[] args)
//     {
       
//     }
// }

//----------------------------------------------------
// interface A 
// {
//     void m1();
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
// public class Day6_Interfaces 
// {
   
//     public static void main(String[] args)
//     {
//        Test1 t1 = new Test1();
//        t1.m1();
//        Test2 t2 = new Test2();
//        t2.m1();
//     }
// }

// --------------------------------------------------------------------------------------

//  8.Nested Interfaces

// 1. interface inside class 
// 2.interface inside another interface 

// class Pavan 
// {
//     interface Anna 
//     {
//         void m1();
//     }
// }

// class Test implements Pavan.Anna 
// {
//     public void m1()
//     {
//         System.out.println("M1");
//     }
// }
// public class Day6_Interfaces 
// {
//     public static void main(String arhs[])
//     {
//         Test t1 = new Test();
//         t1.m1();
//     }
// }

// --------------------
interface Pavan 
{
    interface Anna 
    {
        void m1();
    }
}

class Test implements Pavan.Anna 
{
    public void m1()
    {
        System.out.println("M11111111111111");
    }
}
public class Day6_Interfaces 
{
    public static void main(String arhs[])
    {
        Test t1 = new Test();
        t1.m1();
    }
}
 
