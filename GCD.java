import java.util.Random;
public class GCD {
    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // Function to find gcd of array of
    // numbers
    static int findGCD(int myRandomNos[], int n)
    {
        int result = myRandomNos[0];
        for (int element: myRandomNos){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
 
    public static void main(String[] args)
    {
        Random objGennerator = new Random();
        int [] myRandomNos = new int[10];
        for(int ii=0; ii<myRandomNos.length; ii++){
            myRandomNos[ii] = objGennerator.nextInt(100);
        }

        int n = myRandomNos.length;
        System.out.println(findGCD(myRandomNos, n));
    }
}
 