package Office_programme;

public class Main {

    public static void main(String[] args) {
        Employee ob1 = new Employee();
        ob1.ID = "823";
        ob1.name = "Ahashan";
        ob1.adress = "Chattogram";
        ob1.print(ob1.ID, ob1.name, ob1.adress);
        ob1.Salary(300000, 50000);

        System.out.println("");

        Dev_team ob2 = new Dev_team();
        ob2.ID = "821";
        ob2.name = "Turjo";
        ob2.designation = "Dev team";
        ob2.no_of_project = 19;

        ob2.print(ob2.ID, ob2.name, ob2.designation, ob2.no_of_project);
        ob2.Salary(300000, 50000);

        managment ob3 = new managment();
        ob3.ID = "824";
        ob3.name = "Arsalan";
        ob3.designation = "Security";
        ob3.employee = 3;

        ob3.print(ob3.ID, ob3.name, ob3.designation, ob3.employee);
        ob3.Salary(100000, 12000);
    }
}
