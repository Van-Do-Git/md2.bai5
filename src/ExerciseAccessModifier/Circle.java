package ExerciseAccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    private double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public static void main(String[] args) {
        Circle cir1 = new Circle(2, "Blue");
        Circle cir2 = new Circle();
        System.out.println(cir1.getRadius());
        System.out.println(cir2.getRadius());
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle cir1 = new Circle(2, "Blue");
        Circle cir2 = new Circle();
//        System.out.println(cir1.getRadius());
//        System.out.println(cir2.getRadius());
    }
}

