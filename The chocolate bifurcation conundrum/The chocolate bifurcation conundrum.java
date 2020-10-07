import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int p=n/2;
            System.out.println(p);
            int noOfTwo=(n/2)-(n%2);
            int noOfThree=n%2;
            for(int i=0;i<noOfTwo;i++)
            {
                System.out.print(2+" ");
            }
            for(int i=0;i<noOfThree;i++)
            {
                System.out.print(3+" ");
            }
            System.out.println();
        }
    }
}
