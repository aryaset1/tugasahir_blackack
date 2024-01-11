public class Main {
    public static void main(String[] args) throws Exception {


            BlackJack blackJack = new BlackJack();

        HighScore highScore = new HighScore();

        highScore.addScore("Player1", 150);
        highScore.addScore("Player2", 120);

        System.out.println("Highest Score: " + highScore.getHighestScore());
        System.out.println("Player with Highest Score: " + highScore.getNamaDenganSkorTertinggi());

        ThreeInARow threeInARow = new ThreeInARow();

        threeInARow.addWin();
        threeInARow.addWin();
        threeInARow.addWin();

        System.out.println("Streak: " + threeInARow.getStreak());
    }
}