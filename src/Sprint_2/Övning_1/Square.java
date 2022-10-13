package Sprint_2.Övning_1;

public class Square implements Figure {

    private double length;
    private double width;

    public Square(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getCircumference() {
        return this.length * 2 + this.width * 2;
    }
}