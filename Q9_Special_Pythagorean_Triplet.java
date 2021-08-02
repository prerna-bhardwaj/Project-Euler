/* QUESTION : There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. where a<b<c
*/

class PythagoreanTriplet {

	static boolean is_triangle(int a, int b, int c){
	    if((a+b) < c)
	        return false;
	    if(a*a + b*b != c*c)
	        return false;
	    return true;
	}

	static void get_triplets_naive()
	{
	    int cnt = 0, cnt2 = 0;
	    for(int a = 100; a<=500; a++){
	        for(int b = a;b<=500; b++){
	            int c = 1000 - b - a;
	            cnt++;
	            if(c > b && is_triangle(a,b,c)){
	                System.out.printf("%d %d %d %d\n", a, b, c, a*b*c);
	                cnt2++;
	                break;
	            }
	        }
	    }
	    System.out.println(cnt + " " + cnt2);
	}


	static int gcd(int a, int b){
	    if(b == 0)  return a;
	    int rem = a % b;
	    return gcd(b,rem);
	}

	static void get_triplets_fast()
	{
	    int s = 1000;
	    int s2 = s/2;
	    int m = 1;
	    int cnt = 0;
	    for(m = 1; m*m < s2 ; m++)
	    {
	        cnt++;
	        if(s2 % m == 0){
	            int sm = s2/m;
	            while(sm % 2 == 0)  sm /= 2;
	            int k = 0;
	            if (m%2 ==1 )   k = m+2;
	            else    k = m + 1;
	            while(k < 2*m && k*k <= sm){
	                if((sm % k) == 0 && gcd(m, k) == 1){
	                    int d = s / (2 * m * k);
	                    int n = k - m;
	                    int a = m*m - n*n;
	                    int b = 2 * m * n;
	                    int c = m*m + n*n;
	                    System.out.println(a + " " + b + " " + c + " " + d);
	                    System.out.println(a*d + " " + b*d + " " + c*d);
	                    System.out.println(a*b*c*d*d*d);
	                }
	                k += 2;
	            }
	        }
	    }
		System.out.println(cnt);	
	}

	public static void main(String[] args) {
	    get_triplets_naive();
	    get_triplets_fast();	
	}


}
