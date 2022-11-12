package practise.array;

import java.util.Scanner;

class shiftingElement
{
      int[] t1;
    public void insert1()
    {
        int k;
        System.out.println("Enter the number how much you want insert.");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        t1 = new int[k];
        System.out.println("Now enter the no.");
        for(int i =0;i<=t1.length-1;i++)
        {
            t1[i]=sc.nextInt();
        }
    }

    public void leftRotate() {
         for (int j = 0; j <=t1.length - 1; j++)
            {
               int first = t1[0];
               for (int i = 0; i < t1.length - 1; i++) {
                    t1[i] = t1[i + 1];
                }
                     t1[t1.length-1]=first;
                for (int i = 0; i <= t1.length-1; i++) {
                    System.out.print(t1[i] + " ");
                }
                System.out.println();
            }
    }
    public void largest_element()
    {
        int h;
        for(int i =0;i<=t1.length-2;i++) {
            for (int j = i + 1; j <= t1.length - 1; j++) {
                if (t1[i] > t1[j]) {
                    h = t1[i];
                    t1[i] = t1[j];
                    t1[j] = h;
                }
            }
        }
            for(int r = 0;r<=t1.length-1;r++)
            {
                System.out.print(t1[r]+" ");
            }
        }
    }



public class left_shifting_element {
    public static void main(String[] args) {
        shiftingElement a1= new shiftingElement();
        a1.insert1();
//        a1.leftRotate();
        a1.largest_element();
    }
}
