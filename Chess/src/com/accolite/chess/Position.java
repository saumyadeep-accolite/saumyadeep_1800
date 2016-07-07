package com.accolite.chess;

public class Position {
	
	private int x;
	private int y;
	
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isPositionOutOfBounds(){
		return x<0 || x>=8 || y<0 || y>=8;
	}
	
	public Position change(int xx, int yy){
		Position result = new Position(this.x+xx,this.y+yy);
		if(!result.isPositionOutOfBounds()){
			return result;
		}
		else{
			return null;
		}
	}
	
}
