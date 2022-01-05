import java.util.Scanner;

public class Person {
    String name;
    int age;
    int weight;
    int heightInCM;

    String sayHello(){
        return String.format("Hello from %s! They hope you are well!", name);
    }

    public String toString() {
        return String.format("{%nname: %s;%nage: %d;%nweight: %d;%nheightInCM: %d;%n}", name, age, weight, heightInCM);
    }

    public String getName() {
        return name;
    }


    public static void main (String[] args) {
        Person joe = new Person();
        joe.name = "Joe";
        System.out.println(joe.sayHello());
        Person susan = new Person();
        susan.name = "Susan";
        System.out.println(susan.sayHello());
        System.out.println(joe);
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        int jim = sc.nextInt();
//        System.out.println(jim);
    }
}
