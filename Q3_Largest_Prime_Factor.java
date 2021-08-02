
/* QUESTION : The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */

class LargestPrimeFactor {
	static final int MAX = 4000000;

	static long get_prime_factor(long n){
	    long max = 1;
	    while(n % 2 != 1)
	    {
	        max = 2;
	        n /= 2;
	    }
	    // now only odd nos are remaining , thus step count is also 2 and not 1
	    for(long i = 3; i <= Math.sqrt(n);i++){
	        if(n % i == 0){
	            max = i;
	            n = n / i;
	        }
	    }
	    // NOTE the foll step
	    if(n < 2)   max = n;
	    return n;
	}

	public static void main(String[] args) {
		// long literals in Java end with an "L": 600851475143L
		System.out.println(get_prime_factor(13195));
		System.out.println(get_prime_factor(600851475143L));
	}
}

// 29
// 6857