import java.util.Scanner;

//12/15
public class Warmups {
    public static void main(String[] args) {
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");


        //12/16
        System.out.println("What did you have for breakfast?");

        Scanner scanner = new Scanner(System.in);
        String userBreakfast = scanner.nextLine();
        //or just next for one word line
        System.out.printf("I had %s for breakfast", userBreakfast);
//        System.out.println(userBreakfast);


        //01/04

        String startDay = "\nBrain loading....Done!";

        System.out.println(startDay);



    }
}
