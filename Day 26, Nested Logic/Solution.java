import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int mr=sc.nextInt();
        int yrr=sc.nextInt();

        int di=sc.nextInt();
        int mi=sc.nextInt();
        int yri=sc.nextInt();
        int fine=0;

        if(yrr==yri)
        {
            if(mr==mi)
            {
                if(dr<=di)
                {
                    fine=0;
                }
                else
                {
                   fine=15 * (dr-di);     
                }
                
            }
            else if (mr<mi)
            {
                fine=0;
            }
            else 
            {
                fine=500 * (mr-mi);
            }
        }
        else if(yrr<yri)
        {
            fine=0;
        }

        else
        {
            fine=10000;
        }
        System.out.print(fine);
    }
}