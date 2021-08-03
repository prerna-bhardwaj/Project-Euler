
class LexicographicPermutations {
	static int cnt = 0;

	static String nextPermutation(String s) {
		int i = s.length()-1, largestI = -1;
		// Find the largest i such that ar[i] < ar[i+1]
		while(i > 0) {
			if(s.charAt(i) > s.charAt(i-1)) {
				largestI = i-1;
				break;
			}
			i--;
		}
		// If largest = -1, then this is the last permutation of the given string
		if(largestI == -1) 
			return s;

		// Find the largest j such that ar[j] > ar[i] i.e. the rightmost value greater than i
		int j = largestI+1, largestJ = -1;;
		while(j < s.length()) {
			// System.out.
			if(s.charAt(j) > s.charAt(largestI)){
				largestJ = j;
			}
			j++;
		}
		// Swap the rightmost value greater than i with i.
		s = swap(largestI, largestJ, s);

		i = largestI + 1;
		j = s.length()-1;
		// Reverse the string from i+1 to the end.
		StringBuilder sb = new StringBuilder(s);
		while(i <= j) {
			char c = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, c);	
			i++;
			j--;
		}
		return sb.toString();
	}

	static void solve(String s) {
		int cnt = 1;
		// Stops at the millionth permutation
		while(cnt < 1000000) {
			String temp = nextPermutation(s);
			if(temp == s)
				break;
			System.out.println(temp);
			s = temp;
			cnt++;
		}
	}

	static String swap(int i, int j, String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(i, s.charAt(j));
		sb.setCharAt(j, s.charAt(i));
		return sb.toString();
	}

	public static void main(String[] args) {
		solve("0123456789");	
	}
}

/*
Below code just finds all permutations of the given string.
The permutations so found are not necessarily in lexicographic order.	

	static void solve(String s, int left, int right) {
		if(cnt >= 1000000)
			return;
		if(left == right) {
			System.out.println(s);
			cnt++;
			return;
		}

		for(int i = left; i <= right; i++) {
			// System.out.println("Swapping : " + i + " " + left + " " + s);
			s = swap(i, left, s);
			// System.out.println("calling : " + (left+1) + " " + right + " " + s);
			solve(s, left + 1, right);
			s = swap(i, left, s);
		}
	}
*/