
/**
 *
 * @author Akash
 */
public class main {

    public static void main(String[] args) {
        Batsman batsman = new Batsman("Player1", "Don Bradman", 10000.5,
                50000);
        Bowler bowler = new Bowler("Player2", "Shane Warne", 75000.5, 1000);
        batsman.info();
        bowler.info();
    }
}
