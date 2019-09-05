import java.util.Scanner;

public class BonusMain {
    public static void main(String[] args) {

        String myCsvString = "1,Ana,V,1994,ana@gmail.com,Java";

        String[] myCsvStringArray = myCsvString.split(",");

        String contract[] = {"id", "Numele", "Initiala tatalui", "Anul nasterii", "e-mail", "Limbaj de programare"};

        System.out.println("Introdu o pozitie intre 1 si 6: ");
        Scanner in = new Scanner(System.in);
        int myPos = in.nextInt();

        Bonus bonus = new Bonus();
        bonus.print(myCsvStringArray, contract, myPos );


        System.out.println("Introdu o valoare din contract: ");
        Scanner sc = new Scanner(System.in);
        String myValue= sc.nextLine();
        bonus.print2(myCsvStringArray, contract, myValue, 0);

//        if (myString2[x] == myString) {
//            System.out.println(myString1[x]);
//        }

//        if (contract[0] == "id") {
//            System.out.println(myCsvStringArray[0]);
//        }




    }
}
