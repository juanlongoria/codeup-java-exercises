import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args) {
        String firstName = "Juan";
        String lastName = "Longoria";
        double pi = 3.14159;
        int myFavoriteNumber = 8;

        System.out.printf("Hello, my name is %s, %s. %n The value of pi is: %d", lastName, firstName, myFavoriteNumber);
//   %n creates a new line in a print
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite color?");
        String userInput = scanner.nextLine();
        //or just next for one word line
        System.out.printf("Your favorite color is: %s", userInput);
        System.out.println(userInput);

    }
}
