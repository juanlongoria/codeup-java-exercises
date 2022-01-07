import java.util.Scanner;

public class Warmups {

    public class Penguin {
        String name;
        int age;
        int species;
        int weight;
        int sex;
    }


    //01/06
//    Warmup
//    Create a class named "Penguin"
//    Give your class the following private fields
//            Name
//    Weight
//            Species
//    Sex
//    Give your class the following public methods
//            getName
//    getWeight
//            getSpecies
//    getSex
//            setName
//    setWeight
//            setSpecies
//    setSex
//    Give your class a constructor method
//            Give your class the following public static methods
//    canFly (returns false)
//    areEvil (returns true)

    //01/04
    public static String startDay() {
        return "\nBrain Loading... Done!";
    }


    //12/15
    public static void main(String[] args) {
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");


        //12/16
        System.out.println("What did you have for breakfast?");

        Scanner scanner = new Scanner(System.in);
        String userBreakfast = scanner.nextLine();
        //or just next for one word line
        System.out.printf("I had %s for breakfast", userBreakfast);
//        System.out.println(userBreakfast);


//        //01/04
//
//        String startDay = "\nBrain loading....Done!";
//
//        System.out.println(startDay);

        System.out.println(startDay());



    }
}
