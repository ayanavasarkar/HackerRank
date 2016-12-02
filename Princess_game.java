/*

Princess Peach is trapped in one of the four corners of a square grid. You are in the center of the grid and can move one step at a time in any of the four directions. Can you rescue the princess?

Input format

The first line contains an odd integer N (3 <= N < 100) denoting the size of the grid. This is followed by an NxN grid. Each cell is denoted by '-' (ascii value: 45). The bot position is denoted by 'm' and the princess position is denoted by 'p'.

Grid is indexed using Matrix Convention

Output format

Print out the moves you will take to rescue the princess in one go. The moves must be separated by '\n', a newline. The valid moves are LEFT or RIGHT or UP or DOWN.

Sample input

3
---
-m-
p--

Sample output

DOWN
LEFT


*/

import java.io.*;
import java.util.*;

public class Princess_game {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        //HashMap <Integer, String> hashed_values=new HashMap<Integer, String>();
        int array[][]=new int[n][n];
        int pi=0,pj=0;
        int mi=0,mj=0;
        for(int i=0;i<n;i++)
        {
            String s=br.readLine();
            //int length=s.length();
            for(int j=0;j<n;j++)
            {
                char c=s.charAt(j);
                int a=c;
                //System.out.println(a);
                array[i][j]=a;
                if(a==109)
                {
                    mi=i;mj=j;
                }
                else if(a==112)
                {
                    pi=i;pj=j;
                }
                else
                    continue;
            }
        }
        
        int diffi=pi-mi;
        int diffj=pj-mj;
        while(diffi!=0)
        {
            if(diffi<0)
            {
                System.out.println("UP");
                diffi++;
            }
            else if(diffi>0)
            {
                System.out.println("DOWN");
                diffi--;
            }
        }
        
        while(diffj!=0)
        {
            if(diffj<0)
            {
                System.out.println("LEFT");
                diffj++;
            }
            else if(diffj>0)
            {
                System.out.println("RIGHT");
                diffj--;
            }
        }
            
       }
}
