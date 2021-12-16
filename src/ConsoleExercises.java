import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        int pi =3.14;
        System.out.format("The value of pi is approximately %.2f", pi);
//        System.out.printf("The value of pi is approximately %.2f", pi);

        System.out.println("Enter an integer.");

        Scanner sc = new Scanner(System.in);

        sc= sc.useDelimiter("\n");

        int userNumber = sc.nextInt();
        System.out.println(userNumber);

        //2.
        System.out.println("Please enter three words.");
        String userWord = sc.next();
        String userWord2 = sc.next();
        String userWord3 = sc.next();
        System.out.printf("The three words you entered are: %n%s, %n%s, %n%s", userWord,userWord2, userWord3);

        //3. //4.
//        System.out.println("Enter a sentence.");
//        String storeSentenceInput = sc.next();
//        System.out.format("Here is your sentence: \n%s", storeSentenceInput);

        System.out.println("Enter a sentence.");
        sc.nextLine();
        String storeSentenceInput = sc.nextLine();

        System.out.format("Here is your sentence: \n%s", storeSentenceInput);

        //1.
        //Codeup Area
        System.out.println("Please enter width.");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Enter length.");
        double length = Double.parseDouble(sc.nextLine());
        double area = width * length;
        double perimeter = (width * 2) + (length * 2);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);














    }
}
