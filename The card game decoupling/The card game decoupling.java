import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int l=0;int r=n-1;
            int a=0,b=0;int i=1;
            while(l<=r)
            {
                int max=Math.max(arr[l],arr[r]);
                if(i%2!=0)
                {
                    a=a+max;
                    if(arr[l]>arr[r])
                        l++;
                    else
                        r--;
                }
                else
                {
                    b=b+max;
                    if(arr[l]>arr[r])
                        l++;
                    else
                        r--;
                }
                i++;
            }
            System.out.println(a+" "+b);
        }
    }
}
