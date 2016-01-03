package nonogram;

public class Cell {
	private int color;
	private boolean isConfirmed;
	
	Cell(int color){
		this.color=color;
		this.isConfirmed=false;
	}
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public boolean isConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	
}
