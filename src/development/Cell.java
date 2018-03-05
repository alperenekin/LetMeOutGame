package development;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
public class Cell {
	private CellComponents move1,move2,move3,move4;
	public Cell(CellComponents move1,CellComponents move2,CellComponents move3,CellComponents move4) {
		setLeft(move1);
		setRight(move2);
		setUp(move3);
		setDown(move4);
	}
	public CellComponents getLeft() {
		return move1;
	}
	public void setLeft(CellComponents move1) {
		if(move1==null) {
			this.move1=CellComponents.WALL;
		}
		else
			this.move1 = move1;
		
	}
	public CellComponents getRight() {
		return move2;
	}
	public void setRight(CellComponents move2) {
		if(move2==null) {
			this.move2=CellComponents.WALL;
		}
		else
			this.move2 = move2;
	}
	public CellComponents getUp() {
		return move3;
	}
	public void setUp(CellComponents move3) {
		if(move3==null) {
			this.move3=CellComponents.WALL;
		}
		else
			this.move3 = move3;
		
	}
	@Override
	public String toString() {
		return "Cell [left=" + getLeft() + ", right=" + getRight() + ", up=" + getUp() + ", down=" + getDown() + "]";
	}
	public CellComponents getDown() {
		return move4;
	}
	public void setDown(CellComponents move4) {
		if(move4==null) {
			this.move4=CellComponents.WALL;
		}
		else
			this.move4 = move4;
		
	}	
}
