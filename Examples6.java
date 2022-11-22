package day08StringManupulatins;

public class Examples6 {
    public static void main(String[] args) {
        //sifre kontrolu
       //    i)Space haric en az sekiz karakter olmali
//           ii)En az 1 sembol icermeli
//           iii)En az 1 rakam icermeli
//           iv)En az 1 buyuk harf icermeli
//           v)En az 1 kucuk harf icermeli
String psw="Gof70214*";
boolean first=psw.replace(" ","").length()>7;
boolean second=psw.replaceAll("[a-zA-Z0-9]","").length()>0;
boolean third=psw.replaceAll("[^0-9]","").length()>0;
boolean vierd=psw.replaceAll("[^A-Z]","").length()>0;
boolean fift=psw.replaceAll("[^a-z]","").length()>0;

        boolean gecerli=fift&&second&&third&&vierd&&first;
        if (gecerli){
            System.out.println("sifre gecerli");
        }else{
            System.out.println("sifreyi kurallara uygun girin");
        }




    }
}
