import java.util.*;

class Prime_Permutations {

	static String solve() {
		for(int i = 1001; i < 3400; i+=2) {
			int a = i, b = i+3330, c = i+6660;
			if(isPrime(a) && isPrime(b) && isPrime(c)) {
				if(isPermutation(a, b) && isPermutation(a, c)) {
					System.out.println(a + " = " + a + "" + b + "" + c);
					// return "" + a + b + c;
				}
			}
		}
		return "No value found !";
	}

	static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n);i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

	static boolean isPermutation(int a, int b) {
		char[] arr1 = (""+a).toCharArray();
		char[] arr2 = (""+b).toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		// System.out.println(arr1 + " - " + arr2);
		return Arrays.equals(arr1, arr2);

 		//arr1 and arr2 are two references to two different objects. So when we compare arr1 and arr2, 
 		// two reference variables are compared, therefore false is returned always.
 		// return arr1 == arr2;	
	}

	public static void main(String[] args) {
		System.out.println(solve());
	}
}