// Serialization : The process of converting an object from java Supported form into either file supported or network suppoted form 
// Deserializeation : the process of converting file supported/ network supported form into java supported form

// import java.io.*;
// class Dog implements Serializable 
// {
//     int i=100;
//     int j=200;
// }

// class MySerialize 
// {
//     public static void main(String[] args) throws IOException,ClassNotFoundException
//     {
//         Dog d1 = new Dog();

//         //Serialization
//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);

//         //DeSerialization 
//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();

//         System.out.println(d2.i+"......................"+d2.j);

//     }
// }


//transient 
// ------------------------------------------------------------------------------------------------------------------------------------
// while performing serialization JVM ignores original value and save default value to the file
// import java.io.*;
// class Dog implements Serializable 
// {
//     transient int i=100;
//     int j=200;
// }

// class MySerialize 
// {
//     public static void main(String[] args) throws IOException,ClassNotFoundException
//     {
//         Dog d1 = new Dog();

//         //Serialization
//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);

//         //DeSerialization 
//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();

//         System.out.println(d2.i+"......................"+d2.j);

//     }
// }

// transient vs static
// -------------------------------------------------------------------------------------------------------------

// import java.io.*;
// class Dog implements Serializable 
// {
//     static transient int i=100;
//     int j=200;
// }

// class MySerialize 
// {
//     public static void main(String[] args) throws IOException,ClassNotFoundException
//     {
//         Dog d1 = new Dog();

//         //Serialization
//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);

//         //DeSerialization 
//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();

//         System.out.println(d2.i+"......................"+d2.j);

//     }
// }

//order of seri.... and deseri....
// -------------------------------------------------------------------------------------------------------------------------------------
// import java.io.*;
// class Dog implements Serializable 
// {
//      int i=10;
//     int j=20;
// }
// class Cat implements Serializable 
// {
//     int i=100;
//     int j=200;
// }
// class Rat implements Serializable 
// {
//     int i=1000;
//     int j=2000;
// }

// class MySerialize
// {
//     public static void main(String pavan[]) throws Exception
//     {
//         Dog d1 = new Dog();
//         Cat c1 = new Cat();
//         Rat r1 = new Rat();

//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);
//         oos.writeObject(c1);
//         oos.writeObject(r1);

//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();
//         Cat c2 = (Cat)ois.readObject();
//         Rat r2 = (Rat)ois.readObject();

//         System.out.println("Dog "+d2.i+"....."+d2.j);
//         System.out.println("Cat "+c2.i+"....."+c2.j);
//         System.out.println("Rat "+r2.i+"....."+r2.j);
//     }
// }

// Object Graphs in Serialization
//  whenever we serializing an object , the set of all objects which are reachable from that object will be serialized automatically
// import java.io.*;
// class Dog implements Serializable 
// {
//     Cat c = new Cat();
// }
// class Cat implements Serializable 
// {
//     Rat r = new Rat();
// }
// class Rat implements Serializable 
// {
//     int i=1000;
//     int j=2000;
// }

// class MySerialize
// {
//     public static void main(String pavan[]) throws Exception
//     {
//         Dog d1 = new Dog();

//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);

//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();

//         System.out.println(d2.c.r.i+"............"+d2.c.r.j);

//     }
// }

// Customized Serialization
// --------------------------------------------------------------------------------------------------------------------------------
// import java.io.*;
// class Account implements Serializable
// {
//     String uname="pavan";
//     transient String pwd="anuska";
// }
// class MySerialize
// {
//     public static void main(String[] args) throws Exception
//     {
//         Account a1 = new Account();
//         System.out.println(a1.uname+"....."+a1.pwd);

//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(a1);

//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Account a2 = (Account)ois.readObject();

//         System.out.println(a2.uname+"....."+a2.pwd);
//     }
// }

// ------------------------------------------------------

// import java.io.*;
// class Account implements Serializable
// {
//     String uname="pavan";
//     transient String pwd="anuska";

//     private void writeObject(ObjectOutputStream oos) throws Exception
//     {
//         oos.defaultWriteObject();
//         String epwd = "123"+pwd;
//         oos.writeObject(epwd);
//     }

//     private void readObject(ObjectInputStream ois) throws Exception
//     {
//         ois.defaultReadObject();
//         String epwd = (String)ois.readObject();
//         pwd = epwd.substring(3);
//     }
// }
// class MySerialize
// {
//     public static void main(String[] args) throws Exception
//     {
//         Account a1 = new Account();
//         System.out.println(a1.uname+"....."+a1.pwd);

//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(a1);

//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Account a2 = (Account)ois.readObject();

//         System.out.println(a2.uname+"....."+a2.pwd);
//     }
// }

// Serialization w.r.t Inheritance 
// ----------------------------------------------------------------------------------------------------------------------------------
// import java.io.*;
// class Animal implements Serializable
// {
//     int i=10;
// }
// class Dog extends Animal 
// {
//     int j=20;
// }
// class MySerialize
// {
//     public static void main(String[] args) throws Exception
//     {
//         Dog d1 = new Dog();
//         System.out.println(d1.i+"....."+d1.j);

//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);

//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();

//         System.out.println(d2.i+"....."+d2.j);
//     }
// }

// ------------------------------

// import java.io.*;
// class Animal 
// {
//     int i=101;
// }
// class Dog extends Animal implements Serializable
// {
//     int j=202;
// }
// class MySerialize
// {
//     public static void main(String[] args) throws Exception
//     {
//         Dog d1 = new Dog();
//         System.out.println(d1.i+"....."+d1.j);

//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);

//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();

//         System.out.println(d2.i+"....."+d2.j);
//     }
// }


// ------------------------


// import java.io.*;
// class Animal 
// {
//     int i=101;
//     Animal()
//     {
//         System.out.println("ANIMAL constructor");
//     }
// }
// class Dog extends Animal implements Serializable
// {
//     int j=202;
//     Dog()
//     {
//         System.out.println("DOG constructor");
//     }
// }
// class MySerialize
// {
//     public static void main(String[] args) throws Exception
//     {
//         Dog d1 = new Dog();
//         d1.i = 888;
//         d1.j=999;
//         System.out.println(d1.i+"....."+d1.j);

//         FileOutputStream fos = new FileOutputStream("abc.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(d1);

//         FileInputStream fis = new FileInputStream("abc.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Dog d2 = (Dog)ois.readObject();

//         System.out.println(d2.i+"....."+d2.j);
//     }
// }



//Externalization
// --------------------------------------------------------------------------------------------------------------------

// in serialization everything takes care by JVM
// in serialization it is not possible to save part of object , to overcome this we go for Externalization
// in Externalization everything takes care by Programmer only

// methods
// 1.writeExternal();
// 2.readExternal()

// ***** Externalization is child interface of serialization

