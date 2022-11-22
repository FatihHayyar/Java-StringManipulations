package day08StringManupulatins;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String class metodlari
        // equals() Boolean return eder
        //equalsignorecase() boolean return eder.
        // toLowerCase() String return eder
        //toUpperCase() String return eder
        //charAt() Char return eder
        //lenght() Stringteki karakteri sayar. int return eder.
        //conteins() String teki 1 veya daha fazla karakter varmi diye bakar. Boolean return eder.
        //split() Bir Stringi istedigimiz karakterden parcalamaya yarar. Sectigiiz karakteri yok eder. Array return eder.
//pasword gecerli mi kurallar
        // 1.en az 8 karakterli
        // 2. Bosluk olmasin
        //ilk harfi m veya M olmali
        // son karakteri ? olmali
String psw="m9d83j r7?";
boolean num=psw.length()>7;
boolean bosluk=!(psw.contains(" "));
boolean ilkharf=psw.charAt(0)=='m'||psw.charAt(0)=='M';
boolean soru=psw.charAt(psw.length()-1)=='?';
        System.out.println(num&&bosluk&&ilkharf&&soru ? "Sifre gecerli":"Sifre gecerli degil");







    }
}
