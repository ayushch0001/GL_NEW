package practise.loops;

import java.util.Scanner;

class nNumber1
{
  public void greaterAndSmallerno()
    {
        int i;
        int s=0;
        int l =0,k=0;
        char c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the values.");
            i=sc.nextInt();
            if(k==0) {
                s = i;
                k++;
            }
            if(i>l)
                l=i;
            if(i<s)
                s=i;
            System.out.println("Enter the letter 'c' for continue entering the values.. ");
            c=sc.next().charAt(0);
        }while(c=='c' || c=='Y');
        System.out.println("gretest  no. is :"+l+" and the smallest no. "+s);
    }

    void pattern()
    {
        for(int i=0;i<5;i++)
        {
         for(int j=5-i;j>0;j--)
         {
             System.out.print(" ");
         }
         for(int k=1;k<=2*i+1;k++)
         {
             System.out.print(1+i);
         }
            System.out.println();
        }
    }

    void pattern1()
    {
         for(int i=1;i<=5;i++)
         {
             for(int j=5-i;j>=0;j--)
             {
                 System.out.print(" ");
             }
             for(int k=i;k>0;k--)
             {
                 System.out.print(k);
             }
             for(int k=2;k<=i;k++)
             {
                 System.out.print(k);
             }
             System.out.println();
         }

    }
}


public class nNumbers {
    public static void main(String[] args) {
       nNumber1 n1=new nNumber1();
     //  n1.greaterAndSmallerno();
         n1.pattern();
         n1.pattern1();
    }
}
