package LAB2;

import java.util.Scanner;

public class Exercise_STD_Profile {

    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.print("Name: ");
        String A = name.nextLine();

        Scanner id = new Scanner(System.in);
        System.out.print("STD_ID: ");
        String B = id.nextLine();

        Scanner age = new Scanner(System.in);
        System.out.print("Age: ");
        int E = Integer.parseInt(age.nextLine());

        Scanner tall = new Scanner(System.in);
        System.out.print("Tall: ");
        String C = tall.nextLine();

        Scanner email= new Scanner(System.in);
        System.out.print("Email: ");
        String D = email.nextLine();




    }
}
