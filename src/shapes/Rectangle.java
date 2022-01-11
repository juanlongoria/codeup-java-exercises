package shapes;

//public class Rectangle {
//    protected double length;
//    protected double width;
    public class Rectangle extends Quadrilateral implements Measurable{

//        public Rectangle(double length, double width) {
     public Rectangle(int length, int width) {
                this.length = length;
                this.width = width;
            }

//            public double getArea(){
//                return this.length * this.width;
                public void setLength(int length) {
                    this.length = length;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                @Override
                public double getPerimeter() {
//                    return (2 * this.length) + (2 * this.width);
                    return (length + width) * 2;
                }

                @Override
                public double getArea() {
                    return length * width;
                }
            }
//public class Rectangle extends Quadrilateral implements Measurable{
//    @Override
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    @Override
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return (length + width) * 2;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return (length + width)
//    }
////    protected double length;
////    protected double width;
//////    protected float length;
//////    protected float width;
////
////    public Rectangle(double length, double width) {
////        this.length = length;
////        this.width = width;
////    }
////
////    public double getArea(){
////        return this.length * this.width;
////    }
////
////    public double getPerimeter() {
////        return (2 * this.length) + (2 * this.width);
////    }
//}