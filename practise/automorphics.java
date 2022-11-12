package practise;

import java.util.Scanner;

public class automorphics {
    public static void main(String[] args) {
        int a,c,s=0,i,n=1;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        i=a;
        c=a*a;
        while(a!=0)
        {
           a/=10;
           s++;
        }
        String s1 = String.valueOf(i);
        String s2 = String.valueOf(c);
        for(int j=s-1;j>0;j--)
        {
            if(s1.charAt(j)==s2.charAt(s2.length()-n))
            {
                n++;
            }
            else {
                System.out.println("NOT");
                break;
            }
        }
        if(n==s)
        {
            System.out.print(" = yes");
        }
        System.out.println(s2+" "+s1);
    }
}
