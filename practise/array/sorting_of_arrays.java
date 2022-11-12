package practise.array;
import java.util.Scanner;
class sorttypes
{
    public int[] insert(int[]a,int n)
    { a=new int[n];
        System.out.println("Now insert the elements of the array");
        for(int i=0;i<n;i++)
        {
            Scanner sc=new Scanner(System.in);
            a[i]=sc.nextInt();
        }
        return a;
    }
    public int[] bubbleSort(int []arr,int n)
    {
        // bubble soritng for ascending order of the array
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])          // if(arr[i]<arr[j]) iss tarh se bubble sorting for descending  order bna sakte hain...........
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public int[] selectionSort(int []arr,int n)
{
    // selction soritng for ascending order of the array
    for(int i=0;i<n-1;i++)
    {
       int    small=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[small]>arr[j]) // if(arr[small]<arr[j]) iss tarh se selction sorting for descending  order bna sakte hain...........
                small =j;
        }
        int temp=arr[small];
        arr[small]=arr[i];
        arr[i]=temp;
    }
    return arr;
}

    public void print( int []arr)
    {
        System.out.println();
        for(int each:arr)
        {
            System.out.print(each+" ");
        }
    }

}

public class sorting_of_arrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int []arr;
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        arr=new int[n];
        sorttypes s1= new sorttypes();
        arr=s1.insert(arr,n);
        arr=s1.bubbleSort(arr,arr.length);
        s1.print(arr);
        arr=s1.selectionSort(arr,arr.length);
        s1.print(arr);

    }

}
