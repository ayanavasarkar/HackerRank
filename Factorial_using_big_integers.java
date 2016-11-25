/*
 to find factorial of a number using BIG INTEGERS
 */
package webcrawler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial_using_big_integers {

    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        //int arr[]=new int[n];
        BigInteger prod = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++)
        {
            prod=prod.multiply(BigInteger.valueOf(i));
            
        }
        System.out.println(prod);
    }
}
