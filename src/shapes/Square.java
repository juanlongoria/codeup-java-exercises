package shapes;


    public class Square extends Quadrilateral {
        private int side;


     public Square(int side) {
                this.side = side;
                this.length = side;
                this.width = side;
            }

            @Override
            public double getPerimeter() {
                return 4 * side;
            }

            @Override
            public double getArea() {
//                System.out.println("This is a square.");
//                return Math.pow(super.length, 2);
                return Math.pow(side, 2);
            }

//            public double getPerimeter() {
//                System.out.println("This is a square.");
//                return 4 * super.length;
                @Override
                public void setLength(int length) {
                    setSide(length);
                }

                @Override
                public void setWidth(int width) {
                    setSide(width);
                }

                public int getSide() {
                    return this.side;
                }

                public void setSide(int side) {
                    this.side = side;
                    this.length = side;
                    this.width = side;
                }
            }
//public class Square extends Quadrilateral{
////        public Square(float side) {
////            super(side, side);
////        }
////
////        public float getArea() {
////            return 4 * this.length;
////        }
////
////        public float getPerimeter() {
////            return (float) Math.pow(this.length, 2);
////        }
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea() {
//        System.out.println("This is a square.");
//        return Math.pow(super.length, 2);
//    }
//
//    public double getPerimeter() {
//        System.out.println("This is a square.");
//        return 4 * super.length;
//    }
//}