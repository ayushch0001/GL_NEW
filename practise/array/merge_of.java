package practise.array;

import java.util.Scanner;

class sorting
{
    int [] t1;
    int [] c1;
  public  void creatArray()
  {
      int t;
      System.out.println("Enter the size of array");
      Scanner sc = new Scanner(System.in);
      t=sc.nextInt();
      t1 = new int[t];
      System.out.println("Now insert the elements of array");
      for(int i =0;i<=t1.length-1;i++)
      {
          t1[i]=sc.nextInt();
      }
  }
   public void mergeTwoArray(sorting b)
   {

       int c;
       int a1=this.t1.length;
       int b1=b.t1.length;
       c=a1+b1;
       c1 = new int[c];
       ;for(int i = 0;i<=(a1-1);i++)
       {
           c1[i]=this.t1[i];
       }
       for(int i = 0;i<=(b1-1);i++)
       {
           c1[a1+i]=b.t1[i];
       }
   }
   public void sort ()               //java m jo array argument k jagah pe pass hota hai vha pe hoota hai method se
    {                                          // vo yad rakhna ki refrence pass karta hai to jo changes method m
                                                  // hote hain sidhe usme hi hote hai na ki nya ban k kisi new m
                                                     //    yhan bhi jo array k hai vo array c1 ka hi refence rkaha hai
      int r;
       for(int i = 0;i<=c1.length-2;i++)
       {
           for(int j=i+1;j<=c1.length-1;j++)
           {
               if (c1[i] > c1[j])
               {
               r=c1[i];
               c1[i]=c1[j];
               c1[j]=r;
               }
           }
       }
       for(int i=0;i<c1.length;i++)
       {
           System.out.print(c1[i]+" ");
       }
       System.out.println();
   }

   public void kthelement(int s)
   {
       System.out.println(c1[s]);
   }



}

public class merge_of {
    public static void main(String[] args) {
        sorting s1 = new sorting();
        sorting s2 = new sorting();
        s1.creatArray();
        s2.creatArray();
        s1.mergeTwoArray(s2);
        s1.sort();
        s1.kthelement(5);
        Scanner sc = new Scanner(System.in);
       

    }
}
