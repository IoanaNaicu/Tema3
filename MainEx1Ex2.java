public class MainEx1Ex2 {
    public static void main(String[] args) {
        //Exercise 1
        int nr1 = 14;
        int nr2 = 25;
        int count = 0;

        for (int i = nr1; i <= nr2; i++) {
            if (MethEx1Ex2.isPrime(i) == true) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("In intervalul dat s-au gasit " + count + " numere prime");


        //Exercise 2
        int[] array = {5,15,0,89,33,200,2,50};
        MethEx1Ex2 myArray1 = new MethEx1Ex2();

        int maxNumber = myArray1.maxFromArray(array);
        System.out.println("Numarul maxim din sirul dat este: " + maxNumber);

    }
}
