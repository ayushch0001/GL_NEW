package practise;                                           // Must see the other solutions which is in below........
 import java.util.Scanner;
public class palindromeProgram {
    public static void main(String[] args) {
        int ch=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values to compare for palindrome");
        String st = sc.next();

        for(int i =0;i<st.length()/2;i++)
        {
                 ch=0;
            if (st.charAt(i)==st.charAt(st.length()-1-i)) // equation wrong krne se exception aata hai
            {                                              //equation m main ne char(st.lengtha()-i)
                     ch++;          // jo ki wrong tha kyon ki i jo hai array ka length hai
              }                     //to usse aaray m ak kam tak k hi memory hogi or jab "i" zero hoga to

        }
   if(ch==1)
   {
       System.out.println("yes");
   }
   else {                                         // tab ye outofbound ka exception dega...........
       System.out.println("not");
   }

   //---------------------------------------------------\/\/\/\/\/\/\/\/\/\-----------------------------------------------------------
        //  ...........................new method to inmplement the palindrome problem.................

        String original;  // Objects of String class
        StringBuilder reverse = new StringBuilder();

        Scanner in = new Scanner(System.in);

            System.out.println("Enter a string/number to check if it is a palindrome");

            original = in.nextLine();
            int length = original.length();

            for ( int i = length - 1; i >= 0; i-- ) {
                reverse.append(original.charAt(i));// agar koi 'char' add krna hai string m to isko (.append) )use krte hain----------
                // reverse = reverse + original.charAt(i);
            }

            if (original.equals(reverse.toString()))          // ".equal" is a method to compare the stings ------------------
                System.out.println("Entered string/number is a palindrome.");

            else
                System.out.println("Entered string/number isn't a palindrome.");


    }
}