import java.util.Random;

public class Main {
    public static void main(String[] args) {


        System.out.println(" welcome to Snake and Ladder game");

        int startPostion=0;
        int numOfRoles=0;
        int totalScore=0;
            do {
            Random number = new Random();
            int dice = 1 + number.nextInt(6);
            numOfRoles++;
            totalScore += play(startPostion, dice);
        }while (totalScore<=100);
        System.out.println("no of roles to win "+ numOfRoles);
    }
    public static int play( int startPostion, int dice) {
         Double random1 = Math.floor(Math.random()*1000 % 3);
//        Random number1 = new Random();
//        int random1 = number1.nextInt(4);
        if (random1 == 0) {
            System.out.println("No Play");
            return 0;
        } else if (random1 == 1) {
            startPostion = startPostion + dice;
            System.out.println("ladder");
            return startPostion;
        } else if (random1 == 2) {
            if (startPostion <= 0) {
                return startPostion ;
            } else {
                startPostion = startPostion - dice;
                System.out.println("Snake");
                return startPostion;
            }
        } else {
                return startPostion;
        }
    }

}