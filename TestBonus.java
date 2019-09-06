import java.util.Scanner;

public class TestBonus {
    public static void main(String[] args) {

        String myCsvString = "1,Ana,V,1994,ana@gmail.com,Java";
        String contract[] = {"id", "Numele", "Initiala tatalui", "Anul nasterii", "E-mail", "Limbaj de programare"};

        String[] myCsvStringArray = myCsvString.split(",");

        System.out.println("Introdu o pozitie intre 1 si 6: ");
        Scanner in = new Scanner(System.in);
        int myPos = in.nextInt();

        Bonus bonus = new Bonus();
        bonus.print(myCsvStringArray, contract, myPos);

        System.out.println("Introdu o valoare din contract (id, Numele, Initiala tatalui, Anul nasterii, E-mail sau Limbaj de programare): ");
        Scanner sc = new Scanner(System.in);
        String myValue= sc.nextLine();
        bonus.print2(myCsvStringArray, contract, myValue);

    }
}