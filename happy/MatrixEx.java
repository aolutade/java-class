package helloworld.happy;

public class MatrixEx {

	public static void main(String[] args) {
		
		int rowSize = 5;
		int columnSize = 10;
		int[][] apple = new int[rowSize][columnSize];
		
		
		for (int row=0;row < rowSize; row++) {
			for(int column= 0; column < columnSize;column++) {
				System.out.print(apple[row][column] + "\t");
			}
			System.out.println();
		}
		
		//int [] apple = new int[5];
		
		
	}

}
