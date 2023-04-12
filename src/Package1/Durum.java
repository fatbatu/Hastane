package Package1;

public class Durum {
    private static String aktuelDurum;
    private static boolean aciliyet;
    public static void durum (String sikayet){
        if (sikayet=="Kan kaybı" || sikayet=="Kalp krizi" || sikayet=="Beyin kanaması riski" || sikayet=="Alerji" ){
            Durum.aciliyet=true;
        } else {Durum.aciliyet=false;}
    }
    public static String getAktuelDurum() {
        return aktuelDurum;
    }
    public static boolean isAciliyet() {
        return aciliyet;
    }
}
