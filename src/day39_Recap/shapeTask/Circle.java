package day39_Recap.shapeTask;

public class Circle extends Shape {

    private double radius;

    public static double pi = 3.14; // beacuese of static so you can sign to the public

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double area() {
        return radius * radius*pi;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi +  '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
