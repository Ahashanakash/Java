package Office_programme;

public class managment extends Employee {

    String designation;
    int employee;

    int total_managge(int te, int ne) {
        return te - ne;
    }

    void print(String a, String s, String ss, int b) {
        System.out.println("ID = " + a);
        System.out.println("Name = " + s);
        System.out.println("Designation = " + ss);
        System.out.println("Employee = " + b);
    }
}
