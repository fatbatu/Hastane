package Package1;

import Package2.VeriBankasi;

import java.time.LocalDate;
import java.time.LocalTime;



public class Hastane extends VeriBankasi {
    public static void Hastagirisi(String isim, String soyisim, String sikayet){
        hastaIsimleri.add(isim);
        hastaSoyisimleri.add(soyisim);
        hastaIDleri.add(Hasta.getHastaId());
        Durum.durum(sikayet);
        LocalDate zaman= LocalDate.now();
        LocalTime saat= LocalTime.now();
        System.out.println("Kayıt tamamlandı"+"\n".repeat(3));
        if (Durum.isAciliyet()==true){
            System.out.println("ACİL VAKADIR!!");
        }
        System.out.println("Hasta bilgileri"
                +"\nİsim : "+isim
                +"\nSoyisim : "+soyisim
                +"\nHasta ID : "+Hasta.getHastaId()
                +"\nGelis Sebebi : "+sikayet);
        VeriBankasi.hangiDoktor(sikayet);
        System.out.println("Tarih : "+ zaman);
        System.out.println("Saat : "+saat.getHour()+":"+saat.getMinute());
        Hasta.setHastaId(Hasta.getHastaId()+1);
    }
    public static void Secimekranı (){
        System.out.println("Sikayetinizi tuşlayınız");
        int sayac=1;
        Hastane hastane= new Hastane();
        for (int i = 0; i <VeriBankasi.durumlar.size() ; i++) {
            System.out.println(sayac+ "- "+ VeriBankasi.durumlar.get(i));
            sayac++;}
    }
}
