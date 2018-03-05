package development;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.util.ArrayList;

public class Grid {
	ArrayList<Row> row_list;
	public Grid(ArrayList<Row> row_list) {
		setRows(row_list);
	}
	public ArrayList<Row> getRows() {
		if(row_list==null) {
			System.out.println("Given rows cannot be null!");
			return null;
		}
		return row_list;	
	}
	public void setRows(ArrayList<Row> row_list) {
		this.row_list=row_list;
	}
	@Override
	public String toString() {
		return "Grid [rows=["
				+ "Row [cells=["
				+ "Cell [left="+getRows().get(0).getCells().get(0).getLeft()+", right="+getRows().get(0).getCells().get(0).getRight()+", up="+getRows().get(0).getCells().get(0).getUp()+", down="+getRows().get(0).getCells().get(0).getDown()+"], "
				+ "Cell [left="+getRows().get(0).getCells().get(1).getLeft()+", right="+getRows().get(0).getCells().get(1).getRight()+", up="+getRows().get(0).getCells().get(1).getUp()+", down="+getRows().get(0).getCells().get(1).getDown()+"], "
				+ "Cell [left="+getRows().get(0).getCells().get(2).getLeft()+", right="+getRows().get(0).getCells().get(2).getRight()+", up="+getRows().get(0).getCells().get(2).getUp()+", down="+getRows().get(0).getCells().get(2).getDown()+"]]], "
			+ "Row [cells=["
			+ "Cell [left="+getRows().get(1).getCells().get(0).getLeft()+", right="+getRows().get(1).getCells().get(0).getRight()+", up="+getRows().get(1).getCells().get(0).getUp()+", down="+getRows().get(1).getCells().get(0).getDown()+"], "
			+ "Cell [left="+getRows().get(1).getCells().get(1).getLeft()+", right="+getRows().get(1).getCells().get(1).getRight()+", up="+getRows().get(1).getCells().get(1).getUp()+", down="+getRows().get(1).getCells().get(1).getDown()+"], "
			+ "Cell [left="+getRows().get(1).getCells().get(2).getLeft()+", right="+getRows().get(1).getCells().get(2).getRight()+", up="+getRows().get(1).getCells().get(2).getUp()+", down="+getRows().get(1).getCells().get(2).getDown()+"]]], "
			+ "Row [cells=["
			+ "Cell [left="+getRows().get(2).getCells().get(0).getLeft()+", right="+getRows().get(2).getCells().get(0).getRight()+", up="+getRows().get(2).getCells().get(0).getUp()+", down="+getRows().get(2).getCells().get(0).getDown()+"], "
			+ "Cell [left="+getRows().get(2).getCells().get(1).getLeft()+", right="+getRows().get(2).getCells().get(1).getRight()+", up="+getRows().get(2).getCells().get(1).getUp()+", down="+getRows().get(2).getCells().get(1).getDown()+"], "
			+ "Cell [left="+getRows().get(2).getCells().get(2).getLeft()+", right="+getRows().get(2).getCells().get(2).getRight()+", up="+getRows().get(2).getCells().get(2).getUp()+", down="+getRows().get(2).getCells().get(2).getDown()+"]]]]]";
	}
}
