package game_of_life;

public class Board {
	
	//create matrix of size 100x100
	private int [][] matrix = new int [100][100];
	
	 public Board() {
		 
		 //initialize everything to 0 for now, loop will need to be changed to call differently later
		 for(int i = 0; i < matrix.length; i++) {
			 for(int j = 0; j < matrix.length;j++) {
				 this.matrix[i][j] = 0;
			 }
		 }
	 }
	 
	 public void printBoardInformation() {
		 for(int i = 0; i < matrix.length; i++) {
			 for(int j = 0; j < matrix.length;j++) {
				 System.out.print(this.matrix[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }
	 
}
