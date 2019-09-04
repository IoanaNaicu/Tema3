public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle0 = new Circle();
        System.out.println("Circle0 radius is: " + myCircle0.getRadius());
        double myArea0 = myCircle0.getArea(myCircle0.getRadius());
        System.out.println("Circle0 area is: " + myArea0);

        Circle myCircle1 = new Circle(4, "yellow");
        System.out.println("Circle1 radius is: " + myCircle1.getRadius());
        double myArea1 = myCircle1.getArea(myCircle1.getRadius());
        System.out.println("Circle1 area is: " + myArea1);  //afisat Circle1 area folosind o variabila myArea1

        Circle myCircle2 = new Circle(5);
        System.out.println("Circle2 radius is: " + myCircle2.getRadius());
        System.out.println("Circle2 area is: " + myCircle2.getArea(myCircle2.getRadius()));  //afisat Circle2 area fara a retine valoarea intr-o variabila

        /*
        Circle myCircle3 = new Circle();
        myCircle3.setRadius(6);
        System.out.println("Circle3 radius is: " + myCircle3.getRadius());
        System.out.println("Circle3 area is: " + myCircle3.getArea(myCircle3.getRadius()));
        */


    }
}
