package practise;

class fibonicSeries2
{
     int fibonicSeries1( int a )
    {
        int k;
        if(a==1)
        {
            return 0;
        }
            else if(a==2)
        {
            return 1;
        }
           else
        {
            k=fibonicSeries1(a-1)+fibonicSeries1(a-2);
            return k;
        }
        }
    }
public class fibonicseries {
    public static void main(String[] args) {
        int e;
        fibonicSeries2 a1 = new fibonicSeries2();
            e = a1.fibonicSeries1(7);
            System.out.println(" value " + e);
    }
}
