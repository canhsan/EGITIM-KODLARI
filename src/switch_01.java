import java.util.Scanner;

public class switch_01 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir rakam alip, rakami yaziyla yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam = scan.nextInt();

        switch (rakam) {
            case 0:
                System.out.println("Girdiğiniz rakam: Sıfırdır");
                break;
            case 1:
                System.out.println("Girdiğiniz rakam: birdir");
                break;
            case 2:
                System.out.println("Girdiğiniz rakam: ikidir");
            case 3:
                System.out.println("Girdiğiniz rakam: üçtür");
                break;
            case 4:
                System.out.println("Girdiğiniz rakam: dörttür");
                break;
            case 5:
                System.out.println("Girdiğiniz rakam: beştir");
                break;
            case 6:
                System.out.println("Girdiğiniz rakam: 'altıdır'");
                break;
            case 7:
                System.out.println("Girdiğiniz rakam: yedidir");
                break;
            case 8:
                System.out.println("Girdiğiniz rakam: sekizdir");
                break;
            case 9:
                System.out.println("Girdiğiniz rakam: dokuzdur");
                break;
            default:
                System.out.println("Girilen sayı bir rakam değildir");
        }
    }
}
