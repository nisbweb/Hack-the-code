import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
         InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(is);
        int n=Integer.parseInt(input.readLine());
        HashMap<String,Integer> map=new HashMap<>();
        List<String> tokens = new ArrayList<>();
		
		for(int i=0;i<n;i++)
        {
            String str=input.readLine();
            tokens.add(str);
        }
        for(int i=0;i<n;i++)
        {
            String str=tokens.get(i);
            if(map.containsKey(str))
                map.put(str,(map.get(str))+1);
            else
                map.put(str,1);
        }int sum=0;
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                sum=sum+(entry.getValue())-1;
            }
        }
        System.out.println(sum);
    }
}
