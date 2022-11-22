package day08StringManupulatins;

public class Example07 {
    public static void main(String[] args) {
        //bir String deki noktalama isaretlerinin karakter sayisini girin
        String cumle="Sen aga, ben aga. kim cikar daga?";
        int sayi=cumle.replaceAll("[^\\p{Punct}]","").length();

        System.out.println("sayi = " + sayi);





    }
}
