package Office_programme;

public class Dev_team extends Employee {

    String designation;
    int no_of_project;

    int project(int np, int com) {
        return np - com;
    }

    void print(String a, String s, String ss, int b) {
        System.out.println("Name = " + a);
        System.out.println("ID = " + s);
        System.out.println("Designation = " + ss);
        System.out.println("Number of project = " + b);
    }
}
