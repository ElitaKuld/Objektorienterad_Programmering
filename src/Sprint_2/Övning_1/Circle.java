package Sprint_2.Övning_1;

public class Circle implements Figure {

    private double radie;

    public Circle(double radie) {
        this.radie = radie;
    }

    public double getRadie() {
        return radie;
    }

    public void setRadie(double radie) {
        this.radie = radie;
    }

    @Override
    public double getArea() {
        return this.radie * this.radie * Math.PI;
    }

    @Override
    public double getCircumference() {
        return this.radie * Math.PI;
    }
}