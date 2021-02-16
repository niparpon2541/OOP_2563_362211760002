package LAB8;

import java.util.ArrayList;
import java.util.Scanner;

public class CommpanyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employee do you have?: ");
        int num = sc.nextInt();

        ArrayList<Employee>myemp = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            //iput data to object
            System.out.println("please, enter employee info"+(i+1)+":");
            Employee c = inputDataopject();
            myemp.add(c);

        }
        //display data in ArrayList
        displayOpject (myemp);

    }//main

    private static void displayOpject(ArrayList<Employee> myemp) {
        System.out.println("All objects in ArrayList: ");
        for (Employee c:myemp){
            System.out.println(c.toString());

        }
    }

    private static Employee inputDataopject() {
        Scanner sc = new Scanner(System.in);

        Employee c = new Employee();
        System.out.print("Enter id card: ");
        String id = sc.nextLine();
        c.setPid(id);

        System.out.print("Enter name: ");
        c.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        c.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter Gender: ");
        c.setGender(sc.nextLine());

        System.out.print("Enter tel: ");
        c.setTel(sc.nextLine());

        return c;
    }
}
