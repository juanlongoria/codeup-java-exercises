package shapes;

//import BirdHaven.Bird;
import util.Input;

public class CircleApp {
//    public static void main(String[] args) {
public static void circleCreator() {
    Input in = new Input();
    int count = 0;
    do {
        Circle circle = new Circle(in.getDouble("Enter radius"));
//        Circle c1 = new Circle(4);
        System.out.printf("The area of a circle with a radius value of %f is: %f\n", circle.getRadius(), circle.getArea());
        System.out.printf("Radius of a circle with radius value of is %f is %f: %f", circle.getRadius(), circle.getCircumference()); count++;
        System.out.println(count + " circle(s) made.");
    } while (in.yesNo("Would you like to create another circle?"));
}

//    public static void circleCreator() {
    //        Input in = new Input();
    //        Circle.count += 1;
    //        Circle circle = new Circle(in.getDouble("Please enter in the radius for a circle."));
    //        System.out.printf("The area of a circle with a radius value of %f is: %f\n", circle.getRadius(), circle.getArea());
    //        System.out.printf("The circumference of a circle with a radius value of %f is: %f\n", circle.getRadius(), circle.getCircumference());
    //        System.out.println(Circle.count + " circle(s) made.");
    //
    //        if(in.yesNo()) {
    //            circleCreator();
    //        } else {
    //            return;
    //        }
    //    }


    public static void main(String[] args) {
        Circle c1 = new Circle(4);

        System.out.println(c1.getArea());

        System.out.println(c1.getCircumference());
        circleCreator();
    }

//    public double getCircumference() {
//
//    }

}
