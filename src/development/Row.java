package development;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.util.ArrayList;
public class Row {
	ArrayList<Cell> aList=new ArrayList<Cell>();
	public Row(ArrayList<Cell> aList) {								
	setCells(aList);
	}
	
	public ArrayList<Cell> getCells() {
		if(aList==null) {
			System.out.print("Given cells cannot be null!");
			return null;
		}
		return aList;
	}
	public void setCells(ArrayList<Cell> aList) {
		this.aList=aList;
	}
	@Override
	public String toString() {
		return "Row [cells=["
				+ "Cell [left="+aList.get(0).getLeft()+", right="+aList.get(0).getRight()+", up="+aList.get(0).getUp()+", down="+aList.get(0).getDown()+"], "
				+ "Cell [left="+aList.get(1).getLeft()+", right="+aList.get(1).getRight()+", up="+aList.get(1).getUp()+", down="+aList.get(1).getDown()+"], "
				+ "Cell [left="+aList.get(2).getLeft()+", right="+aList.get(2).getRight()+", up="+aList.get(2).getUp()+", down="+aList.get(2).getDown()+"]]]";
	
	}
}