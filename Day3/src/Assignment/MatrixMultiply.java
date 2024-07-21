package Assignment;

public class MatrixMultiply {

	public static void main(String[] args) {
		
		int p = 3;
		int q = 3;
		int m = 3;
		int n = 3;
		int[][] mat1 = new int[p][q];
		int[][] mat2 = new int[m][n];
		int[][] ans = new int[p][n];
		
		
		for(int k=0; k<Math.pow(q, m); k++) {
			int sum=0;
			for(int i=0;i<q; i++) {
				for(int j=0; j<p; j++) {
					sum += mat1[i][j]*mat2[j][i];
				}
			}
		}
			
		
		
		
		
		
		
		
		
	}
}
