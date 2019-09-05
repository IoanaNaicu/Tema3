public class Bonus {

    public void print(String[] mystring1, String[] mystring2, int x) {
        System.out.println(mystring2[x-1] + ": " + mystring1[x-1]);
    }

    public void print2(String[] myString1, String[] myString2, String myString, int x){
        if (myString2[x] == myString) {
            System.out.println(myString1[x]);
       }
        else {
            System.out.println("nu ai introdus o valoare din contract corecta");
        }
    }
}
