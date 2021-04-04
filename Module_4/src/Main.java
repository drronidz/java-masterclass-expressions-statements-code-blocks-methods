public class Main {
    public static void main(String[] args) {
        // In the following code that I will type below, write down what parts of the code
        // are expressions.

        int score = 100;
        if(score > 99) {
            System.out.println("You got the high score ");
        }


        int variableValue = 50;

        if(variableValue == 50) {
            System.out.println("Printed");
        }

        variableValue++;
        variableValue--;

        System.out.println("This is a test");
        System.out.println("This is " +
                "anouter " +
                "still more");
        int newVariable = 50;variableValue--;System.out.println("This is another one");

        // Code blocks  & If and Else control Statements

        boolean gameOver = true;
        score = 800;

        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else  if(score<1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // Print out a second score on the screen with following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sur the first printout above still displays as well

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
