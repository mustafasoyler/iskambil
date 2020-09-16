package iskambil;

public class deste {

    private static String[] KartTurleri;
    private static String[] KartNumaralari;

    public static void main(String[] args) {

        String KartTurleri [] = {"Kupa","Maça","Karo","Sinek"};
        String KartNumaralari []= {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int deste [] =new int[52];

        desteyiOlustur(deste);
        desteyiGoster(deste,KartTurleri,KartNumaralari);
        desteyiKaristir(deste);
        

    }

    private static void desteyiKaristir(int[] deste) {

        for (int i =0; i< deste.length; i++){

            int rastgeleIndex = (int)(Math.random() * deste.length);
            int gecici = deste[i];

            deste[i]=deste[rastgeleIndex];
            deste[rastgeleIndex]=gecici;

        }



    }

    private static void desteyiGoster(int[] deste, String[] KartTurleri, String[] KartNumaralari) {
        for (int i = 0; i < 4; i++) {

            String kartTuru = KartTurleri[deste[i] / 13];
            String kartNumarası = KartNumaralari[deste[i] % 13];


            System.out.println(kartTuru + " " + kartNumarası);

        }
    }


    private static void desteyiOlustur(int[] deste) {
        for (int i =0; i< deste.length; i++){
            deste[i]=i;
            
        }
    }
}
