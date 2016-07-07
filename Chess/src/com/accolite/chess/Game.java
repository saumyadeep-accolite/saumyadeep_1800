package com.accolite.chess;

public class Game {
	
	private Tile[][] board = new Tile[8][8];
	private static final int NUM_ROWS = 8;
	private static final int NUM_COLS = 8;
	private Player player1;
	private Player player2;
	
	private void initGame() {
		player1 = new Player(Color.WHITE);
		player2 = new Player(Color.BLACK);
		initBoard();
	}
	private void initBoard(){
		
		for (int i = 0; i < NUM_ROWS; i++) {
			for (int j = 0; j < NUM_COLS; j++) {
				Position position = new Position(i,j);
				board[i][j] = new Tile(position,((i+j)%2==0)?Color.BLACK:Color.WHITE);
			}
		}
		fillBoardWithPieces();
	}
	
	private void fillBoardWithPieces(){
		
	}

}
