
import java.util.Locale;
import java.util.Scanner;


public class StringsLec {
    public static void main(String[] args) {
        char d ='d';
        System.out.println(d == 'd');

        Scanner sc = new Scanner(System.in);
        String favoriteSoda = "Pepsi Wild Cherry";
        System.out.println("Hey David, what is your favorite soda?");
        String userSoda = sc.nextLine();
        System.out.printf("David remembered his favorite soda, and typed it's name properly! %b", favoriteSoda.equals(userSoda));
        System.out.printf("David remembered his favorite soda: %b", favoriteSoda.equalsIgnoreCase(userSoda));

        String david = "David";
        String dad = "Dad";
        char firstLetterOfDavid = david.charAt(0);
        System.out.println("Does \"David\" and \"Dad\" start with the same letter? "
                + dad.startsWith("" + firstLetterOfDavid));

        char lastLetterOfDavid = david.charAt(david.length() -1);
        System.out.println("Does \"David\" and \"Dad\" end with the same letter?"
                + dad.endsWith("" + lastLetterOfDavid));

        // Changing casing in strings
        String scream = "AHHHHHH!!!!";
        System.out.println(scream.toLowerCase(Locale.ROOT));

        //STRING MANIPULATION
        String barney = "Barney The Dinosaur";
        System.out.printf("Location of \"The\" in string at index %d.%n",
                barney.indexOf("The"));

        String dinosaur = barney.substring(11);
        System.out.println(dinosaur);
        String the = barney.substring(7,10);
        System.out.println(the);
        System.out.println(barney.replace(dinosaur, "Plow King"));
        System.out.println(barney);

        //Trimming String
        String fluffyString = "        .         I LOVE MARSH MELLOWS         ";
        System.out.println(fluffyString.trim());

        //lastIndexOf
        String band = "Queen";
        System.out.println(band.indexOf("e"));
        System.out.println(band.lastIndexOf("e"));



    }
}
