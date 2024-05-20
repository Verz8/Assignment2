////////////////////////////////////////////////////////////////////
// Matteo Mazzotti 2068245
// Davide Verzotto 2043679
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.print(RomanPrinter.print(i));
        }
    }
}
