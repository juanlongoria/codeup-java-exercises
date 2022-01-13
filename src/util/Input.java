package util;

import java.util.Scanner;


public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter Input");
        String userResponse = scanner.nextLine();
        System.out.printf("You entered: %s", userResponse);
        return userResponse;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userResponse = scanner.nextLine();
        System.out.printf("You have entered: %s", userResponse);
        return userResponse;
    }


    public boolean yesNo() {
        System.out.println("Continue?");
        String userResponse = scanner.nextLine();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a whole number between %d and %d. \n", min, max);
        int userNum = scanner.nextInt();
        if (userNum > max || userNum < min) {
            return getInt(min, max);
        }
        return userNum;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userNum = scanner.nextInt();
        if (userNum > max || userNum < min) {
            return getInt(min, max);
        }
        return userNum;
    }

    public int getInt() {
        String userInput = getString("Please enter a whole number.");
//        System.out.println("Please enter a whole number.");
        int userNum;
        try{
            userNum = Integer.valueOf(userInput);
        }catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return getInt();
        }
//        int userNum = scanner.nextInt();
        System.out.printf("You chose %d", userNum);
        return userNum;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number between %f and %f. \n", min, max);
        double userNum = scanner.nextDouble();
        if (userNum > max || userNum < min) {
            return getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userNum = scanner.nextDouble();
        if (userNum > max || userNum < min) {
            return getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble() {
        System.out.println("Please enter a number.");
        double userNum = scanner.nextDouble();
        System.out.printf("You chose: %f", userNum);
        return userNum;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userNum = scanner.nextDouble();
        System.out.printf("You chose: %f", userNum);
        return userNum;
    }

    public long convertHexToDecimal() {
        String userInput = getString("Please enter a hexadecimal number.");
        long userNum;
        try {
            userNum = Long.valueOf(userInput, 16);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();

        }
        return convertHexToDecimal();
    }

}
