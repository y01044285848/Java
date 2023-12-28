package sub1;

/*
 * 날짜 : 2023.12.28
 * 이름 : 이승윤
 * 내용 : 배열 실습
 */

public class ArrayTest {
	public static void main(String[] args) {

		// 배열
		int[] arr1 = { 1, 2, 3, 4, 5 };
		char[] arr2 = { 'A', 'B', 'C' };
		String[] arr3 = { "서울", "대전", "대구", "부산", "광주" };

		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);

		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr3[3] : " + arr3[3]);

		System.out.println("arr1의 길이 : " + arr1.length);
		System.out.println("arr2의 길이 : " + arr2.length);
		System.out.println("arr3의 길이 : " + arr3.length);

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int n : arr1) {
			System.out.print(n + " ");
		}

		System.out.println();

		for (char n : arr2) {
			System.out.print(n + " ");
		}

		System.out.println();

		for (String n : arr3) {
			System.out.print(n + " ");
		}
		System.out.println();

		// 1차원
		int[] scores = { 80, 60, 78, 62, 92 };
		int total = 0;
		for (int i : scores)
			total += i;
		System.out.println("scores 총합 : " + total);

		// 2차원
		int[][] arr2d = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println(arr2d[0][2] + "" + arr2d[1][0] + "" + arr2d[2][2]);

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 4; b++) {
				System.out.println("arr2d[" + a + "][" + b + "] : " + arr2d[a][b]);
			}
		}

		// 3차원
		int[][][] arr3d = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };

		System.out.println("arr3d[0][1][1] : " + arr3d[0][1][1]);
		System.out.println("arr3d[1][2][1] : " + arr3d[1][2][1]);
		System.out.println("arr3d[2][2][0] : " + arr3d[2][2][0]);

		for (int a = 0; a < arr3d.length; a++) {
			for (int b = 0; b < arr3d[a].length; b++) {
				for (int c = 0; c < arr3d[a][b].length; c++) {
					System.out.println("arr2d[" + a + "][" + b + "][" + c + "] : " + arr3d[a][b][c]);
				}
			}
		}

	}
}
