import java.util.Scanner;

public class App {

    private static final String userNameC = "CODED";
    private static final String passWordC = "CODED123";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

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
            } else {
                System.out.println("Invalid username or password  ");
            }
        } catch (Exception e) {
            System.out.println("ERROR   ");
        } finally {
            scanner.close();
        }

    }

    private static boolean authenticationUser(String username, String password) {

        return username.equals(userNameC) && password.equals(passWordC);
    }
}
