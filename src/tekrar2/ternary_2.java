package tekrar2;

import java.util.Scanner;

public class ternary_2 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        int kenar1= scan.nextInt();

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        int kenar2= scan.nextInt();

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        int kenar3= scan.nextInt();
        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 ? "üçgen çeşidi eşkenardır"
                                                                : "üçgen çeşidi eşkenar değildir");

    }
}
