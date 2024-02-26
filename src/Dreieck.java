public class Dreieck extends Shape{
    double a;
    double b;
    double c;

    public Dreieck(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
       return  a+b+c;
    }

    @Override
    public String toString() {
        return "Dreieck{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
