/*
Take the number 192 and multiply it by each of 1, 2, and 3:

192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?
*/
import java.util.*;

class PandigitalMultiples {
	static final String sequence = "123456789";

	static int solve() {
		int largestNum = 0;
		for(int pow = 2; pow <= 9; pow++) {
;			for(int i = 1; i < Math.pow(10, 9/pow); i++) {
				StringBuilder sb = new StringBuilder();
				for(int cnt = 1; cnt <= pow; cnt++) 
					sb.append(i*cnt);
				String curr = sb.toString();	
				if(isPandigital(curr)) {
					largestNum = Math.max(largestNum, Integer.parseInt(curr));
					System.out.println(curr + " " + largestNum);
				}
			}
		}
		return largestNum;
	}

	static boolean isPandigital(String s) {
		if(s.length() != 9)
			return false;
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals(sequence);
	}

	public static void main(String[] args) {
		System.out.println("Largest Pandigital Number = " + solve());				
	}
}