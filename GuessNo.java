import java.util.Random;
import java.util.Scanner;

public class GuessNo {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Numarul random cred ca este: ");
        int myNumber = myInput.nextInt();

        // System.out.println("Numarul introdus de utilizator este: " + myNumber);

        Random rand = new Random();
        int randomNumber = rand.nextInt(10);     //am dat o limita pentru a nu genera numere prea mari
        System.out.println("Numarul random este:" + randomNumber);

        int nrIncercari = 4;  //prima incercare si 3 reluari


        for (int i = 0; i < nrIncercari; i++) {
            if (myNumber == randomNumber) {
                System.out.println("Ai castigat");
                break;
            } else if (myNumber > randomNumber) {
                if (i == nrIncercari-1) {
                    System.out.println("ai pierdut");
                } else {
                    System.out.println("Gresit, nr introdus e prea mare");
                    System.out.println("Introdu alt numar: ");
                    myNumber = myInput.nextInt();
                }

            } else if (myNumber < randomNumber) {
                if (i == nrIncercari-1) {
                    System.out.println("ai pierdut");
                } else {
                    System.out.println("Gresit, nr introdus e prea mic");
                    System.out.println("Introdu alt numar: ");
                    myNumber = myInput.nextInt();
                }

            }

        }


    }

}
