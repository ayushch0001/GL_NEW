package practise;

import java.util.Scanner;

public class samplequestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //-----------------------------------question to check the how many times a person enters the positive number and negative
        char ch=' ';                         //----and  zero.--------------------------------------
       int a,h=0,l=0,k=0;
       do{
           System.out.println("Enter the number :");
           a= sc.nextInt();
           while(k==0)
           {
               k++;
               l=a;
           }
           if(a>h)
           {
               h=a;

           }
           if(a<l)
           {
              l=a;
           }
           System.out.println("Enter the sign c for continue or to stop press e");

          ch=sc.next().charAt(0) ;  //  ----------------- by this  way we takes  the input in char-----------------------------
       }while(ch!='e');
        System.out.println(" highetst no: "+h+" loswest no : "+l);
    }
}
