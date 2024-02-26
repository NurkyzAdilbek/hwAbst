public class Quadrat extends Shape{

    double a;

    public Quadrat(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return Math.pow(a,2);
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "a=" + a +
                '}';
    }
}
