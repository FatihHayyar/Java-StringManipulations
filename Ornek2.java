package day08StringManupulatins;

public class Ornek2 {
    public static void main(String[] args) {
        //asagidaki sadece hayvan isimlerini ekrana yazdirin.
        //ben kedi, esim kopek. oglum inek sever.
        String cumle="ben kedi, esim kopek. oglum sever inek";
        String kedi= cumle.substring(4,8);
        String kopek= cumle.substring(15,20);
        String inek= cumle.substring(34);
        System.out.println("hayvanlar= "+kedi+" "+kopek+" "+inek);



    }
}
