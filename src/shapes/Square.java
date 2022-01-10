package shapes;

public class Square extends Rectangle{
//        public Square(float side) {
//            super(side, side);
//        }
//
//        public float getArea() {
//            return 4 * this.length;
//        }
//
//        public float getPerimeter() {
//            return (float) Math.pow(this.length, 2);
//        }

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        System.out.println("This is a square.");
        return Math.pow(super.length, 2);
    }

    public double getPerimeter() {
        System.out.println("This is a square.");
        return 4 * super.length;
    }
}
