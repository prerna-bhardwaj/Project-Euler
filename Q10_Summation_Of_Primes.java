/* QUESTION : The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

*/
import java.util.*;

class SummationOfPrimes {
	static final int MAX = 2000000;

	public static void main(String[] args) {
	    boolean a[] = new boolean[MAX];
	    Arrays.fill(a, true);
	    
	    for(int i = 2; i*i < MAX; i++)
	    {
	        if(a[i] == true)
	        {    
	            for(int j = i*i ; j < MAX; j+=i)
	                a[j] = false;
	        }
	    }
	    long sum = 0;
	    for(int i = 2; i < MAX; i++)
	    {
	        if(a[i] == true)
	            sum += i;
	    }
		System.out.println(sum);
	}
}

// ANSWER = 142913828922