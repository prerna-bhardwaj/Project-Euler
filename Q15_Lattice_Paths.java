/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 
6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?

NOTE : for 20×20 edge grid, we need a 21×21 boolean matrix.
*/
class LatticePaths {
	
	static int row[] = {0, 1};
	static int col[] = {1, 0};
	static String dir[] = {"R", "D"};
	static int numPaths = 0;
	static boolean ar[][] = new boolean[6][6];

	static void findPaths(int sr, int sc, String path) {
		if(sr < 0 || sc < 0 || sr >= ar.length || sc >= ar.length) 
			return;
		if(ar[sr][sc])
			return;
		if(sr == ar.length-1 && sc == ar.length - 1){
			System.out.println(path);
			numPaths++;
			return;
		}
		ar[sr][sc] = true;
		for(int i = 0; i < row.length; i++) {
			findPaths(sr + row[i], sc + col[i], path + dir[i]);
		}
		ar[sr][sc] = false;
	}

	public static void main(String[] args) {
		findPaths(0, 0, "");
		System.out.println("Number of paths : " + numPaths);
	}
}
