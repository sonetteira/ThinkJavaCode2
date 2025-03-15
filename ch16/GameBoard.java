public class GameBoard {
    public BoardTile[][] board;
    public GameBoard(int x, int y) {
        // build a new game board of size x * y
        board = new BoardTile[x][y];
    }
    class BoardTile {
        String color;
        int value;

        BoardTile() {
            // default to gray, 1
            color = "#808080";
            value = 1;
        }

        BoardTile(String color, int value) {
            this.color = color;
            this.value = value;
        }
    }
}

class Test{
    public static void main(String[] args) {
        GameBoard gb = new GameBoard(5, 5);
        
        // separate movable tile
        GameBoard.BoardTile tile = gb.new BoardTile("red", 5);
    }
}

