package tekrar2;

import java.util.Scanner;

public class switch_test {

    //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
    //ve girilen harfin karsiligini yazdirin.
    //I : International S : Software T : Testing Q : Qualifications B: Board

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen anlamını öğrenmek istediğiniz harfi giriniz");
        char kisaltmaAnlami = scan.next().toUpperCase().charAt(0);

        switch (kisaltmaAnlami) {
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;

            default:
                System.out.println("Geçersiz harf girişi yaptınız");
        }
    }
}
