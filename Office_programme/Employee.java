package Office_programme;

public class Employee {

    String ID;
    String name;
    String adress;
    int salary;

    void Salary(int s, int com) {
        System.out.println("Salary = " + (s + com));
    }

    void print(String a, String s, String ss) {
        System.out.println("ID = " + a);
        System.out.println("Name = " + s);
        System.out.println("adress = " + ss);
    }
}
