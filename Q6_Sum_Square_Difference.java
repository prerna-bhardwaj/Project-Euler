/* Question : Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/

class SumSquareDifference { 
	static long get_square_of_sum(int n){
	    long sum = n * (n + 1) / 2;
	    return sum * sum;
	}

	static long get_sum_of_square(int n){
	    long sum = n * (n+1) * (2*n + 1) / 6;
	    return sum;
	}

	public static void main(String[] args) {
	    System.out.println(get_square_of_sum(100) - get_sum_of_square(100));		
	}
}

// ANSWER = 25164150