package Package1;

public class Hasta {

    private static String isim;
    private static String soyIsim;
    private static int hastaId=1;
    public static String getIsim() {
        return isim;
    }
    public static void setIsim(String isim) {
        Hasta.isim = isim;
    }
    public static String getSoyIsim() {
        return soyIsim;
    }
    public static void setSoyIsim(String soyIsim) {
        Hasta.soyIsim = soyIsim;
    }
    public static int getHastaId() {
        return hastaId;
    }
    public static void setHastaId(int hastaId) {
        Hasta.hastaId = hastaId;
    }
}
