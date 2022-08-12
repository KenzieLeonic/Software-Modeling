import java.util.ArrayList;

public class Player {
    private String name;
    private Die dice1; //ลูกเต๋าลูกที่ 1
    private Die dice2; //ลูกเต๋าคนที่ 2
    private Piece piece;
    private Board board; //composition

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    public void takeTurn(){
        dice1.roll();
        dice2.roll();
        int fv1 = dice1.getFaceValue();
        int fv2 = dice2.getFaceValue();
        int fvTotal = fv1 + fv2;//รวมแต้มหน้าลูกเต๋าลูก1กับ2
        Square oldLoc = piece.getLocation(); //เอาตำแหน่งเดินที่เก่า
        Square newLoc = board.getSquare(oldLoc,fvTotal); //ได้ ตำแหน่งหลังจากทอยลูกเต๋า
        piece.setLocation(newLoc);
    }
}
