public class PracticeProblem {

	public static void main(String args[]) {

	}

		//Write question 1 code here
		public static int sum2D(int[][] intArr) {
			int sum = 0;
			for (int i = 0; i < intArr.length; i++) {
				for (int j = 0; j < intArr[i].length; j++) {
					sum += intArr[i][j];

				}
			}
			return sum;

		}
		//write question 2 here
		public static int sumRow(int[][] intArr2, int row) {
			int sum = 0;
			for (int col = 0; col < intArr2[row].length; col++) {
				sum += intArr2[row][col];
			}
			return sum;

		}
		//write question 3 here
		public static int sumColumn(int[][] intArr3, int col) {
			int sum = 0;
			for (int row = 0; row < intArr3.length; row++) {
				sum += intArr3[row][col];
			}
			return sum;

		}

}
