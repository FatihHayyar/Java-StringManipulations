package day08StringManupulatins;

import java.util.Scanner;

public class Ornek09 {
    public static void main(String[] args) {
//Ornek 2: Kullanicidan tam ismini isteyin. Bosluk karakteri haric karakter sayisi 10 dan fazla ise
// "ismin cok uzun" degilse "ismin normal" yazdirin.. (ternary ile..) (edited)
        Scanner scan= new Scanner(System.in);
//        System.out.println("tam isminizi giriniz");
//        String name = scan.nextLine();
//        String sonuc = name.replaceAll(" " , "").length()>10 ? "ismin cok uzun" : "ismin normal";
//        System.out.println(sonuc);
//Ornek 3: 1) Kullanicidan tam ismini isteyin.(Tek isim ve soyisim)
//         2) Dogum yilini isteyin.
//         3) isminizin ilk 2 harfi ile baslayan, soyisminizin ilk 2 harfi ile biten
// ve icinde dogum tarihi de  bulunan bir parola olusturmasini isteyin.
//	   4)Olusan parola kurallara uygun ise "Parola gecerli" degilse
// "lutfen kurallara uygun bir parola giriniz" yazdirin.
        System.out.println("tam isminizi giriniz");
String isim= scan.nextLine();
        System.out.println("dogum tarihini giriniz");
        String dogum=scan.next();
        System.out.println("Sartlara uygun bir password giriniz");
String psw=scan.next();
boolean first=psw.startsWith(isim.substring(0,2));
boolean second=psw.endsWith(isim.split(" ")[1].substring(0,2));
boolean third=psw.contains(dogum);
if (first&&second&&third){
    System.out.println("sifre basarili");
}else {
    System.out.println("sifre basarisiz");
}

    }
}
