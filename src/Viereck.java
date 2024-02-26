public class Viereck extends Shape{
    double a;
    double b;
    double c;
    double d;

    public Viereck(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }

    @Override
    public String toString() {
        return "Viereck{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
