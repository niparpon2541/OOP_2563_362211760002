package HomeWork;

import java.util.Scanner;

public class hw_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_of_fail = 0;

        while(count_of_fail<3){
            System.out.print("Username : ");
            String usr = scanner.nextLine();

            System.out.print("Password : ");
            String pwd = scanner.nextLine();
            if(usr.equals("admin") && pwd.equals("saiyai"))
            {
                System.out.println("Welcome to MT Website.");
                break;
            }
            else {
                System.out.println("username or password not correct." );
                count_of_fail++;
            }
            if(count_of_fail==3)
            {
                System.out.println("You account has been locked.Please, contect admin.");
            }
        }//while


    }
}
