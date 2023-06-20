// Topics
// -------------
// 1.Serialization vs Deserialization
// 2.transient 
// 3.static 
// 4.transient vs static 
// 5.order of Serialization and Deserialization 
// 6.Object graphs in Serialization
// 7.Customized Serialization
// 8.Serilization wrt Inheritence
// 9.Externalization

import java.io.*;
class Cat implements Serializable
{
    transient final int x=10;
    int y=100;
}

public class Day8_Serialize
{
    public static void main(String[] pavan) throws Exception
    {
        Cat c = new Cat();
        System.out.println(c.x+"...."+c.y);
        // Serialization
        FileOutputStream fos = new FileOutputStream("anj.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);

        // DeSerialization
        FileInputStream fis = new FileInputStream("anj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat c1 = (Cat)ois.readObject();

        System.out.println(c1.x+"...."+c1.y);

    }
}