package development;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */

public class Display {
	Grid grid;
	int numberOfRows;
	String[][] resultGrid;
	public Display(Grid grid) {
		numberOfRows=grid.getRows().size();
		this.grid=grid;
		resultGrid = new String[numberOfRows][numberOfRows];
		initializeResultGrid();
	}
	public void initializeResultGrid() {
		System.out.println(grid.getRows().size());
		for (int row = 0; row < numberOfRows; row++) { 
			for (int column = 0; column <numberOfRows ; column++) { 
				resultGrid[row][column] = "S ";
			}
		
		}
		resultGrid[0][0]="E ";
		resultGrid[numberOfRows-1][numberOfRows-1]="A";
	}
	public String getResultGrid(int row, int column) {
		return resultGrid[row][column];
	}
	public void printBoard() {
		for (int row = 0; row < numberOfRows; row++) { 
			for (int column = 0; column < numberOfRows; column++) { 
				System.out.print(getResultGrid(row, column));			
			}
			System.out.println();
		}
	}
	public void setGrid(int a,int b,int c,int d) {
		resultGrid[a][b]="A ";
		resultGrid[c][d]="S ";
	}
}