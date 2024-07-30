
/**
 *
 * @author Akash
 */
class Bowler extends Player {

    int wicket_taken;

    Bowler(String ID, String name, double points, int wicket_taken) {
        super(ID, name, points);
        this.wicket_taken = wicket_taken;
    }

    void info() {
        System.out.println("Bowler ID: " + ID + ", Name: "
                + name + ", Points: " + points + ", Wickets Taken: " + wicket_taken);
    }

    void wickets() {
        System.out.println("Taking wickets");
    }
}
