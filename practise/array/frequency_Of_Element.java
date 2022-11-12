package practise.array;

import java.util.Scanner;

class array1 {
  public  int[] t1;
    public void insert ()
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
        public void check()
        {

            int freq=1;
            int visit = -1;
            int[] repet = new int[t1.length];
            for(int i=0;i<=t1.length-1;i++)          // sare elements k liye ye loop chala hai
            {
                freq=1;
                for(int j=i+1;j<=t1.length-1;j++)     // ye loop chala hai compare krne k liye is liye "i" wala for loops
                                                        // se "j" wala loop ak
                {                                     // agge hai taki compare kare or piche agar same hoga bhi to usem "visit
                                                       // store hogya hoga
                    if(t1[j]==t1[i])
                    {
                        freq++;

                        repet[j]=visit;

                    }
                }
                if(repet[i]!=visit)                       // iske vajah se jo compare hai usme chod k uske sare dublicate me "visit"
                {                                       //store ho gya hai
                    repet[i]=freq;
                }
         }
               for(int i =0;i<=t1.length;i++)
               {
                   if(repet[i]!=visit)
                   System.out.println("element-> "+t1[i]+" frequency -> "+repet[i]);
               }

            }
        }




public class frequency_Of_Element {
    public static void main(String[] args) {

        array1 r1 = new array1();
        r1.insert();
        r1.check();
    }
    }
     // ---------------------------------------ye solution hai jo-------------------------------------------------

//    public static void main(String[] args) {
//        //Initialize array
//        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
//        //Array fr will store frequencies of element
//        int [] fr = new int [arr.length];
//        int visited = -1;
//        for(int i = 0; i < arr.length; i++){
//            int count = 1;
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                    //To avoid counting same element again
//                    fr[j] = visited;
//                }
//            }
//            if(fr[i] != visited)
//                fr[i] = count;
//        }
//
//        //Displays the frequency of each element present in array
//        System.out.println("---------------------------------------");
//        System.out.println(" Element | Frequency");
//        System.out.println("---------------------------------------");
//        for(int i = 0; i < fr.length; i++){
//            if(fr[i] != visited)
//                System.out.println("    " + arr[i] + "    |    " + fr[i]);
//        }
//        System.out.println("----------------------------------------");
//    }
//}
