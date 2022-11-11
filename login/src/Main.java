import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        userName = input.nextLine();
        System.out.println("Please enter your password: ");
        password = input.nextLine();

        if (userName.equals("Username") && password.equals("password")) {
            System.out.println("Success :)");
        } else {
            System.out.println("Try Again !!!");

            int select;

            System.out.println("Forget password ? \n 1- Change password \n 2- No");
            select = input.nextInt();
            switch (select) {
                case 1:
                    String newPassword;
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter your new password: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.println("Old password can not to be new password !!");
                    } else {
                        System.out.println("Congrulations you can acsess platform with your new password :)");
                    }
                    break;
                case 2:
                    System.out.println("Try again your password correctly.");
            }


        }
    }
}