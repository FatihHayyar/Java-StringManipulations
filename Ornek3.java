package day08StringManupulatins;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        //kullanicidan alinan isim ve soyisimden ekrana ilk ve soy ismin ilk harfini yazdir.

        Scanner unit=new Scanner(System.in);
        System.out.println("tam isminizi girin");
        String tamisim =unit.nextLine();
String ilkharf=tamisim.substring(0,1);
String soyilkharf=tamisim.split(" ")[1].substring(0,1);
        System.out.println(ilkharf+soyilkharf);


    }
}
