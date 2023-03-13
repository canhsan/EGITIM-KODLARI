package tekrar2;

import java.util.Scanner;

public class switch_01 {
    public static void main(String[] args) {


        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir numarası giriniz");
        int gunNumarasi = scan.nextInt();
        switch (gunNumarasi) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("Yanlış numara girişi");

        }
    }
}

