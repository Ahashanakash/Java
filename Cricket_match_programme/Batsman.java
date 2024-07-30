
/**
 *
 * @author Akash
 */
class Batsman extends Player {

    int run;

    Batsman(String ID, String name, double points, int run) {
        super(ID, name, points);
        this.run = run;
    }

    void info() {
        System.out.println("Batsman ID: " + ID + ", Name: " + name + ", Points: "
                + points + ", Runs: " + run);
    }

    void run() {
        System.out.println("Running between the wickets");
    }
}
