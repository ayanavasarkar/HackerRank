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
