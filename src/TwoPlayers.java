import java.util.Random;

public class TwoPlayers {
    public static void main(String[] args) {

        System.out.println(" -------------welcome to Snake and Ladder game with Two players-------------");
        int totalScoreOfOne=0;
        int totalScoreOftwo=0;

        Dice roll = new Dice();

        int playerOne= 1;
        int pLayerTwo= 2;
        int currentPlayer=playerOne;

        while (totalScoreOfOne<100 && totalScoreOftwo<100) {
            if (currentPlayer==1) {
                Random number = new Random();
                int dice = 1 + number.nextInt(6);
                System.out.println("the role is " + dice);
                //numOfRoles++;
                totalScoreOfOne = roll.play(dice);
                currentPlayer = pLayerTwo;
            } else if (currentPlayer==2) {
                Random number = new Random();
                int dice = 1 + number.nextInt(6);
                System.out.println("the role is " + dice);
                //numOfRoles++;
                totalScoreOftwo = roll.play(dice);
                currentPlayer = playerOne;
            }
        }

        if(totalScoreOfOne==100){
            System.out.println("player One Won the game");
            System.out.println("player two score is"+totalScoreOftwo);
        }
        else {
            System.out.println("player two Won the game");
            System.out.println("player one score is"+totalScoreOfOne);

        }
        System.out.println("-------------END OF GAME-------------");
    }
}
