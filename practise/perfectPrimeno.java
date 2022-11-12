package practise;
import  java.util.Scanner;
class solve
{

    public void prime(int a)       // BY my self solve.........
    {
        System.out.println(" prime number is ...");
        int k;
        for(int i=1;i<=a;i++)
        {
            k=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    k++;
                }
            }
            if(k==2)
            {
                System.out.print(i+" ");
            }
        }
    }

    // Inside of this is other method shows.........
//            int ct = 0, n = 0, i = 1, j = 1;
//            while (n < 25) {
//                j = 1;
//                ct = 0;             // here "i" is the number which is increment to check that incremented i  is  prime or not
//               while (j <= i) {
//                    if (i % j == 0)        // here "j" is the number which is used to divide for checking that i is prime or not
//                        ct++;                // every time when i is found as  a prime than j is now become the one to check the new i from 1;
//                    j++;                       // here "ct" is indicator in compeleting process a prime no. "i" is divide by  it self and 1 only so "ct" is increment only that time.
//                }                   // and  every time "ct" is zero
//                if (ct == 2) {
//                    System.out.printf("%d ", i);
//                    n++;
//                }
//                i++;
//          }

    public void perfect(int a)
    {
        System.out.print("\n perfect number is ");
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    sum+=j;

                }
            }

            if(sum==i)
            {
                System.out.print(i+" ");
            }
            sum=0;
        }
    }

}


public class perfectPrimeno {
    public static void main(String[] args) {
        // To print upto the n prime number and perfect number
        int a,k=0;
        System.out.println("Enter the any number you want to print the prime and  perfect number upto this ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        solve s1 = new solve();
        s1.prime(a);
        solve s2 = new solve();
        s2.perfect(a);
        }
    }

