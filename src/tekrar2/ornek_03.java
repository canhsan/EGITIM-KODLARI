package tekrar2;

import java.util.Scanner;

public class ornek_03 {
    public static void main(String[] args) {

        /*Kullanicidan gunun ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        zamani” yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String haftaninGunu = scan.next().toLowerCase();

        if (haftaninGunu.equals("pazartesi")) {
            System.out.println("Şimdi calişma zamanı tatile 5 gün var");
        } else if (haftaninGunu.equals("salı")) {
            System.out.println("Şimdi calişma zamanı tatile 4 gün var");
        } else if (haftaninGunu.equals("çarşamba")) {
            System.out.println("Şimdi calişma zamanı tatile 3 gün var");
        } else if (haftaninGunu.equals("perşembe")) {
            System.out.println("Şimdi calişma zamanı tatile 2 gün var");
        } else if (haftaninGunu.equals("cuma")) {
            System.out.println("Şimdi calişma zamanı tatile 1 gün var");
        } else if (haftaninGunu.equals("cumartesi")) {
            System.out.println("Şimdi tatil zamanı");
        } else if (haftaninGunu.equals("pazar")) {
            System.out.println("Şimdi tatil zamanı");
        } else {
            System.out.println("Yanlış gün girişi yapılmıştır.");
        }
    }
}
