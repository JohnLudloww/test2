import java.util.Scanner;

public class Controlstatements {
    public static void main(String[] args)
    {
        String input = String.join(",", args);
        String user1 = "user";
        String admin = "admin";
        if (input.contains(user1) && input.contains(admin))
        {
            System.out.println("Please enter one");
        }
        else if (input.contains(admin)){
            System.out.println("admin account");
        }
        else if (input.contains(user1))
        {
            System.out.println("user account");
        }

        switch(user1) {
            case "user":
                System.out.println("hi guest");
                break;
            case "buyer":
                System.out.println("Hi buyer");
                break;
            default:
                System.out.println("Must choose one");
        }

        //Without break statement so all the terms run even default.
        switch(user1) {
            case "user":
                System.out.println("hi guest");
            case "buyer":
                System.out.println("Hi buyer");
            default:
                System.out.println("Must choose one");
        }


        //switch test
        System.out.println("please enter a action: ");
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();
        switch(info){
            case "login":
                System.out.println("please enter username: ");
                break;
            case "sign up":
                System.out.println("Please create an account");
                break;
            case "close":
                System.out.println("Closing the program");
                break;
            case "about":
                System.out.println("This app was created in 2023");
                break;
            default:
                System.out.println("Please enter a value: login, sign up, close or about.");
        }




    }
}