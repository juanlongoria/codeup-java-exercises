package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral() {
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}
//public abstract class Quadrilateral extends Shape implements Measurable {
//    protected int length;
//    protected int width;
//
//    public Quadrilateral(int length, int width) {
//        this.length =  length;
//        this.width =  width;
//    }
//
//    public int getlength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public abstract void setLength();
//
//    public abstract void setWidth();
//}
