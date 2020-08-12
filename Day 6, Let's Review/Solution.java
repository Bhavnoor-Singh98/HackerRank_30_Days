import java.io.*;
import java.util.*;

public class Solution {

    public static void printString(String S1)
    {
        int l=S1.length();
        
        for(int i=0; i<l; i=i+2)
        {
            System.out.print(S1.charAt(i));
        }
        System.out.print(" ");
        for(int i=1; i<l; i=i+2)
        {
            System.out.print( S1.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int casesno=sc.nextInt();
        for(int i=1; i<=casesno; i++)
        {
            
            String S1 = sc.next();
            printString(S1);
        }
    }
}
