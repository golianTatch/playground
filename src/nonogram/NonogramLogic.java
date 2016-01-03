package nonogram;

import java.util.ArrayList;

public class NonogramLogic {
	
	//size of the problem
	public int xSize;
	public int ySize;
	
	//what's on the problem
	ArrayList<int[]> XAxisClues;
	ArrayList<int[]> YAxisClues;
	
	Cell[][] map;
	
	public NonogramLogic(int xSize, int ySize){
		this.xSize=xSize;
		this.ySize=ySize;
		map=new Cell[xSize][ySize];
	}
	
	public void setConfirmed(int x,int y){
		map[x][y].setConfirmed(true);
	}
	
	public void setColor(int color,int x, int y){
		map[x][y].setColor(color);
	}
}
