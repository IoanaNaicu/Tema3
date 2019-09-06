public class Bonus1 {

    private static String contract[] = {"id", "Numele", "Initiala tatalui", "Anul nasterii", "E-mail", "Limbaj de programare"};
    private static int i;

    public String getContract(String[] myString, int i) {
         return myString[i-1];
    }

    public void print0(String[] myCsv, int pos) {
        String contract1 = getContract(contract, pos);

        if (pos < 1 || pos > 6  ) {
            System.out.println("Ai introdus o pozitie gresita");
        } else {
            System.out.println(contract1 + ": " + myCsv[pos-1]);
        }

    }

//    public void print(String[] mystring1, String[] mystring2, int x) {
//        if (x < 1 || x > 6  ) {
//            System.out.println("Ai introdus o pozitie gresita");
//        } else {
//            System.out.println(mystring2[x - 1] + ": " + mystring1[x - 1]);
//        }
//    }


    public void print2(String[] myString1, String valoare) {
        for (int i = 0; i <contract.length; i++) {
            if (contract[i].equals(valoare)) {
                System.out.println(myString1[i]);

            }
        }
    }

//    public void print2(String[] myString1, String[] myString2, String valoare) {
//        for (int i = 0; i < myString2.length; i++) {
//            if (myString2[i].equals(valoare)) {
//                System.out.println(myString1[i]);
//
//            }
////            else {
////                System.out.println("Ai introdus o valoare gresita");    // am vrut sa pun un else, ca la o valoare introdusa care nu se regaseste in lista sa afiseze un mesaj (1 singura data)si sa iasa
////                                                                        // daca pun else-ul aici imi afiseaza "Ai introdus o valoare gresita" de atatea ori cate valori au ramas lui i (de 5 ori)
////
////            }
//        }
//    }
}