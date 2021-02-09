package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

        //use default constructor
        Employee emp1 = new Employee();
        //assign constructor
        Employee emp2 = new Employee("niparpon namphuang",22,"Student",15000);

        //call displayData()
        emp1.displayData();
        emp2.displayData();

        //System.out.println(emp2.name);

        //assign data to enp1
        emp1.setName("bew");
        emp1.setAge(22);
        emp1.setPosition("Dean");
        emp1.setSalary(50000);

        emp1.displayData();
        System.out.println("Emp name: "+emp1.getName());

    }//main
}//class
