import java.util.ArrayList;

public class Board{
    private ArrayList<Square> squares; //1 board has 40 squares

    public Board() {
        this.squares = new ArrayList<>();
    }

    //ตำแหน่งผู้เล่นในกระดาน
    public Square getSquare(Square location, int fv){
        int currentLocation = 0;
        for (int index = 0; index < squares.size(); index++) {
            if (location.equals(squares.get(index))) {
                currentLocation = index;
            }
        }
        int newLocation = currentLocation + fv;
        if (newLocation == squares.size()) {
            newLocation = newLocation % 40; //ผู้เล่นเดินครบ กระดาน ให้วนกลับตั้งแต่ 1 ใหม่
        }
        return squares.get(newLocation);
    }
}
