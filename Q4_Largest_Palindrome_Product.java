/* QUESTION : A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/


class LargestPalindromeProduct {
	static int get_reverse(int n){
	    int num = 0;
	    while(n != 0){
	        int temp = n % 10;
	        num = num * 10 + temp;
	        n = n / 10;
	    }
	    return num;
	}

	static int palindrome_naive()
	{
	int ans = 0;
		for(int i = 100; i< 1000; i++)
		{
			for(int j = 100; j< 1000 ; j++)
			{
				int prod = i * j;
	            if(prod > ans && i <= j&& get_reverse(prod) == prod)
					ans = prod;
			}
		}
	return ans;
	}

	static int palindrome_fast()
	{
		int ans = 0;
		int a = 999;
		while(a >= 100){
			int b = 999;
			
			while(b >= a){		
				int prod = a*b;
				if( prod < ans)
				    break;
				if(get_reverse(prod) == prod){
					ans = prod;
					System.out.printf("%d %d %d\n", a, b, ans);
					break;
				}
				b--;
			}
			a--;	
		}
		return ans;
	}

	static int palindrome_super_fast(){
	    int ans = 0;
	    int a = 999,b,db;
	    while(a>=100){
	        if (a % 11 == 0){
	            b = 999;
	            db = 1;
	        }
	        else{
	            b = 990;
	            db = 11;
	        }
	        while(b >= a){
	            if(a*b < ans)
	                break;
	            if(get_reverse(a*b) == a*b)
	                ans = a*b;
	            b = b - db;
	        }
	        a--;
	    }
	    return ans;
	}

	public static void main(String[] args) {
		System.out.println("Naive : " + palindrome_naive());	
		System.out.println("Fast : " + palindrome_fast());	
		System.out.println("Naive : " + palindrome_super_fast());	
	}

}
	
//ANSWER = 906609

/*
 - stop counting elements twice..  For example the
number 69696 is checked both when a=132 and b=528 and when a=528 and
b=132. for this check only for a <= b

- start counting backwards from 999

-  Consider the digits
of P – let them be x, y and z. P must be at least 6 digits long since the
palindrome 111111 = 143×777 – the product of two 3-digit integers. Since P is
palindromic:
P=100000x+ 10000y + 1000z + 100z + 10y + x
P=100001x + 10010y + 1100z
P=11(9091x + 910y + 100z)
Since 11 is prime, at least one of the integers a or b must have a factor of 11.
So if a is not divisible by 11 then we know b must be. 

*/