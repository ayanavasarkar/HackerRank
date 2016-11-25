/*
Given an integer, N, traverse its digits (1,2,...,n) and determine how many digits evenly divide N 
(i.e.: count the number of times N divided by each digit i has a remainder of 0 ).
Print the number of evenly divisible digits. 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            
            String s=br.readLine();
            int in= Integer.parseInt(s);
            arr[i-1] =in;
        }
        for(int i=0;i<n;i++)
        {
           String number=Integer.toString(arr[i]) ;int num=arr[i];
           //System.out.println(number);
           int count=0;
           int length=number.length();
           for(int j=0;j<length;j++)
           {
               char c=number.charAt(j);
               //System.out.println(c);
               int digit=c-48;
               if(digit!=0)
               {
                int rem=num%digit;
                if(rem==0)
                    count++;
               }
               
               
           }
            System.out.println(count);
           
        }
    
    }
}
