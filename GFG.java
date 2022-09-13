
import java.util.Arrays;
import java.util.Random;

// Java Program to find LCM of n elements
public class GFG {
     
    public static long lcm_of_array_elements(int[] element_array)
    {
        long lcm_of_array_elements = 1;
        int divisor = 2;
         
        while (true) {
            int counter = 0;
            boolean divisible = false;
             
            for (int i = 0; i < element_array.length; i++) {
 
 
                if (element_array[i] == 0) {
                    return 0;
                }
                else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    counter++;
                }

                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }

            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            }
            else {
                divisor++;
            }
 
            if (counter == element_array.length) {
                return lcm_of_array_elements;
            }
        }
    }
     
    // Driver Code
    public static void main(String[] args)
    {   
        Random objGennerator = new Random();
        int [] element_array = new int[10];
        for(int ii=0; ii<element_array.length; ii++){
            element_array[ii] = objGennerator.nextInt(100);
        }
        //print this arrey fro debug perpus
        System.out.println(lcm_of_array_elements(element_array));
    }
}
