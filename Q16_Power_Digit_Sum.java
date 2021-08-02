/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/
class PowerDigitSum {

	public static void main(String[] args) {
		int ar[] = new int[500];
		ar[0] = 1;
		for(int i = 1; i <= 1000; i++) {
			int carry = 0;
			for(int j = 0; j < ar.length; j++) {
				int temp = ar[j]*2 + carry;
				ar[j] = temp%10;
				carry = temp/10;
			}
		}
		int sum = 0;
		for(int i = 0; i < 500; i++)
			sum += ar[i];
		System.out.println(sum);
	}
}