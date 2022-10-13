package Sprint_2.Övning_1;

public class Triangle implements Figure {
    private double bas;
    private double höjd;

    public Triangle(double bas, double höjd) {
        this.bas = bas;
        this.höjd = höjd;
    }

    public double getBas() {
        return bas;
    }

    public void setBas(double bas) {
        this.bas = bas;
    }

    public double getHöjd() {
        return höjd;
    }

    public void setHöjd(double höjd) {
        this.höjd = höjd;
    }

    @Override
    public double getArea() {
        return this.bas * this.höjd / 2;
    }

    @Override
    public double getCircumference() {
        return this.bas * 3;
    }
}