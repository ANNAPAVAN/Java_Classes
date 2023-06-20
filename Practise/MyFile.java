import java.io.*;
public class MyFile 
{
    public static void main(String[] args) throws IOException
    {
        // File f = new File("abc.txt"); //won't create any physical file
        // System.out.println(f.exists());
        // f.createNewFile();
        // System.out.println(f.exists());


        // File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali");
        // System.out.println(f.exists());

        // File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjaliiiiiiii");
        // System.out.println(f.exists());
        // f.mkdir();
        // System.out.println(f.exists());

        // file class Constructors
        //  1.   File f = new File(String name)//
        // 2.   File f = new File(String subdirectory , String name);
            //  File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali","anna.txt");
            //  f.mkdir();
        //   3. File f = new File(File subdirectory,String name);
            // File f1 = new File(f,"a1.txt");
            // f1.mkdir();

        // imp methodS
        // 1.boolean exists()
        // 2.boolean createNewFile()
        // 3.boolean mkdir()
        // 4.boolean isFile();
        // 5.is Directory();
        // 6.String[] list();
        // 7.long length();
        // 8.boolean delete;

        // Q.wap to display the names of all files and directories present in C:/Users/pavan/OneDrive/Desktop/Anjali
        // File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali");
        // int c=0;
        // String[] s=f.list();
        // for(String s1:s)
        // {
        //     c++;
        //     System.out.println(s1);
        // }
        // System.out.println("The total number: "+c);

        //Q.wap to display ONLY file names present in C:/Users/pavan/OneDrive/Desktop/Anjali
        // File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali");
        // String[] s=f.list();
        // int c=0;
        // for(String s1:s)
        // {
        //     File f1 = new File(f,s1);
        //     if(f1.isFile())
        //     {
        //         c++;
        //         System.out.println(s1);
        //     }
        // }
        // System.out.println("Total no. of files : "+c);

    //     // Q..wap to display ONLY Directory names present in C:/Users/pavan/OneDrive/Desktop/Anjali
    //     File f = new File("C:/Users/pavan/OneDrive/Desktop/Anjali");
    //     String[] s=f.list();
    //     int c=0;
    //     for(String s1:s)
    //     {
    //         File f1 = new File(f,s1);
    //         if(f1.isDirectory())
    //         {
    //             c++;
    //             System.out.println(s1);
    //         }
    //     }
    //     System.out.println("Total no. of Directories : "+c);


        // // FileWriter 
        // ---------------------------------------------------------------------------------------------------------------------------
        // ---->constructors
        // 1.FileWriter fw = new FileWriter(String fname);
        // 2.FileWriter fw = new FileWriter(File f);
        // 3.FileWriter fw = new FilWriter(String fname , boolean append)
        // 4.FileWriter fw = new FileWriter(File f,boolean append);

        // FileWriter fw = new FileWriter("pavan.txt");
        // FileWriter fw = new FileWriter("pavan.txt",true);
        //  methodS
        // 1.write(int ch)
        // 2.write(char[] ch);
        // 3.write(String s)
        // 4.flush()
        // 5.close();
        // fw.write(100);
        // fw.write('a');
        // fw.write("\n");
        // fw.write("Anna pavan");
        // char ch[] = {'a','b','c'};
        // fw.write("\n");
        // fw.write(ch);
        // fw.flush();
        // fw.close();


        // FileReader
        // ----------------------------------------------------------------------------------------------------------------
        // ---->constructors 
        // 1.FileReader fr = new FileReader(String fname);
        // 2.FileReader fr = new FileReader(File f);
        
        

        // methods
        // 1.int read()
        // FileReader fr = new FileReader("pavan.txt");
        // int i = fr.read();
        // while(i!=-1)
        // {
        //     // System.out.println(i);
        //     System.out.print((char)i);
        //     i = fr.read();
        // }

        // 2.int read(char[] ch)
        // File f = new File("pavan.txt");
        // char[] ch = new char[(int)f.length()];
        // FileReader fr = new FileReader("pavan.txt");
        // fr.read(ch);
        // for(char ch1:ch)
        // {
        //     System.out.print(ch1);
        // }

        // 3.void close()

        // BufferedWriter
        // -----------------------------------------------------------------------------------------------------------------------------
        // ---->constructors 
        // 1.BufferedWriter bw = new BufferedWriter(writer w);
        // 2.BufferedWriter bw = new BufferedWriter(writer w,int bufferSize);

        // methods
        // 1.write(int ch)
        // 2.write(char[] ch);
        // 3.write(String s)
        // 4.flush()
        // 5.close();
        //6.newLine()

        // FileWriter fw = new FileWriter("pavan.txt");
        // BufferedWriter bw = new BufferedWriter(fw);
        // bw.write(101);
        // bw.newLine();
        // bw.write("anna pavan");
        // bw.newLine();
        // bw.write("Anna nithin");
        // bw.flush();
        // bw.close();


        // BufferedReader()
        // -----------------------------------------------------------------------------------------------------------------------------
        // ---->constructors 
        // 1.BufferedReader br = new BufferedReader(reader r);
        // 2.BufferedReader br = new BufferedReader(reader r,int bufferSize);


        // methods
        // 1.int read()
        // 2.int read(char[] ch)
        // 3.void close();
        // 4.String readLine() //reads next line if there is no next line returns null

        // FileReader f = new FileReader("pavan.txt");
        // BufferedReader br = new BufferedReader(f);
        // String str = br.readLine();
        // while(str!=null)
        // {
        //     System.out.println(str);
        //     str = br.readLine();
        // }
        // br.close();

        // PrintWritrer
        // ----------------------------------------------------------------------------------------------------------------------------
        // ---->constructors
        // 1.PrintWriter pw = new PrintWriter(String fname);
        // 2.PrintWriter pw = new PrintWriter(File f);
        // 3.PrintWriter pw = new PrintWriter(writer w);

        // methodS
        // 1.write(int ch)
        // 2.write(char[] ch)
        // 3.write(String s)
        // 4.flush 
        // 5.close()
        // 6.print(char ch)
        // 7.print(int i)
        // 8.print(double d)
        // 9.print(boolean b)
        // 10.print(String s)
        // 11.println(char ch)
        // 12.println(int i)
        // 13.println(double d)
        // 14.println(boolean b)
        // 15.println(String s)    ..................

        FileWriter fw = new FileWriter("pavan.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(103);
        pw.println("anna pavan");
        pw.println(true);
        pw.println("hellooooooooo");
        pw.flush();
        pw.close();

                                                   // -----------Thank YOU--------------------------------


    }
}