package development;
/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mainapp {
	public static void main(String[] args) {
		Cell cell;
		Row row;
		Random random=new Random();
		int size=random.nextInt(5)+3;
		ArrayList<Cell> cellist;
		ArrayList<Row> rowlist = new ArrayList<Row>();
		for(int i=0;i<size;i++) {
			cellist=new ArrayList<>();
			for(int j=0;j<size;j++) {
				cell=new Cell(CellComponents.WALL,CellComponents.WALL,CellComponents.WALL,CellComponents.WALL);
				cellist.add(cell);
			}
			row=new Row(cellist);
			rowlist.add(row);
		}
		Grid grid=new Grid(rowlist);
		Display display=new Display(grid);
		Game game=new Game(grid,display);
		game.createGrid();
		String n="right";
		Player player=new Player(grid.getRows().get(grid.getRows().size()-1),grid.getRows().get(grid.getRows().size()-1).getCells().get(grid.getRows().size()-1));
		while(player.getCurrentCell().getLeft()!=CellComponents.EXIT || !n.equals("left")) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter a direction: ");
			n = reader.nextLine();
			if(n.equals("left")) {
				game.play(Movement.LEFT, player,display);
				}
			else if(n.equals("right")) {
				game.play(Movement.RIGHT, player,display);
				}
			else if(n.equals("up")) {
				game.play(Movement.UP, player,display);
				}
			else if(n.equals("down")) {
				game.play(Movement.DOWN, player,display);
				}
		}
	}
}
