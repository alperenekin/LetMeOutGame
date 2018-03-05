package development;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
public class Player {
	Row currentRow;
	Cell currentCell;
	public Player(Row currentRow,Cell currentCell) {
		setCurrentRow(currentRow);
		setCurrentCell(currentCell);
	}
	public void setCurrentRow(Row currentRow) {
		this.currentRow=currentRow;
	}
	public void setCurrentCell(Cell currentCell) {
		this.currentCell=currentCell;
	}
	public Row getCurrentRow() {
		return currentRow;
	}
	public Cell getCurrentCell() {
		return currentCell;
	}
	@Override
	public String toString() {
		return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
	}
}
