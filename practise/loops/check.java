package practise.loops;

public class check {
    public static int fun(int n)
    {
        if(n==1)
        {
            return 1;
        }
        n=n*fun(n-1);
        return n;
    }
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
//transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
//transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }


    public static void main(String[] args) {
//        int [] array5={5,6,7,8,9,1};
//        for(int i=0;i<array5.length-1;i++)
//        {
//            int smaller=i;
//            for(int j=i+1;j<array5.length;j++)
//            {
//                if(array5[smaller]>array5[j])
//                {
//                    smaller=j;
//                }
//            }
//            int temp = array5[smaller];
//            array5[smaller]=array5[i];
//             array5[i]=temp;
//        for(int k=0;k<array5.length;k++)
//        {
//            System.out.print(array5[k]);
//        }
//        System.out.println();
//
//       }
//
//            int []arr1={5,6,1,9,7};
//        for(int i=0;i<arr1.length-1;i++)
//        {
//            int small = i;
//            for (int j = i + 1; j < arr1.length; j++)
//            {
//                if (arr1[small] > arr1[j])
//                {
//                    small = j;
//                }
//            }
//            int temp = arr1[small];
//            arr1[small] = arr1[i];
//            arr1[i] = temp;
//            for(int k=0;k<arr1.length;k++)
//            {
//                System.out.print(arr1[k]);
//            }
//            System.out.println();
//        }
           int k=fun(5);
        System.out.println(k);
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");

    }
}
