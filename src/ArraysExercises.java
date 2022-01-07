import java.util.Arrays;


//1.
public class ArraysExercises {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        //will not print without arrays.toString

        public static Person[] people = {
                new Person("Sam"),
                new Person("Sammy"),
                new Person("Samuel")
        };

        public static Person person1 = new Person("SamIam");


        public static Person[] addPerson(Person[] people, Person person) {
            Person[] fourPeople = Arrays.copyOf(people, people.length + 1);
            fourPeople[people.length] = person;
            return fourPeople;
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(numbers));

            for (Person person : people) {
                System.out.println(person.getName());
            }

            for (Person person : addPerson(people, person1)) {
                System.out.println(person.getName());
            }

    }
}
