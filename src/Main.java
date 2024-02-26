//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //public abstract double getPerimeter()
     //деген абстракт методун  Shape деген класска кошунуз.
     //Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.

Shape dreieck=new Dreieck(2.4,4,5.4);
        System.out.println(dreieck);
            System.out.println("dreieck.getPerimeter() = " + dreieck.getPerimeter());
            Shape viereck=new Viereck(2,4,6,6.7);
        System.out.println(viereck);
            System.out.println("viereck.getPerimeter() = " + viereck.getPerimeter());
            Shape circle=new Circle(2.3);
        System.out.println(circle);
            System.out.println("circle.getPerimeter() = " + circle.getPerimeter());
            Shape parallelogram=new Parallelogram(3,7);
        System.out.println(parallelogram);
            System.out.println("parallelogram.getPerimeter() = " + parallelogram.getPerimeter());
            Shape quadrat=new Quadrat(3);
        System.out.println(quadrat);
            System.out.println("quadrat.getPerimeter() = " + quadrat.getPerimeter());




    }
}