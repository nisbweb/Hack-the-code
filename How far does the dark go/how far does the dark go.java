

import java.util.*;
import java.lang.*;
import java.io.*;
// code by abhinav verma

class Solution
{
    static long mini=Long.MAX_VALUE;
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        long[] arr=new long[n+1];
        for(int i=1; i<n+1; i++){
            arr[i]=scn.nextLong();
        }
        LinkedList<Integer>[] l=new LinkedList[n+1];
        for(int i=0; i<n+1; i++){
            l[i]=new LinkedList<>();
        }
        for(int i=0; i<m; i++){
            int s=scn.nextInt();
            int d=scn.nextInt();
            l[s].add(d);
            l[d].add(s);
        }
        long ans=0;
        boolean[] visited=new boolean[n+1];
        
        for(int i=1; i<n+1; i++){
            mini=Long.MAX_VALUE;
            if(visited[i]==false){
                long k=dfs(i,visited,l,arr);
                ans+=k;
            }
        }
        System.out.println(ans);
        
    }
    public static long dfs(int s,boolean[] visited,LinkedList<Integer>[] l,long[] arr){
        
        visited[s]=true;
        mini=Math.min(mini,arr[s]);
        for(Integer x: l[s]){
            if(visited[x]==false){
            dfs(x,visited,l,arr);
            }
        }
        return mini;
    }
}