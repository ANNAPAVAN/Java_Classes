// Topics
// ------
// 1.Introduction
// 2.File 
// file class Constructors
//     1.   File f = new File(String name)
//     2.   File f = new File(String subdirectory , String name);
//             File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali","anna.txt");
//             f.mkdir();
//     3.   File f = new File(File subdirectory,String name);
//             File f1 = new File(f,"a1.txt");
//             f1.mkdir();
// imp methodS
//     1.boolean exists()
//     2.boolean createNewFile()
//     3.boolean mkdir()
//     4.boolean isFile();
//     5.is Directory();
//     6.String[] list();
//     7.long length();
//     8.boolean delete();
// Q].wap to display the names of all files and directories present in C:/Users/pavan/OneDrive/Desktop/Anjali
// Q].wap to display ONLY file names present in C:/Users/pavan/OneDrive/Desktop/Anjali
// Q].wap to display ONLY Directory names present in C:/Users/pavan/OneDrive/Desktop/Anjali

// 3.FileWriter 
// ---->constructors 
//     1.FileWriter fw = new FileWriter(String fname);
//     2.FileWriter fw = new FileWriter(File f);
//     3.FileWriter fw = new FilWriter(String fname , boolean append)
//     4.FileWriter fw = new FileWriter(File f,boolean append);

//     methodS
//         1.write(int ch)
//         2.write(char[] ch);
//         3.write(String s)
//         4.flush()
//         5.close();
// 4.FileReader
// ---->constructors 
//     1.FileReader fr = new FileReader(String fname);
//     2.FileReader fr = new FileReader(File f);

//     methods 
//         1.int read()
//         2.int read(char[] ch)
//         3.void close()
// 5.BufferedWriter
// ---->constructors 
//     1.BufferedWriter bw = new BufferedWriter(writer w);
//     2.BufferedWriter bw = new BufferedWriter(writer w,int bufferSize);

//     methods
//         1.write(int ch)
//         2.write(char[] ch);
//         3.write(String s)
//         4.flush()
//         5.close();
//         6.newLine()
// 6.BufferedReader
//  ---->constructors 
//     1.BufferedReader br = new BufferedReader(reader r);
//     2.BufferedReader br = new BufferedReader(reader r,int bufferSize);

//     methods
//         1.int read()
//         2.int read(char[] ch)
//         3.void close();
//         4.String readLine() //reads next line if there is no next line returns null
// 7.PrintWriter
//  ---->constructors
//     1.PrintWriter pw = new PrintWriter(String fname);
//     2.PrintWriter pw = new PrintWriter(File f);
//     3.PrintWriter pw = new PrintWriter(writer w);

//     methodS
//         1.write(int ch)
//         2.write(char[] ch)
//         3.write(String s)
//         4.flush 
//         5.close()
//         6.print(char ch)
//         7.print(int i)
//         8.print(double d)
//         9.print(boolean b)
//         10.print(String s)
//         11.println(char ch)
//         12.println(int i)
//         13.println(double d)
//         14.println(boolean b)
//         15.println(String s)    ..................


// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//         File f = new File("abc.txt"); 
//         System.out.println(f.exists());
//         f.createNewFile();
//         System.out.println(f.exists());
//     }
// }

// File class Constructors 
// ------------------------
// 1.File f = new File(String name);
// 2.File f = new File(String directory,String name);
// 3.File f = new File(File directory,String name);

// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//         // File f = new File("abc.txt"); 
//         // System.out.println(f.exists());
//         // f.createNewFile();
//         // System.out.println(f.exists());
//         // --------------------------------------------------------
//         // File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali","abc.txt");
//         // System.out.println(f.exists());
//         // File f1 = new File("C:/Users/pavan/OneDrive/Desktop/Anjali","abcd.txt");
//         // System.out.println(f1.exists());
//         // f1.createNewFile();
//         // System.out.println(f1.exists());

//     // ------------------------------------------------------------

//         File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali","abcde");
//         // System.out.println(f.exists());
//         f.mkdir();
//         // System.out.println(f.exists());

//         File f1 = new File(f,"anjali1.txt");
//         f1.createNewFile();

//     }
// }/
// -----------------------------------------------------------------------------------

// imp methodS
//     1.boolean exists()
//     2.boolean createNewFile()
//     3.boolean mkdir()
//     4.boolean isFile();
//     5.boolean isDirectory();
//     6.String[] list();
//     7.long length();
//     8.boolean delete();

// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//        File f = new File("abc.txt");
//        System.out.println(f.isDirectory());
//     }
// }

// Q].wap to display the names of all files and directories present in C:/Users/pavan/OneDrive/Desktop/Anjali

// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//        File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali");
//        String[] s = f.list();
//        for(String s1:s)
//        {
//         System.out.println(s1);
//        }
//     }
// }

// Q].wap to display ONLY file names present in C:/Users/pavan/OneDrive/Desktop/Anjali

// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//        File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali");
//        String[] s = f.list();
//        for(String s1:s)
//        {
//         File f1 = new File(f,s1);
//          if(f1.isFile())
//          {
//             System.out.println(s1);
//          }
//        }
//     }
// }

// Q].wap to display ONLY Directory names present in C:/Users/pavan/OneDrive/Desktop/Anjali

// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//        File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali");
//        String[] s = f.list();
//        for(String s1:s)
//        {
//         File f1 = new File(f,s1);
//          if(f1.isDirectory())
//          {
//             System.out.println(s1);
//          }
//        }
//     }
// }

// ---------------------------------------------------------------------------------------

// FileWriter
// constructors 

// 1.FileWiter fw = new FileWriter(String name);
// 2.FileWiter fw = new FileWriter(File f);
// 3.1.FileWiter fw = new FileWriter(String name,boolean append);
// 4.FileWiter fw = new FileWriter(File f,boolean append);

// methods
// 1.write(int ch)
// 2.write(char[] ch)
// 3.write(String s)
// 4.flush()
// 5.close()


// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//         // FileWriter fw = new FileWriter("abc.txt");
//         FileWriter fw = new FileWriter("abc.txt",true);
//         // fw.write(99);
//         // fw.write(100);
//         char ch[] = {'a','b','c'};
//         fw.write(ch);
//         fw.write("\n");
//         fw.write("Ann apavan");
//         fw.flush();
//         fw.close();
//     }
// }


// FileReader 
// constructors
// 1.FileReader fr = new FileReader(String fname);
// 2.FileReader fr = new FileReader(File f);

// methods 
// 1.int read()
// 2.int read(char[] ch)
// 3.void close()

// import java.io.*;
// public class Day7_MyFile
// {
//     public static void main(String[] pavan) throws Exception
//     {
//        FileReader fr = new FileReader("abc.txt");
//        int i=fr.read();
//        while(i!=-1)
//        {
//         System.out.println((char)i);
//         i=fr.read();
//        } 
//        fr.close();
//     }
// }

import java.io.*;
public class Day7_MyFile
{
    public static void main(String[] pavan) throws Exception
    {
       File f = new File("abc.txt");
       char[] ch = new char[(int)f.length()];
       FileReader fr = new FileReader(f);
       fr.read(ch);
       System.out.println("adeiuwfhreiuaihghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
       for(char ch1:ch)
       {
        System.out.println(ch1);
       }
       fr.close();
    }
}
