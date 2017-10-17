package is.laserinc.tictactoe;

public class TicTacToe {

	private int board[][];
	private boolean winReturn = false;
	char player;

	public TicTacToe() {
		board = new int[3][3];
	}

	public void mark(int player, int x, int y) {
		board[x][y] = player;
	}

	public boolean checkWin(int player) {
		boolean winReturn = false;
		int value = player;
		for(int counter = 0; counter<3; counter++) {
			boolean win = true;
			for(int i : board[counter]) {
				if(i != value) {
					win = false;
				}
			}
			if(win) {
				winReturn = true;
			}
		}
		for(int counter = 0; counter<3; counter++) {
			boolean win = true;
			for(int i = 0; i<3; i++) {
				if(board[i][counter] != value) {
					win = false;
				}
			}
			if(win) {
				winReturn = true;
			}
		}
		if(board[0][0] == value && board[1][1] == value && board[2][2] == value) {
			winReturn = true;
		}
		if(board[2][0] == value && board [1][1] == value && board[0][2] == value) {
			winReturn = true;
		}
		return winReturn;
	}
	public void ChangePlayer(char player_type) {
		player = player_type;
	}

	public void PrintPlayer(){
		System.out.println("Player " + player + " turn: ");
	}

	public static void main(String[] args) {
    // CODE HERE
		TicTacToe Game = new TicTacToe();
		Game.ChangePlayer('X');
		Game.PrintPlayer();

		Game.ChangePlayer('Y');
		Game.PrintPlayer();

		Game.ChangePlayer('U');
		Game.PrintPlayer();

		//System.out.println(t.check_win(1));
	}



}
