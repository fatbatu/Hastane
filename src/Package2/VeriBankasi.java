package Package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeriBankasi {
    protected static List<String> doktorIsimleri=new ArrayList<>(Arrays.asList("Vahdeddin","Özge","Zeynep","Kerem","Şule","Rıdvan") );
    protected static List<String>doktorSoyisimleri=new ArrayList<>(Arrays.asList("Koç","Yılmaz","Demirel","Çelik","Turan","Coşkun"));
    protected static List<String> unvanlar=new ArrayList<>(Arrays.asList("Kardiyolog Doç. Dr.","Kardiyolog Doç. Dr.","Dahiliye Doç. Dr.","Ortopedi Doç. Dr.","Nöroloji Prof. Dr.","İmmünoloji Prof. Dr"));
    protected static List<String> hastaIsimleri=new ArrayList<>();
    protected static List<String> hastaSoyisimleri=new ArrayList<>();
    protected static List<Integer> hastaIDleri= new ArrayList<>();
    protected static ArrayList<String> durumlar=new ArrayList<String>(Arrays.asList("Kan kaybı", "Kalp krizi", "Dahiliye muayene", "Ortopedi muayene","Beyin kanaması riski","Alerji"));
    protected static ArrayList<String> ücretler=new ArrayList<String>(Arrays.asList("Sigorta tarafından karşılanmaktadır", "Sigorta tarafından karşılanmaktadır", "300 TL", "400 TL","Sigorta tarafoından karşılanmaktadır","Sigorta tarafından karşılanmaktadır"));
    public static void hangiDoktor (String sikayet){
        for (int i = 0; i <durumlar.size() ; i++) {
            if (durumlar.get(i)==sikayet){
                System.out.println("Görevli Doktor : "+unvanlar.get(i)+" "+doktorIsimleri.get(i)+" "+doktorSoyisimleri.get(i));
                System.out.println("Muayene ücreti: "+ücretler.get(i));
            }}
    }
}
