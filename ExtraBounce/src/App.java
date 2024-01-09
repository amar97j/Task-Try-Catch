import java.util.Scanner;

public class App {

    private static final String userNameC = "CODED";
    private static final String passWordC = "CODED123";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int attemptMax = 5;

        for (int attempt = 1; attempt <= attemptMax; attempt++) {

            try {
                // Take user name
                System.out.println("Please Enter Username:   ");
                String username = scanner.nextLine();

                // Take password
                System.out.println("Please Enter Password:   ");
                String password = scanner.nextLine();

                // using if condition to authenticate
                if (authenticationUser(username, password)) {
                    System.out.println("Successfully loged in   ");

                    return;

                } else {
                    throw new Exception("Invalid credintials " + attempt + "/" + attemptMax);

                }
            } catch (Exception e) {
                System.out.println("You have reached the max number of attempts       " + e.getMessage());
            }

            // finally {
            // scanner.close();
            // }

        }

    }

    private static boolean authenticationUser(String username, String password) {

        return username.equals(userNameC) && password.equals(passWordC);
    }
}
