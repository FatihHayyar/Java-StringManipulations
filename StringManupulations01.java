package day08StringManupulatins;

import java.util.Scanner;

public class StringManupulations01 {
    public static void main(String[] args) {
        //kullanidan alinan ismin ilk ve son harfi yazdirin
        Scanner unit=new Scanner(System.in);
        System.out.println("isminizi girin");
        String isim= unit.nextLine();
        char ilkharf=isim.charAt(0);
        char sonharf=isim.charAt(isim.length()-1);
        System.out.println("sonuc= "+ilkharf+sonharf);
//2.yol
       String ilkharf1= isim.substring(0,1);
       String sonharf1=isim.substring(isim.length()-1);
        System.out.println(ilkharf1+ sonharf1);






    }
}
