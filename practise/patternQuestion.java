package practise;
class callPattern
{
    public void starTringle ()
    {
        for(int i=0;i<=7;i++)
        {
            for(int k=7-i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void numTringle()
    {
        for(int i=1;i<=9;i++)
        {
            if(i<6)
            {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
                System.out.println();
            }
            else
            {

                System.out.println();
            }

        }
    }
}
class hollowPattern {
    void hollowrectangle() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 1 || i == 7 || j == 7) {
                    System.out.print("*");
                }
                if (j > 1 && i != 1 && i != 7 && j < 7) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void zeroonepattern() {
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j %2==0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);

                }
            }
            System.out.println();
        }
    }
    void charintpttern()  //  this is good pattern by this we get the excess of every element of the pattern and we play with this
    {
        char s='A';
        int num =1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(s);
                    s++;
                }
                else
                {
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }
    }
//void heart_with_name()
//{int n=5;
//    for(int i=0;i<5;i++)
//    {
//        for(int j=1;j<=n;j++)
//        {
//            System.out.print(" ");
//        }
//        for(int j=5;j<=2*i+1;j++)
//        {
//            System.out.print("*");
//        }
//        for(int j=1;j<=*n;j++)
//        {
//            System.out.print(" ");
//        }
//        for(int j=1;j<=2*i+1;j++)
//        {
//            System.out.print("*");
//        }
//        n--;
//        System.out.println();
//    }
//}

    }


    public class patternQuestion {
        public static void main(String[] args) {
            callPattern a1 = new callPattern();
            a1.starTringle();
            a1.numTringle();
            hollowPattern p1 = new hollowPattern();
            p1.hollowrectangle();
            p1.zeroonepattern();
            p1.charintpttern();  // this pattern is good for concept.........
       //    p1.heart_with_name();
        }

    }

