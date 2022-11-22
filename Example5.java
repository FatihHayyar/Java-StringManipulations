package day08StringManupulatins;

public class Example5 {
    public static void main(String[] args) {
        //bir string deki tum sayilari "*" a cevirin
        String ogrencino="AC87459682101";
String yenisi=ogrencino.replaceAll("[0-9]","*");
        System.out.println("yenisi = " + yenisi);
//bir grup datayi ifade eden kodlara regex denir.
// tum rakamlar [0-9]
        // tum k.harfler [a-z]
//tum b.harfler [A-Z]
        // tum harfler [a-zA-Z]
        // sesli harfler [aeioAEIOUu]
// space [ ]
        // tum rakamlar ve tum harfler [0-9a-zA-Z]
        //tum noktalama isaretleri \\p{Punct}
//verilen bir Stribg de kullanilan  noktalama isareti, rakamlar
// ve space isareti haric tum karakterlerin kodunu bulan programi yazin.
// rakamlar haric tum karakterler [^0-9]
String cumle="Ali 13 yasinda; dersem inanma!...";
int yenicumle=cumle.
        replace(" ","").
        replaceAll("[0-9]","").replaceAll("\\p{Punct}","").length();
        System.out.println("yenicumle = " + yenicumle);

    }
}
