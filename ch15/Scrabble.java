public class Scrabble {
    public static void main(String[] args) {
        ScrabbleBoard sb = new ScrabbleBoard();
        sb.printBoard();
    }
}

class ScrabbleBoard {
    ScrabbleSquare[][] board;

    public ScrabbleBoard() {
        buildBoard();
    }

    void buildBoard() {

        // 15x15 board of tan squares
        board = new ScrabbleSquare[15][15];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                board[i][j] = new ScrabbleSquare();
            }
        }

        // add red squares
        for(int i=0; i<board.length; i+=7) {
            for(int j=0; j<board.length; j+=7) {
                if(i==7 && j==7) {
                    continue;
                }
                board[i][j].setMultipliers(ScrabbleSquare.Colors.RED);
            }
        }
        // add pink squares
        for(int i=1; i<board.length-1; i++) {
            if(i==5 || i==6 || i==8 || i==9) {
                board[i][i].setMultipliers(ScrabbleSquare.Colors.BLUE);
                board[board.length-i-1][i].setMultipliers(ScrabbleSquare.Colors.BLUE);
                continue;
            }
            board[i][i].setMultipliers(ScrabbleSquare.Colors.PINK);
            board[board.length-i-1][i].setMultipliers(ScrabbleSquare.Colors.PINK);
        }
        //add teal squares
        for(int i=1; i<board.length; i+=4) {
            for(int j=1; j<board.length; j+=4) {
                if((i==1 || i==13) && (j==1 || j==13)) {
                    continue;
                }
                board[i][j].setMultipliers(ScrabbleSquare.Colors.TEAL);
            }
        }
        // add blue squares
        for(int i=0; i<board.length; i+=7) {
            board[i][3].setMultipliers(ScrabbleSquare.Colors.BLUE);
            board[i][11].setMultipliers(ScrabbleSquare.Colors.BLUE);
        }
        for(int i=2; i<board.length; i+=10) {
            board[i][6].setMultipliers(ScrabbleSquare.Colors.BLUE);
            board[i][8].setMultipliers(ScrabbleSquare.Colors.BLUE);
            board[6][i].setMultipliers(ScrabbleSquare.Colors.BLUE);
            board[8][i].setMultipliers(ScrabbleSquare.Colors.BLUE);
        }
        for(int i=3; i<board.length; i+=8) {
            for(int j=0; j<board.length; j+=7) {
                board[i][j].setMultipliers(ScrabbleSquare.Colors.BLUE);
            }
        }
    }
    

    public void printBoard() {
        System.out.println();
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.printf("%s%5s", getColor(board[i][j].getColor()), board[i][j]);
            }
            System.out.println(ANSI_RESET);
        }
        System.out.println();
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_MAGENTA = "\u001B[95m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public String getColor(ScrabbleSquare.Colors squareColor) {
        switch (squareColor) {
            case ScrabbleSquare.Colors.RED:
                return ANSI_RED;
            case ScrabbleSquare.Colors.PINK:
                return ANSI_MAGENTA;
            case ScrabbleSquare.Colors.TEAL:
                return ANSI_GREEN;
            case ScrabbleSquare.Colors.BLUE:
                return ANSI_CYAN;
            default:
                return ANSI_YELLOW;
        }
    }
}

class ScrabbleSquare {
    enum Colors {
        RED,
        PINK,
        TEAL,
        BLUE,
        TAN
    }
    Colors color;
    int wordMultiplier;
    int letterMultiplier;

    public ScrabbleSquare() {
        this.color = Colors.TAN;
        this.letterMultiplier = 1;
        this.wordMultiplier = 1;
    }

    public ScrabbleSquare.Colors getColor() {
        return this.color;
    }
    protected void setMultipliers(Colors color) {
        this.color = color;
        switch (color) {
            case Colors.RED:
                this.wordMultiplier = 3;
                return;
            case Colors.PINK:
                this.wordMultiplier = 2;
                return;
            case Colors.TEAL:
                this.letterMultiplier = 3;
                return;
            case Colors.BLUE:
                this.letterMultiplier = 2;
                return;
            default:
                break;
        }
    }
    public int getLetterMultiplier() {
        return letterMultiplier;
    }
    public int getWordMultiplier() {
        return wordMultiplier;
    }
    public String toString() {
        return color.toString();
    }
}
