package Package1;

import java.util.Scanner;

public class HastaneRunner {
    public static void main(String[] args) {
        runner();

    }

    static Scanner scan=new Scanner(System.in);

    public static void runner (){

        System.out.println("Hasta ad ve soyadını sırasıyla giriniz veya sistemi kapatmak için 0'a basınız");


        String isim= scan.nextLine();
        System.out.println("");

        if(isim.equalsIgnoreCase("0")){
            System.out.println("Güle güle");
        }

        else{



            String soyIsim = scan.nextLine();
            System.out.println("");



            Hastane.Secimekranı();


            try {
                int islem = scan.nextInt();

                switch (islem) {

                    case 1:
                        Hastane.Hastagirisi(isim, soyIsim, "Kan kaybı");
                        System.out.println("\n".repeat(5));
                        runner();

                    case 2:
                        Hastane.Hastagirisi(isim, soyIsim, "Kalp krizi");
                        System.out.println("\n".repeat(5));
                        runner();

                    case 3:
                        Hastane.Hastagirisi(isim, soyIsim, "Dahiliye muayene");
                        System.out.println("\n".repeat(5));
                        runner();


                    case 4:
                        Hastane.Hastagirisi(isim, soyIsim, "Ortopedi muayene");
                        System.out.println("\n".repeat(5));
                        runner();
                    case 5:
                        Hastane.Hastagirisi(isim, soyIsim, "Beyin kanaması riski");
                        System.out.println("\n".repeat(5));
                        runner();
                    case 6:
                        Hastane.Hastagirisi(isim, soyIsim, "Alerji");
                        System.out.println("\n".repeat(5));
                        runner();
                    default:
                        System.out.println("Hatalı giriş");
                        Hastane.Secimekranı();


                }
            } catch (Exception e) {
                String islem= scan.nextLine();
                System.out.println(islem+ " girişi geçersizdir");
                runner();
            }
        }
    }
}
