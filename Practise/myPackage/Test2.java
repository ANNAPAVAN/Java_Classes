import first.*;

public class Test2 {
    public void m2() {
        System.out.println("Test2 method");
        
        // Accessing the m1() method from Test1
        Test1 t1 = new Test1();
        t1.m1();
    }
}

