public class TestRobot {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println("Robot's initial position is: " + robot1.x);
        robot1.changePos(8);
        robot1.getPos();
        robot1.changePos(2);
        robot1.getPos();


    }
}
