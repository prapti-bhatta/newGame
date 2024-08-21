package gameWithClass;

public class player {

    private final String playername;
    private final char symbol;
    public player(String name,char symbol){ //funtion to return the value for name and symbol
        this.playername = name;
        this.symbol = symbol;

    }
    public String getName(){ // function to save the value name
        return playername;
    }
    public char getSymbol(){ // function to save the value symbol
        return symbol;
    }
}
