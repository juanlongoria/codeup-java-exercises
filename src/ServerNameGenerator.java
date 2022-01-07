import java.util.Random;

public class ServerNameGenerator {

    static String[] adjectives = {"adorable", "ashamed", "awful", "adventurous", "aggressive", "average", "bad", "bewildered", "fabulous", "beautiful"};
    static String[] nouns = {"ship", "cat", "dog", "hero", "monkey", "baby", "tree", "coffee", "bird", "time"};




    public static String randomElement(String[] array) {
        Random rand = new Random();
        int upper = array.length;
        int random = rand.nextInt(upper);

        return array[random];


    }

    public static void main(String[] args) {

        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

    }





}
