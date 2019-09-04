public class Circle {
    private double radius = 1;
    private String color = "red";

    //constructor with 2 parameters
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    //constructor with 1 parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    //contructor with no parameter
    public Circle(){

    }
 /*
    public void setRadius(double radius) {
        this.radius = radius;
    }
*/
    public double getRadius() {
        return radius;
    }

    public static double getArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }
}
