public class Robot {
    int x;

    Robot() {
        x = 1;
    }

    public int changePos(int k) {
        while (k >= 1)
           return x = x + k;
        return x;
    }

    public void getPos() {
        System.out.println("Robot' position after move is: " + x);
    }



}
