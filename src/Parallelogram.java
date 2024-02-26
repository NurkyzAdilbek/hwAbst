public class Parallelogram extends Shape{
    private double a;
    private double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "base=" + a +
                ", height=" + b +
                '}';
    }
}
