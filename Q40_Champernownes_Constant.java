class ChampernowneConstant {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("0");
		int i = 1;
		while(sb.length() < 1000010) {
			sb.append(i++);
		}
		System.out.println(sb.charAt(1));
		System.out.println(sb.charAt(10));
		System.out.println(sb.charAt(100));
		System.out.println(sb.charAt(1000));
		System.out.println(sb.charAt(10000));
		System.out.println(sb.charAt(100000));
		System.out.println(sb.charAt(1000000));
	}
}

// Answer = 210