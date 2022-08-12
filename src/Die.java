import java.util.Random;

public class Die {
    private int faceValue; // ลูกเต๋าที่ทอยมา

    public Die(){
        this.faceValue = roll();
    }

    public int roll(){
        faceValue = new Random().nextInt(6)+1; //จำนวนทอยของลูกเต๋าตั้งแต่ 1-6
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
