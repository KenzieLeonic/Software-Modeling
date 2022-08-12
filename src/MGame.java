import java.util.ArrayList;
import java.util.List;

public class MGame {
        private int roundCount;//นับรอบเล่นเกม
        private Die dice1;//ลูกเต๋าลูกที่1
        private Die dice2;//ลูกเต๋าลูกที่2
        private Board board;//กระดานเล่นเกมเศรษฐี
        private ArrayList<Player> players;//1 Game มีได้ 2-8 player

        public MGame() {
            this.roundCount = 0;
            this.dice1 = new Die();
            this.dice2 = new Die();
            this.board = new Board();
            this.players = new ArrayList<>();
        }

        public void playGame(int N){
            for (;roundCount<N;roundCount++){
                playRound(); //วนจำนวนรอบที่เล่น (รอบที่ N)
            }

        }

        private void playRound(){
            for (Player player : players){
                player.takeTurn();//วนผู้เล่นว่าถึงใครบ้าง
            }
        }
}
