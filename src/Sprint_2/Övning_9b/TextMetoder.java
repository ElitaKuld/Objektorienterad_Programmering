package Sprint_2.Övning_9b;

public class TextMetoder {

    public static String delaStringINamn(String text) {
        String namn = text.substring(0, text.indexOf(",")).trim();
        return namn;
    }

    public static String delaStringIAdress(String text) {
        String adress = text.substring(text.indexOf(",") + 1, text.lastIndexOf(",")).trim();
        return adress;
    }

    public static String delaStringIBostadsort(String text) {
        String bostadsort = text.substring(text.lastIndexOf(",") + 1).trim();
        return bostadsort;
    }

    public static int delaStringIÅlder(String text) {
        int ålder = Integer.parseInt(text.substring(0, text.indexOf(",")).trim());
        return ålder;
    }

    public static int delaStringIVikt(String text) {
        int vikt = Integer.parseInt(text.substring(text.indexOf(",") + 1, text.lastIndexOf(",")).trim());
        return vikt;
    }

    public static int delaStringILängd(String text) {
        int längd = Integer.parseInt(text.substring(text.lastIndexOf(",") + 1).trim());
        return längd;
    }
}