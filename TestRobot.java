public class TestRobot {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println("Robot' initial position is: " + robot1.x);
        robot1.changePos(0);
        robot1.getPos();

    }
}
