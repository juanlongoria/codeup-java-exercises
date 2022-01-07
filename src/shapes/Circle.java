package shapes;

public class Circle {
    private double radius;
    public static int count = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
        public double getCircumference() {
            return 2* Math.PI * radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;

    }
}
