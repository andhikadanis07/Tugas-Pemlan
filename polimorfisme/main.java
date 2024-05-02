package polimorfisme;

public class main {
    public static void main(String[] args) {
        kue[] Kue = new kue[20];
        Kue[0] = new kuejadi("Kue A", 20000, 4);
        Kue[1] = new kuepesanan("Kue B", 12000, 6);
        Kue[2] = new kuejadi("Kue C", 22000, 4);
        Kue[3] = new kuejadi("Kue D", 120000, 3);
        Kue[4] = new kuejadi("Kue E", 25000, 6);
        Kue[5] = new kuejadi("Kue F", 22000, 8);
        Kue[6] = new kuepesanan("Kue G", 26000, 8);
        Kue[7] = new kuepesanan("Kue H", 60000, 10);
        Kue[8] = new kuejadi("Kue I", 58000, 4);
        Kue[9] = new kuepesanan("Kue J", 36000, 12);
        Kue[10] = new kuepesanan("Kue K", 80000, 7);
        Kue[11] = new kuepesanan("Kue L", 40000, 3);
        Kue[12] = new kuepesanan("Kue M", 60000, 4);
        Kue[13] = new kuejadi("Kue N", 90000, 6);
        Kue[14] = new kuejadi("Kue O", 38000, 12);
        Kue[15] = new kuejadi("Kue P", 55000, 10);
        Kue[16] = new kuepesanan("Kue Q", 16000, 9);
        Kue[17] = new kuepesanan("Kue R", 100000, 6);
        Kue[18] = new kuepesanan("Kue S", 20000, 3);
        Kue[19] = new kuejadi("Kue T", 170000, 2);

        int totalHargaKuePesanan = 0;
        int totalBeratKuePesanan = 0;
        
        int totalHarga = 0;
        int totalHargaKueJadi = 0;
        int totalJumlahKueJadi = 0;
        
        for (kue x : Kue) {
            System.out.println(x);
        
            if (x instanceof kuepesanan) {
                totalHargaKuePesanan += x.hitungHarga();
                totalBeratKuePesanan += ((kuepesanan) x).getBerat();
            }
        
            if (x instanceof kuejadi) {
                totalHargaKueJadi += x.hitungHarga();
                totalJumlahKueJadi += ((kuejadi) x).getJumlah();
            }
            totalHarga += x.hitungHarga();
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("Total harga semua kue: Rp." + totalHarga);
        System.out.println("-----------------------------------------");
        System.out.println("Total harga kue pesanan: Rp." + totalHargaKuePesanan);
        System.out.println("Total berat kue pesanan: " + totalBeratKuePesanan + " Kg\n");
        System.out.println("-------------------------------------------");
        System.out.println("Total harga kue jadi: Rp." + totalHargaKueJadi);
        System.out.println("Total jumlah kue jadi: " + totalJumlahKueJadi);
        System.out.println("-------------------------------------------");
    }
}