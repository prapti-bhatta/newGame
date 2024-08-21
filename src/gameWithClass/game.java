package gameWithClass;

public class game {
    private final player player1;
    private final player player2;
    private final board board;

    public game(player player1, player player2, board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    public void start(){
        game g = new game(new player("Prapti", 'X'),
                new player("Sujana", 'O'),
                new board());
    }

}
