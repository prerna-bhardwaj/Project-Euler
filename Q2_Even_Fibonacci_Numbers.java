/* QUESTION : Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/


class EvenFibonacci {
	static final int MAX = 4000000;
	static int get_sum_naive(){
	    int prev = 0;
	    int curr = 1;
	    int sum = 0;
	    
	    while(true)
	    {
	        int num = prev + curr;
	        if(num % 2 == 0)
	            sum += num;
	        if(num > MAX)
	            break;
	        prev = curr;
	        curr = num;
	        
	    }
	    return sum;
	}

	//every third number of the series is an even no..
	static int get_sum_fast(){
	    int a = 1, b = 1;
	    int c = 2;
	    int sum = 0;
	    while(c < MAX){
		sum += c;
		a = b + c;
		b = c + a;
		c = a + b;
	    }
	    return sum;
	}


	public static void main(String[] args) {
		int sum_naive = get_sum_naive();
		System.out.println(sum_naive);
		int sum_fast = get_sum_fast();
		System.out.println(sum_fast);
	}

}


// ANSWER = 4613732