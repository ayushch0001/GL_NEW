package practise.recusion;
public class Blue
{

}

public class permutationOfWords {
    public static void permutation(String str, String permu)
    {
        if(str.length()==0)
        {
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currentChar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            permutation(newString,permu+currentChar);
        }
    }
    public static void main(String[] args) {

        String newtype ="abc";
        permutation(newtype,"");


    }
}
