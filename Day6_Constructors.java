// topics
// 1.Diff bw constructors and instance blocks 
// 2.Rules for writing constructors 
// 3.default Constructor
// 4.super(),this() methods
// 5.super , this keywords 
// 6.Overloaded Constructors 

// ------------------------------------------------------------------------

// class Test 
// {
//     {
//         System.out.println("instance called");
//     }
//     Test()
//     {
//         System.out.println("constructor called");
//     }

    
// }

// public class Day6_Constructors 
// {
//     public static void main(String[] pavan)
//     {
//         Test t = new Test();
//     }
// }

// -----------------------
// class Test 
// {
//     String name;

//     {
//         System.out.println("instance called........................");
//     }
//     Test()
//     {
//         System.out.println("constructor called............................");
//     }

//     Test(String n)
//     {
//         name = n;
//         System.out.println("constructor called............................"+name);
//     }
    
    
// }

// public class Day6_Constructors 
// {
//     public static void main(String[] pavan)
//     {
//         Test t = new Test();
//         Test t2 = new Test("anna pavan");
//     }
// }

// ----------------------------------------------------------------
// class Test 
// {
    
//     Test()
//     {
//         System.out.println("constructor called............................");
//     } 
// }

// public class Day6_Constructors 
// {
//     private Day6_Constructors()
//     {
//         System.out.println("constructor called............................private");
//     }
//     public static void main(String[] pavan)
//     {
//         Day6_Constructors d = new Day6_Constructors();
//     }
// }

// -------------------------------------------------------------------------------------------

// super() , this()

// class Test 
// {
//     int i;
//     Test()
//     {
//         System.out.println("constructor called..........Test..........");
//     }
//     Test(int n)
//     {
//         System.out.println("constructor called..........Test..........int");
    
//     }
// }

// public class Day6_Constructors extends Test
// {
//     String name;
//     int j;
//     Day6_Constructors()
//     {
//         System.out.println("constructor called..........Day6.............");
//     }
//     Day6_Constructors(int m)
//     {
//         System.out.println("constructor called..........Day6.............int");
//     }
//     Day6_Constructors(String n)
//     {
//         super(40);
//         //  this(10);
//          System.out.println("constructor called..........String");
//         //  super(40); //call to super must be first statement in constructor
//     }
//     public static void main(String[] pavan)
//     {
//         // Day6_Constructors d = new Day6_Constructors();
//         Day6_Constructors d = new Day6_Constructors("pavan");
//     }
// }

// super vs this keyword
class Test  
{
    int x=100;
    public static void m2()
    {
       System.out.println("m2");
    }
}

class Day6_Constructors extends Test1
{
    int x=1000;
    public static void main(String arhs[])
    {
        Day6_Constructors d = new Day6_Constructors();
        d.m1();
    }
    public void m1()
    {
        System.out.println(this.x);
        System.out.println(super.x);
        super.super.m2();
    }
}

