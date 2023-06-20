/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class P1
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sj,nsj,yrs,foy;
        System.out.println("No. of Spring journals:");
        sj = sc.nextInt();
        System.out.println("No. of non-spring journals:");
        nsj = sc.nextInt();
        System.out.println("no. of yrs worked:");
        yrs = sc.nextInt();
        System.out.println("no. of Foy awards:");
        foy = sc.nextInt();
        
        int bs = 10000;
        double res=0;
        
        if(sj>5 && yrs>5)
        {
            res=yrs*0.6*10000;
        }
        else if(sj>5)
        {
            res = yrs*0.4*10000;
        }
        else if(yrs>5)
        {
            res = yrs*0.3*10000 + 0.4*foy*10000;
        }
        
        if(nsj>5)
        {
            res = res + nsj*5000;
        }
        if(yrs<5000 && sj==0 && nsj==0)
        {
            res = 5000;
        }
        System.out.println("Amount:"+res);
        
        
        
        
        
        
        
        
	}
}