import java.util.Scanner;

public class MethodsExercises {


    //1.
    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int getDifference(int num1, int num2) {
        return num1 - num2;
    }

    public static int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    //using recursion


    public static int getDivision(int num1, int num2) {
        return num1 / num2;
    }

    public static int getModulus(int num1, int num2) {
        return num1 % num2;
    }

    //2.
    public static int getInteger(int min, int max) {
//        Boolean confirmation = true;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("Enter a number between 1 and 10: ");
        int number = sc.nextInt();

        if (number < min || number > max) {
            System.out.println("Try again, should be between 1-10");
            return getInteger(min, max);
        }
        return number;
    }

public static void factorial() {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        int num = getInteger(1, 10);
    String willContinue;
    do {
        long userFactorial = 1;
        int num = getInteger(1, 10);
        System.out.printf("You chose %d!\n", num);
        for (int i = 1; i <= num; i++) {
            userFactorial *= i;
        }
            System.out.println(userFactorial);
            System.out.println("Would you like to continue? (yes/no");
            willContinue = sc.nextLine();
        } while (willContinue.equalsIgnoreCase("yes")) ;
    }

//    System.out.println("Enter a number");
//    System.out.println(showFactoral();


    public static void rollDice(int num) {
        int dice1 = (int) (Math.random() * (num - 1) + 1);
        int dice2 = (int) (Math.random() * (num - 1) + 1);
        System.out.printf("Dice 1 rolled %d, Dice 2 rolled %d%n", dice1, dice2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSum(3,5));
        System.out.println(getDifference(5,7));
        System.out.println(getMultiplication(8,9));
        System.out.println(getDivision(9,3));
        System.out.println(getModulus(10,3));

//        getInteger(1, 10);

        factorial();

        boolean confirm = true;
        while (confirm) {
            System.out.println("How many sides?");
            int sides = sc.nextInt();
            rollDice(sides);
            System.out.println("Would you like to go again? (yes/no)");
            String userConfirm = sc.next();
            confirm = userConfirm.equalsIgnoreCase("yes");
        }



    }
}
