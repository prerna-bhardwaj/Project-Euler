import java.util.*;

class PermutatedMultiples {
	
	static void solve() {
		for(int i = 1; i <= 170000; i++) {
			char[] ar = ("" + i).toCharArray();
			Arrays.sort(ar);
			if(isPermutation(ar, 2*i) && isPermutation(ar, 3*i) 
				&& isPermutation(ar, 4*i) && isPermutation(ar, 5*i) && isPermutation(ar, 6*i)) {
				System.out.println(i);
			}		
		}
	}

	static boolean isPermutation(char[] ar, int x) {
		char[] curr = ("" + x).toCharArray();
		Arrays.sort(curr);
		return Arrays.equals(ar, curr);
	}

	public static void main(String[] args) {
		solve();	
	}
}

// 142857