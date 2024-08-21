package gameWithClass;

public class board {

    private char[][] Board;

    public board() {
        Board = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int colm = 0; colm < 3; colm++) {
                Board[row][colm] = ' ';
            }
        }
    }

    public static void printBoard(char[][] Board) { //function for printing the board
        for (int row = 0; row < 3; row++) {
            for (int colm = 0; colm < 3; colm++) {
                System.out.print(Board[row][colm] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(char symbol, char[][] Board) {
        for (int row=0 ; row < 3 ; row++)  // for checking row wise winner
        {
            if (Board[row][0] ==symbol && Board[row][1] == symbol && Board[row][2]==symbol){
                return true;
            }
        }

        for(int colm = 0 ; colm < 3 ; colm++)  //for checking column wise winner
        {
            if (Board[0][colm]==symbol && Board[1][colm]==symbol && Board[2][colm]==symbol){
                return true;
            }
        }

        if(Board[0][0] == symbol && Board[1][1] == symbol && Board[2][2] == symbol){ // for checking diagonally winner
            return true;
        }
        if(Board[1][2] == symbol && Board[1][1] == symbol && Board[2][2] == symbol){ // for checking diagonally winner
            return true;
        }

        return false;

    }

    public boolean isFull(){
        for (int row = 0 ; row < 3 ; row++){
            for (int colm = 0 ; colm < 3 ; colm++){
                if (Board[row][colm]== ' '){
                    return false;
                }
            }
        }
        return true;
    }
}