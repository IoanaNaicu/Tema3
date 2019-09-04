public class MethEx1Ex2 {
    public static boolean isPrime(int number) {

        for (int j = 2; j < number/2 ; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }


    public static int maxFromArray(int[] chars) {
        int max = chars [0];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > max) {
                max = chars[i];
            }
        }
        return max;
    }

}
