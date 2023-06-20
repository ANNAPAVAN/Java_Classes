import java.util.Scanner;

public class Main {
    public static int lcs(String t, String m, int nt, int nm) {
        if (nt == 0 || nm == 0) {
            return 0;
        }
        
        if (t.charAt(nt - 1) == m.charAt(nm - 1)) {
            return 1 + lcs(t, m, nt - 1, nm - 1);
        } else {
            return Math.max(lcs(t, m, nt, nm - 1), lcs(t, m, nt - 1, nm));
        }
    }
    
    // public static int lcs2(String t, String m) {
    //     int[][] d = new int[t.length() + 1][m.length() + 1];
        
    //     for (int i = 1; i <= t.length(); i++) {
    //         for (int j = 1; j <= m.length(); j++) {
    //             if (t.charAt(i - 1) == m.charAt(j - 1)) {
    //                 d[i][j] = d[i - 1][j - 1] + 1;
    //             } else {
    //                 d[i][j] = Math.max(d[i - 1][j], d[i][j - 1]);
    //             }
    //         }
    //     }
        
    //     return d[t.length()][m.length()];
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text1: ");
        String s1 = sc.next();
        System.out.print("Enter text2: ");
        String s2 = sc.next();
        
        System.out.println("The length of the longest common subsequence: " + lcs(s1, s2, s1.length(), s2.length()));
        // System.out.println("The length of the longest common subsequence: " + lcs2(s1, s2));
    }
}

