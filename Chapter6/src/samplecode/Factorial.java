package samplecode;

/**
 * Factorial.java Computes the factorial of a given number using recursion.
 * @author Kat Tan
 */
public class Factorial {

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n +factorial(n - 1);
    }
  }
  
 static float sumOfSeries(int i, int n, float s) 
{
     
    // Base case
    if (i > n)
        return s;
 
    // Recursive case
    else
    {
         
        // If we are currently looking
        // at the even number
        if (i % 2 == 0) 
            s += (float)1 / i;
 
        // If we are currently looking 
        // at the odd number
        else
            s += (float)1 / i;
             
        return sumOfSeries(i + 1, n, s);
    }
}

}
