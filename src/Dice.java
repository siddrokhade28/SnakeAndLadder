import java.util.Random;

public class Dice {

    int startPostion = 0;

    public int play(int dice) {
            Random number = new Random();
        int random1 = 1 + number.nextInt(3);
        switch (random1) {
            case 1:
                System.out.println("No Play");
                break;
            case 2:
                startPostion = startPostion + dice;
                if (startPostion > 100) {
                    System.out.println("not proper roll");
                    startPostion = startPostion - dice;
                } else {
                    System.out.println("it's a ladder");
                    System.out.println("the roll is " + dice + " current position is " + startPostion);
                }
                break;
            case 3:
                startPostion = startPostion - dice;

                if (startPostion <= 0) {
                    startPostion = 0;
                } else {
                    System.out.println("it's a snake");
                    System.out.println("the roll is " + dice + " current position is " + startPostion);
                }
                break;
        }
            return startPostion;
    }
}
