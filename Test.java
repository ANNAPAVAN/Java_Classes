import java.io.*;
class Test 
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("abc.txt");
        System.out.println(f.exists());
        // f.createNewFile();
        // File f1=new File("anna","pavan.txt");
        // f1.createNewFile();   
    }
}