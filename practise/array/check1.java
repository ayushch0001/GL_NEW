package practise.array;

public class check1 {
    public static void main(String[] args) {
//        //code
//        int t;
//        int n;
//        Scanner sc = new Scanner(System.in);
//        t=sc.nextInt();
//
//        int [] a;
//        for(int i =1;i<=t;i++)
//        {
//            n=sc.nextInt();
//            a = new int [n];
//            for(int j=0;j<n;j++)
//            {
//
//                a[j]=j;
//            }
//            for(int k=n-1;k>=0;k--)
//            {
//                System.out.print(a[k]+" ");
//            }
//        }


        int []arr ={2,6,3,1,0,4,8,5,9,7};
        int n=10;
        int s;
           //     s=peakElement(arr,n);
     //   System.out.println("out "+ s);

    }
//   static int peakElement(int arr[], int n)
//
//    {
//        int small = 0;
//        int big = n-1;
//        int mid = small +(big - small)/2;
//
//        int peak=0;
//        while(small<=big)
//        {
//            if(arr[mid] > arr[mid-1])
//            {
//                peak = mid;
//                small = mid + 1;
//            }else{
//                big = mid-1;
//            }
//            mid = small+(big - small) / 2;
//
//        }
//        return peak;
//
// }


// -----------------------------------------peak element question of the gfg solutions--------------------------------------------------
//public int peakElement(int[] arr,int n){
//        return peakElementUtil(arr,0,n-1,n);
//        }
//
//// recursive binary search to find the peak element
//    public static int peakElementUtil(int[] arr,int low,int high,int n){
//
//        // calculating mid
//        int mid=(low+high)>>1;
//
//        // if mid is last or first index with first element
//        // greater than next.
//        // Also, check if mid element is greater than mid - 1 and mid+1
//
//        if ((mid == 0 || arr[mid-1] <= arr[mid]) &&(mid == n-1 || arr[mid+1] <= arr[mid]))
//        return mid;
//
//        // If mid is other than 0, then check if mid element is less than prev.
//        // If so, then recurse for lower half
//        else if(mid>0&&arr[mid-1]>arr[mid])
//        return peakElementUtil(arr,low,mid-1,n);
//
//        // else recurse for the upper half
//        else
//        return peakElementUtil(arr,mid+1,high,n);
//        }
        }
