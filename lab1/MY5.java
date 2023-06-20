import java.util.Scanner;

class MyRectangle {
    int xbl, ybl, xtr, ytr;
    
    public MyRectangle(int x1, int y1, int x2, int y2) {
        xbl = x1;
        ybl = y1;
        xtr = x2;
        ytr = y2;
    }
    
    int area() {
        return Math.abs((xtr - xbl) * (ytr - ybl));
    }
    
    MyRectangle overlap(MyRectangle rect) {
        int x1 = Math.max(xbl, rect.xbl);
        int y1 = Math.max(ybl, rect.ybl);
        int x2 = Math.min(xtr, rect.xtr);
        int y2 = Math.min(ytr, rect.ytr);
        
        if (x1 > x2 || y1 > y2) {
            MyRectangle r1 = new MyRectangle(0, 0, 0, 0);
            return r1;
        } else {
            MyRectangle r2 = new MyRectangle(x1, y1, x2, y2);
            return r2;`
        }
    }
    
    MyRectangle overlapAll(MyRectangle[] r) {
        MyRectangle tr = r[0];
        
        for (int i = 1; i < r.length; i++) {
            tr = tr.overlap(r[i]);
            
            if (tr.xbl == 0 && tr.ybl == 0 && tr.xtr == 0 && tr.ytr == 0) {
                break;
            }
        }
        
        return tr;
    }
    
    public String toString() 
    {
        return "Class MyRectangle: [(" + xbl + "," + ybl + "); (" + xtr + "," + ytr + ")]\nArea = " + area();
    }
}

class MySquare extends MyRectangle {
    int xs, ys, slength;
    
    public MySquare(int x, int y, int len) {
        super(x, y, x + len, y + len);
        xs = x;
        ys = y;
        slength = len;
    }
    
    public String toString() {
        return "Class MySquare: [(" + xs + "," + ys + "); (" + (xs + slength) + "," + (ys + slength) + ")]\nArea = " + area();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // for MyRectangle Area
        /*
        int x1, y1, x2, y2;
        System.out.print("Enter bottom left x coordinate: ");
        x1 = sc.nextInt();
        System.out.print("Enter bottom left y coordinate: ");
        y1 = sc.nextInt();
        System.out.print("Enter top right x coordinate: ");
        x2 = sc.nextInt();
        System.out.print("Enter top right y coordinate: ");
        y2 = sc.nextInt();
        MyRectangle r = new MyRectangle(x1, y1, x2, y2);
        System.out.println("The area of rectangle: " + r.area());
        */
        
        // for MyRectangle overlap
        /*
        int x1, y1, x2, y2;
        System.out.println("Enter rectangle 1 details: ");
        System.out.print("Enter bottom left x coordinate: ");
        x1 = sc.nextInt();
        System.out.print("Enter bottom left y coordinate: ");
        y1 = sc.nextInt();
        System.out.print("Enter top right x coordinate: ");
        x2 = sc.nextInt();
        System.out.print("Enter top right y coordinate: ");
        y2 = sc.nextInt();
        MyRectangle r1 = new MyRectangle(x1, y1, x2, y2);
        System.out.println("Enter rectangle 2 details: ");
        System.out.print("Enter bottom left x coordinate: ");
        x1 = sc.nextInt();
        System.out.print("Enter bottom left y coordinate: ");
        y1 = sc.nextInt();
        System.out.print("Enter top right x coordinate: ");
        x2 = sc.nextInt();
        System.out.print("Enter top right y coordinate: ");
        y2 = sc.nextInt();
        MyRectangle r2 = new MyRectangle(x1, y1, x2, y2);
        MyRectangle res = r1.overlap(r2);
        System.out.println("The overlapped " + res);
        */
        
        // for MyRectangle overlapAll
        
        System.out.print("Enter number of rectangles: ");
        int n = sc.nextInt();
        MyRectangle[] r = new MyRectangle[n];
        
        for (int i = 0; i < n; i++) {
            int x1, y1, x2, y2;
            System.out.println("Enter rectangle " + (i + 1) + " details: ");
            System.out.print("Enter bottom left x coordinate: ");
            x1 = sc.nextInt();
            System.out.print("Enter bottom left y coordinate: ");
            y1 = sc.nextInt();
            System.out.print("Enter top right x coordinate: ");
            x2 = sc.nextInt();
            System.out.print("Enter top right y coordinate: ");
            y2 = sc.nextInt();
            r[i] = new MyRectangle(x1, y1, x2, y2);
        }
        
        MyRectangle res = r[0].overlapAll(r);
        System.out.println("The overlapped region of rectangles: " + res);
        
        
        // for MySquare super constructor and override of toString
        /*
        System.out.println("Enter MySquare details: ");
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        MySquare s = new MySquare(x, y, l);
        System.out.println(s);
        */
    }
}
