package day08StringManupulatins;

public class StrinManipulations02 {
    public static void main(String[] args) {
        //Ali okula gitti. Bosluklari silin. kac karakter kaldigini goster..
        String cumle="Ali okula gitti.";
        int sayi=cumle.replace(" ","").length();
        System.out.println("sayi = " + sayi);

// raplace metodu : String deki karakter veya karakterleri degistirir.
          /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
    \\S   ==> space disindaki hersey  */

    }
}
