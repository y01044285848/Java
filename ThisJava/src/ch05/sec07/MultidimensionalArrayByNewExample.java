package ch05.sec07;

public class MultidimensionalArrayByNewExample {
	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i < mathScores.length;i++) {
			for(int k = 0; k < mathScores.length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]:" + mathScores[i][k]);
			}
		}
	}
}
