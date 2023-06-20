// final
// -----------------------------------------
// class level:

// final class Day5_final 
// {
//     public static void main(String[] args)
//     {

//     }
// }
// class Test extends Day5_final
// {

// }

// method level:
// class Day5_final 
// {
//     public final void marry()
//     {
//         System.out.println("subba laxmi");
//     }
//     public static void main(String[] args)
//     {

//     }
// }
// class Test extends Day5_final
// {
//     public void marry()
//     {
//         System.out.println("9tara");
//     }
// }


// variable level 

// final class Day5_final 
// {
//     final int x;
//     public static void main(String[] args)
//     {
        
//     }
// }


// final_variable    --- 3 types
// 1.final instance 

// final class Day5_final 
// {
//     final int x=10;
//     public static void main(String[] args)
//     {
        
//     }
// }


// final class Day5_final 
// {
//     final int x;
//     {
//         x=10;
//     }
//     public static void main(String[] args)
//     {
        
//     }
// }

// final class Day5_final 
// {
//     final int x;
//     Day5_final()
//     {
//         x=10;
//     }

//     public static void main(String[] args)
//     {
//         Day5_final f = new Day5_final();
//         // x=10; //error
//     }
// }

// 2.final static 


// final class Day5_final 
// {
//     final static int x=10;

//     public static void main(String[] args)
//     {
//         System.out.println("final");
//     }
// }

// final class Day5_final 
// {
//     final static int x;

//     static 
//     {
//         x=10;
//     }

//     public static void main(String[] args)
//     {
//         System.out.println("final");
//     }
// }

// 3.final local variables

final class Day5_final 
{
    public static void main(String[] args)
    {
        int x;
        // System.out.println(x);
    }
}



