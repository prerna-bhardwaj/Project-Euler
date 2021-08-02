/*
Evaluate the sum of all amicable numbers upto 1000
*/

class AmicableNumbers {
	static int ar[] = new int[10005] ;
	
	static void getDivisorSum() {
		for(int i = 1; i < ar.length; i++) {
			int curr = 2*i;
			while(curr < ar.length) {
				ar[curr] += i;
				curr += i;
			}
		}
		// for(int i = 0;i < ar.length; i++)
		// 	System.out.println(i + " " + ar[i]);
	}

	static int getAmicableNumbers() {
		int sum = 0;
		for(int i = 0; i < ar.length; i++) {
			int temp = ar[i];
			if(temp <= i || temp > ar.length)
				continue;
			if(ar[temp] == i) {
				System.out.println(i + " " + temp);
				sum += i + temp;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		getDivisorSum();
		System.out.println(getAmicableNumbers());					
	}
}

// 31626