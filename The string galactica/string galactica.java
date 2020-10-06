

import java.util.*;
import java.lang.*;
import java.io.*;
// code by abhinav verma


class Solution
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        HashSet<String> set=new HashSet<>();
        for(int i=0; i<m; i++){
            String str=scn.next();
            set.add(str);
            
        }
        int count=0;
        for(int i=0; i<n; i++){
            String s1=scn.next();
            if(set.contains(s1)){
                count++;
            }
        }
        if(count%2==0 && n>=m){
            System.out.println("NO");
        }
        if(count%2==0 && n<m){
            System.out.println("YES");
        }
        if(count%2==1 && n<=m){
            System.out.println("YES");
        }
        if(count%2==1 && n>m){
            System.out.println("NO");
        }
    }
}