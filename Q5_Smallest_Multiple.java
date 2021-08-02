/*  QUESTION : 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

class SmallestMultiple {

	static long gcd(long a, long b){
	    if(b == 0)
	        return a;
	    long rem = a % b;
	    return gcd(b, rem);
	}


	static long lcm(long a, long b){
		System.out.println(a + " " + b + " " + (a*b/gcd(a,b)));
	    return a*b / gcd(a, b);
	}

	public static void main(String[] args) {
	    long ans = 1;
	    for(long i = 1; i <=20 ; i++)
	    	ans = lcm(ans, i);
		System.out.println("LCM = " + ans);	
	}
}

// ANSWER : LCM = 232792560
