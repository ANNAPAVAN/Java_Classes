import java.util.Scanner;

public class C3 {
    public static int maxStorage(int height[]) {
        int v = 0;
        int size = height.length;
        int lmax[] = new int[size];
        int rmax[] = new int[size];
        
        lmax[0] = height[0];
        for (int i = 1; i < size; i++) {
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }
        
        rmax[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rmax[i] = Math.max(height[i], rmax[i + 1]);
        }
        
        for (int i = 1; i < size - 1; i++) {
            v += Math.min(lmax[i], rmax[i]) - height[i];
        }
        
        return v;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int storage = maxStorage(arr);
        System.out.println("The maximum storage of the tank: " + storage);
    }
}
