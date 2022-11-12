package practise.loops;

class series
{
    int s=0;
    int k;
    public int  sinSeries(int x,int n)
    {

        for (int i = 1; i <= n; i++)
        {
//            if()
//              {
                  s=powerMultiply(x,i);
                  k=factorial(i);

//              }
        }
        return n;
    }
    public int factorial(int i)
    {
        int s=1;
        for(int j=1;j<=i;j++)
        {
            s*=j;
        }
        return s;
    }
    public int powerMultiply(int x,int i)
    {
        for(int j=1;j<i;j++)
        {
            x*=x;
        }
        return x;
    }

}

public class sin_x_series {
    public static void main(String [] args)
    {

    }

}
