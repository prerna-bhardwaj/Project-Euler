
class SubStringDivisibility {
	static long sum = 0;

	static void permute(String s, int start, int end) {
		if(start == end && s.charAt(0) != '0' && checkDivisibility(s)) {
			System.out.println(s);
			sum += Long.parseLong(s);
			return;
		}
		for(int i = start; i <= end; i++) {
			s = swap(s, start, i);
			//System.out.println(s);
			permute(s, start+1, end);
			s = swap(s, start, i);
		}
	}

	static String swap(String s, int i, int j) {
		StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j, s.charAt(i));
        return sb.toString();
	}
 
	static boolean checkDivisibility(String s) {
		int div2 = Integer.valueOf(s.substring(1, 4));
		int div3 = Integer.parseInt(s.substring(2, 5));
		int div5 = Integer.parseInt(s.substring(3, 6));
		int div7 = Integer.parseInt(s.substring(4, 7));
		int div11 = Integer.parseInt(s.substring(5, 8));
		int div13 = Integer.parseInt(s.substring(6, 9));
		int div17 = Integer.parseInt(s.substring(7, 10));

		if((div2%2 == 0) && (div3%3 == 0) && (div5%5 == 0) && (div7%7 == 0) && (div11%11 == 0) && (div13%13 == 0) && (div17%17 == 0))
			return true;

		return false;
	}


	public static void main(String[] args) {
		String s = "0123456789";
		permute(s, 0, s.length()-1);		
		System.out.println("Sum = " + sum);
	}
}