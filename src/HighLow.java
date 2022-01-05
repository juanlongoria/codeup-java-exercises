import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * (100- 1) + 1);
        boolean guess = false;
        do {
            int userNum = MethodsExercises.getInteger(1, 100);
            if(userNum == randomNum) {
                System.out.println("That is correct!");
                guess = true;
            } else if (userNum > randomNum) {
                System.out.println("LOWER");
            } else if (userNum < randomNum) {
                System.out.println("HIGHER");
            } else {
                System.out.println("Ooops!");
            }
        } while(!guess);

    }
}