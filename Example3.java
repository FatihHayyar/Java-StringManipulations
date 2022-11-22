package day08StringManupulatins;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //bir string eki tum a harflerini A ya cevirin.
        Scanner unit=new Scanner(System.in);
        System.out.println(" bir cumle yazin");
        String cumle= unit.nextLine();
        String yenicumle=cumle.replace("a","A");
        System.out.println("yenicumle = " + yenicumle);







    }
}
