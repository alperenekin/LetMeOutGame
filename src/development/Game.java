package development;
import java.util.Random;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
public class Game {
	Grid grid;
	Display display;
	public Game(Grid grid) {
		this.grid=grid;

	}
	public Game(Grid grid,Display display) {
		this.display=display;
		this.grid=grid;
	}
	public Grid getGrid() {
		return grid;
	}
	public Grid createGrid() {
		for(int i=0;i<grid.getRows().size()-1;i++) {
			for(int k=0;k<grid.getRows().size();k++) {
				grid.getRows().get(i).getCells().get(k).setDown(CellComponents.APERTURE);
			}
		}
		for(int i=1;i<grid.getRows().size();i++) {
			for(int k=0;k<grid.getRows().size();k++) {
				grid.getRows().get(i).getCells().get(k).setUp(CellComponents.APERTURE);
			}
		}
		Random rand= new Random();
		for(int i=0;i<grid.getRows().size();i++) {
			for(int k=0;k<grid.getRows().size()-1;k++) {
				int a =rand.nextInt(2)+1;
				CellComponents comp=null;
				if(a==1) {
					comp=CellComponents.WALL;
				}
				else if(a==2) {
					comp=CellComponents.APERTURE;
				}
				grid.getRows().get(i).getCells().get(k).setRight(comp);
				grid.getRows().get(i).getCells().get(k+1).setLeft(comp);	
			}
		}
		grid.getRows().get(0).getCells().get(0).setLeft(CellComponents.EXIT);
		setGrid(grid);
		return grid;	
	}
	public void setGrid(Grid grid) {
		this.grid=grid;
	}
	public boolean play(Movement move,Player player,Display display){
		int row=0;
		int column=0;
		if(move==Movement.UP && player.getCurrentCell().getUp()==CellComponents.APERTURE) {
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}			
			};
			player.setCurrentRow(grid.getRows().get(row-1));
			player.setCurrentCell(grid.getRows().get(row-1).getCells().get(column));	
			display.printBoard();
			display.setGrid(row-1,column, row,column);
			System.out.println("You moved to up");
			display.printBoard();
			return true;
		}
		else if(move==Movement.DOWN && player.getCurrentCell().getDown()==CellComponents.APERTURE) {
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}	
			}
			player.setCurrentRow(grid.getRows().get(row+1));
			player.setCurrentCell(grid.getRows().get(row+1).getCells().get(column));
			display.printBoard();
			display.setGrid(row+1,column,row,column);
			System.out.println("You moved to down");
			display.printBoard();
			return true;
		}
		else if(move==Movement.LEFT && player.getCurrentCell().getLeft()==CellComponents.APERTURE) {
			
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}
			}
			player.setCurrentRow(grid.getRows().get(row));
			player.setCurrentCell(grid.getRows().get(row).getCells().get(column-1));
			display.printBoard();
			display.setGrid(row,column-1,row,column);
			System.out.println("You moved to right ");
			display.printBoard();
			return true;
		}
		else if(move==Movement.RIGHT && player.getCurrentCell().getRight()==CellComponents.APERTURE) {
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}
				
			}
			player.setCurrentRow(grid.getRows().get(row));
			player.setCurrentCell(grid.getRows().get(row).getCells().get(column+1));
			display.printBoard();
			display.setGrid(row, column+1, row,column);
			System.out.println("You moved to right");
			display.printBoard();
			return true;
		}
		else if(move==Movement.LEFT && player.getCurrentCell().getLeft()==CellComponents.EXIT) {
			System.out.println("YOU FINISHED THE GAME");
			return true;
		}
		else
			System.out.println("You cant move");
			return false;
	}
	public boolean play(Movement move,Player player){
		int row=0;
		int column=0;
		
		if(move==Movement.UP && player.getCurrentCell().getUp()==CellComponents.APERTURE) {
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}
				
			}
			player.setCurrentRow(grid.getRows().get(row-1));
			player.setCurrentCell(grid.getRows().get(row-1).getCells().get(column));	
			return true;
		}
		else if(move==Movement.DOWN && player.getCurrentCell().getDown()==CellComponents.APERTURE) {
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}	
			}
			//System.out.println(player.getCurrentRow());
			player.setCurrentRow(grid.getRows().get(row+1));
			player.setCurrentCell(grid.getRows().get(row+1).getCells().get(column));
			//System.out.println(grid.getRows().get(a+1));
		
			return true;
		}
		else if(move==Movement.LEFT && player.getCurrentCell().getLeft()==CellComponents.APERTURE) {
			
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}
			}

			player.setCurrentRow(grid.getRows().get(row));
			player.setCurrentCell(grid.getRows().get(row).getCells().get(column-1));
			return true;
		}
		else if(move==Movement.RIGHT && player.getCurrentCell().getRight()==CellComponents.APERTURE) {
			for(int i =0;i<grid.getRows().size();i++) {
				for(int k=0;k<grid.getRows().size();k++)
				if(grid.getRows().get(i).getCells().get(k)==player.getCurrentCell()){
					row=i;
					column=k;
				}
				
			}
			player.setCurrentRow(grid.getRows().get(row));
			player.setCurrentCell(grid.getRows().get(row).getCells().get(column+1));
			return true;
		}
		else if(move==Movement.LEFT && player.getCurrentCell().getLeft()==CellComponents.EXIT) {
			System.out.println("YOU FINISHED THE GAME");
			return true;
		}
		else
			System.out.println("you cant move");
			return false;
	}
	@Override
	public String toString() {
		return "Game [grid=Grid [rows=["
				+ "Row [cells=["
				+ "Cell [left="+grid.getRows().get(0).getCells().get(0).getLeft()+", right="+grid.getRows().get(0).getCells().get(0).getRight()+", up="+grid.getRows().get(0).getCells().get(0).getUp()+", down="+grid.getRows().get(0).getCells().get(0).getDown()+"], "
				+ "Cell [left="+grid.getRows().get(0).getCells().get(1).getLeft()+", right="+grid.getRows().get(0).getCells().get(1).getRight()+", up="+grid.getRows().get(0).getCells().get(1).getUp()+", down="+grid.getRows().get(0).getCells().get(1).getDown()+"], "
				+ "Cell [left="+grid.getRows().get(0).getCells().get(2).getLeft()+", right="+grid.getRows().get(0).getCells().get(2).getRight()+", up="+grid.getRows().get(0).getCells().get(2).getUp()+", down="+grid.getRows().get(0).getCells().get(2).getDown()+"]]], "
			+ "Row [cells=["
			+ "Cell [left="+grid.getRows().get(1).getCells().get(0).getLeft()+", right="+grid.getRows().get(1).getCells().get(0).getRight()+", up="+grid.getRows().get(1).getCells().get(0).getUp()+", down="+grid.getRows().get(1).getCells().get(0).getDown()+"], "
			+ "Cell [left="+grid.getRows().get(1).getCells().get(1).getLeft()+", right="+grid.getRows().get(1).getCells().get(1).getRight()+", up="+grid.getRows().get(1).getCells().get(1).getUp()+", down="+grid.getRows().get(1).getCells().get(1).getDown()+"], "
			+ "Cell [left="+grid.getRows().get(1).getCells().get(2).getLeft()+", right="+grid.getRows().get(1).getCells().get(2).getRight()+", up="+grid.getRows().get(1).getCells().get(2).getUp()+", down="+grid.getRows().get(1).getCells().get(2).getDown()+"]]], "
			+ "Row [cells=["
			+ "Cell [left="+grid.getRows().get(2).getCells().get(0).getLeft()+", right="+grid.getRows().get(2).getCells().get(0).getRight()+", up="+grid.getRows().get(2).getCells().get(0).getUp()+", down="+grid.getRows().get(2).getCells().get(0).getDown()+"], "
			+ "Cell [left="+grid.getRows().get(2).getCells().get(1).getLeft()+", right="+grid.getRows().get(2).getCells().get(1).getRight()+", up="+grid.getRows().get(2).getCells().get(1).getUp()+", down="+grid.getRows().get(2).getCells().get(1).getDown()+"], "
			+ "Cell [left="+grid.getRows().get(2).getCells().get(2).getLeft()+", right="+grid.getRows().get(2).getCells().get(2).getRight()+", up="+grid.getRows().get(2).getCells().get(2).getUp()+", down="+grid.getRows().get(2).getCells().get(2).getDown()+"]]]]]]";
	}
	
}
