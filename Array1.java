public class Array1
{
// var arg
    public static void sum(int... a)
    {
        int total = 0;
        for(int x1:a)
        {
            total = total+x1;
        }
        System.out.println("sum:"+total);
    }
    // public static void sum(int x,int y)
    // {
    //     System.out.println(x+y);
    // }
    // public static void sum(int x,int y,int z)
    // {
    //     System.out.println(x+y+z);
    // }
    public static void main(String[] args)
    {
        // 1D arrays declaration in three ways
        // int a[];
        // int []a;
        // int[] a;
        // int[] a={1,2,3,4,5};
        // System.out.println(a[1]);
        // int[][] a=new int[3][2];
        // Jagged arrays
        // int[][] a=new int[3][];
        // a[0] = new int[1];
        // a[1] = new int[3];
        // a[2] = new int[4];
        // System.out.println(a.length);
        // System.out.println(a[0].length+a[1].length+a[2].length);
        // int[] a[]=new int[][];



        // length vs length()

        // normal arrays
        // int a[] = {1,2,3,4,5,6,7,8,9,10};
        // add(a);

        // ANONYMOUS ARRAYS
        
        // add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12});

        // Varaible argument methods
        sum(1,2,3);
        sum(1,2,3,4,5);
        sum(1,2,3,4,5,6,7,8);
        

    }
    // public static void add(int[] a)
    // {
    //     int total = 0;
    //     for(int x1:a)
    //     {
    //         total = total+x1;
    //     }
    //     System.out.println("sum:"+total);
    // }

    
     

}
