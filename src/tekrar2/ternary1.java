package tekrar2;

import java.util.Scanner;

public class ternary1 {
    /*
    Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
    “Sayi 5’in tam kati” yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi % 5 == 0 ? "Sayi 5 tam katıdır" : "Sayi 5'in tam katı değildir");

    }




}
