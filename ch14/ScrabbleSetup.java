import java.util.HashMap;

public class ScrabbleSetup {
    public static void main(String[] args) {
        // test letter tile
        LetterTile l = new LetterTile("L", 1);
        System.out.println(l);
        System.out.println(l.getPoints());
        
        // test blank tile
        BlankTile blank = new BlankTile();
        System.out.println(blank);
        blank.assignLetter("V");
        System.out.println(blank);

        LetterTile[] tiles = createLetters();
        System.out.println(tiles[0]);
    }

    public static LetterTile[] createLetters() {
        LetterTile[] tiles = new LetterTile[100];
        HashMap<String, int[]> tileDist = new HashMap<>();
        tileDist.put("E", new int[] {1, 12});
        tileDist.put("A", new int[] {1, 9});
        tileDist.put("I", new int[] {1, 9});
        tileDist.put("O", new int[] {1, 8});
        tileDist.put("N", new int[] {1, 6});
        tileDist.put("R", new int[] {1, 6});
        tileDist.put("T", new int[] {1, 6});
        tileDist.put("L", new int[] {1, 4});
        tileDist.put("S", new int[] {1, 4});
        tileDist.put("U", new int[] {1, 4});
        tileDist.put("D", new int[] {2, 4});
        tileDist.put("G", new int[] {2, 3});
        tileDist.put("B", new int[] {3, 2});
        tileDist.put("C", new int[] {3, 2});
        tileDist.put("M", new int[] {3, 2});
        tileDist.put("P", new int[] {3, 2});
        tileDist.put("F", new int[] {4, 2});
        tileDist.put("H", new int[] {4, 2});
        tileDist.put("V", new int[] {4, 2});
        tileDist.put("W", new int[] {4, 2});
        tileDist.put("Y", new int[] {4, 2});
        tileDist.put("K", new int[] {5, 1});
        tileDist.put("J", new int[] {8, 1});
        tileDist.put("X", new int[] {8, 1});
        tileDist.put("Q", new int[] {10, 1});
        tileDist.put("Z", new int[] {10, 1});
        tileDist.put("blank", new int[] {0, 2});

        int j = 0;
        for(String l : tileDist.keySet()) {
            int val = tileDist.get(l)[0];
            int dup = tileDist.get(l)[1];
            for(int i=0; i<dup; i++) {
                if(l.equals("blank")) {
                    tiles[j++] = new BlankTile();
                } else {
                    tiles[j++] = new LetterTile(l, val);
                }
                
            }
        }

        return tiles;
    }
}

class LetterTile {
    // Scrabble letter tile
    private String letter;
    private int points;
    public LetterTile(String letter, int value) {
        this.letter = letter;
        this.points = value;
    }

    public String getLetter() {
        return letter;
    }
    public int getPoints() {
        return points;
    }
    public String toString() {
        return getLetter();
    }
}

class BlankTile extends LetterTile {
    // Scrabble blank tiles
    private String assignedLetter;
    public BlankTile() {
        super("_", 0);
    }
    public void assignLetter(String letter) {
        this.assignedLetter = letter;
    }
    public String getLetter() {
        if(assignedLetter != null) {
            return assignedLetter;
        } else {
            return super.getLetter();
        }
    }
}