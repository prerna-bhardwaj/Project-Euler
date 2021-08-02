/*
We need to find a number x*(9^5) which gives us an x digit number. 
Here x=6 satisfies the condition. 6*95 = 354294. So 355000 is used a the upper bound.
*/
class DigitFifthPowers {
	public static void main(String[] args) {
		int power[] = {0, 1, 32, 243, 1024, 3125, 7776, 16807, 32768, 59049};

		int result = 0;
		for(int i=3; i < 355000; i++) {
			int currNum = i;
			int currSum = 0;
			while(currNum != 0) {
				int temp = currNum%10;
				currSum += power[temp];
				currNum /= 10;
			}
			if(currSum == i) {				
				result += i;
				System.out.println(i);
			}
		}
		System.out.println("Final Sum = " + result);
	}
}