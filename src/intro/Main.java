package intro;

public class Main {
    public static void main(String[] args) {

        // Temel metin yazdırma
        System.out.println("Hello World");

        // Değişken tanımlamaları
        String metin = "İlginizi çekebilir";
        System.out.println(metin);

        int vade = 12;
        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        // Şartlı bloklar
        if (dolarBugun < dolarDun) {
            System.out.println("Down.svg");
        } else if (dolarBugun > dolarDun) {
            System.out.println("Up.svg");
        } else {
            System.out.println("Equal.svg");
        }

        // Dizi tanımlama
        String[] krediler = {
                "Hızlı Kredi",
                "Maaşını Halkbanktan alanlar",
                "Mutlu Emekli",
                "Konut Kredisi",
                "Arsa Kredisi"
        };

        // Döngü
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}