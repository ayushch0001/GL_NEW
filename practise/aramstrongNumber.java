package practise;
import java.util.Scanner;

public class aramstrongNumber {
    public static void main(String[] args)
    {
        int b,c=1,g=0,s=0,z,l=0,r;
        System.out.println("Enter the number you want to check it is aramstrong or not");
        Scanner sc = new Scanner(System.in);
        b=sc.nextInt();
        z=b;
        r=z;
        while(z!=0)
        {
            //this loop is to count the last digit of the number
            z=z/10;
            l++;
        }
        int[] no = new int[l];
        while(b!=0)
        {
            // This loop is to set the number in the array ----------------
            z=b%10;
            b=b/10;
            no[g]=z;
            g++;
            z=0;
        }
        for(int i=0;i<no.length;i++)                   // To move the digit from
        {
            for(int j=1;j<=no.length;j++)      // This loop is to multiply the it self at that times
            {
                c*=no[i];
            }
            s+=c;
            c=1;
        }
        if(s==r)
        System.out.println("yes :"+s);
        else
            System.out.println("no");
    }

}
