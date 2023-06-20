enum Beer
{
    KF,KO,OC;
    Beer()
    {
        System.out.println("Constructor called");
    }
    public int getPrice()
    {
        return 100;
    }
}
class Enumer 
{
    public static void main(String... args)
    {
        // Beer b = Beer.KF;
        Beer[] b = Beer.values();
        // System.out.println("anna pavan");
        for(Beer b1:b)
        {
            System.out.println(b1.ordinal()+"."+b1+"......"+b1.getPrice());
        }
    }
}

// class Enumer extends Beer     # cannot inherit from final Beer  or enum classes are not extensible
// {
//     public static void main(String... args)
//     {
        
//         System.out.println("anna pavan");
//     }    
// }