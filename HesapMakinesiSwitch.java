import java.util.Scanner;

public class HesapMakinesiSwitch {

    public static void main(String[] args) {

        int n1, n2, select, result;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println(result = n1+n2);
                break;
            case 2:
                System.out.println(result = n1-n2);
                break;
            case 3:
                System.out.println(result = n1*n2);
                break;
            case 4:
                if (n2 != 0){
                    System.out.println(result = n1/n2);
                }
                else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
        }
    }
}
