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

        // Methods

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position
        // in the high score table
        // You should display the players name along name with a message like
        // "managed to get into position" and the position they got and a further message
        // " on the high score table "
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >1000
        // 2 if the score is >500 & <1000
        // 3 if the score is >100 & <500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 & 50

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tom",highScorePosition);


    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void calculateScoreProcedure(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScoreFunction(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + "managed to get into position"
        + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore >= 500) {
//            return 2;
//        } else if(playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4;

        if(playerScore >= 1000){
                 position = 1;
            } else if(playerScore >= 500) {
                 position = 2;
            } else if(playerScore >= 100) {
                 position = 3;
            }

        return position;
    }


}
