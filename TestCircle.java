public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle1 = new Circle(4, "yellow");
        System.out.println("Circle1 radius is: " + myCircle1.getRadius());
        System.out.println("Circle1 area is: " + myCircle1.getArea(myCircle1.getRadius()));

        Circle myCircle2 = new Circle(5);
        System.out.println("Circle2 radius is: " + myCircle2.getRadius());
        System.out.println("Circle2 area is: " + myCircle2.getArea(myCircle2.getRadius()));

        Circle myCircle3 = new Circle();
        myCircle3.setRadius(6);
        System.out.println("Circle3 radius is: " + myCircle3.getRadius());
        System.out.println("Circle3 area is: " + myCircle3.getArea(myCircle3.getRadius()));






    }
}
