package inheritance;

public class main {
    public static void main(String[] args) {
        Manusia a = new Manusia("Feri", true, "7817819289", true);
        System.out.println(a); 
        System.out.println();
        Manusia b = new Manusia("Abi", false, "1293871289", true);
        System.out.println(b); 
        System.out.println();
        Manusia c = new Manusia("Andro", false, "2347289791", false);
        System.out.println(c); 
        System.out.println();

        MAHASISWAFILKOM b1 = new MAHASISWAFILKOM("235150401111027", 2.5, "Rafie", "3523163005050001", true, true);
        System.out.println(b1); 
        System.out.println();
        MAHASISWAFILKOM b2 = new MAHASISWAFILKOM("165150201111028", 3.2, "Lia", "3523160709040003", false, true);
        System.out.println(b2); 
        System.out.println();
        MAHASISWAFILKOM b3 = new MAHASISWAFILKOM("205150401111029", 3.9, "Pale", "3523162001050001", true, false);
        System.out.println(b3); 
        System.out.println();

        Pekerja c1 = new Pekerja(1000, 2022, 4, 3, 2, "Aldura", "3523162807000001", true, true);
        System.out.println(c1); 
        System.out.println();
        Pekerja c2 = new Pekerja(1000, 2015, 6, 5, 0, "Barru", "3523162312000003", false, true);
        System.out.println(c2); 
        System.out.println();
        Pekerja c3 = new Pekerja(1000, 2004, 8, 7, 10, "Faiz", "3523162802730001", true, false);
        System.out.println(c3); 
        System.out.println();

        Manajer d = new Manajer("HRD", 7500, 2009, 10, 9, 0, "Erza", "3523161703980001", true, true);
        System.out.println(d); 
    }
}