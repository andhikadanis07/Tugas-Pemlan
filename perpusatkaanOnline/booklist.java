package perpusatkaanOnline;

import java.util.Scanner;

public class booklist {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        databook buku = new databook();
        int pilihan;
        String jawaban;
        do {
            System.out.println("\n========[Perpustakaan]========");
            System.out.println("1. Teknologi" + "\n2. Filsafat" + "\n3. Sejarah" + "\n4. Agama" 
            + "\n5. Psikologi" + "\n6. Politik" + "\n7. Fiksi");
            System.out.print("Pilihan Anda: ");
            pilihan = scn.nextInt();
            switch(pilihan) {
                case 1:
                    tampilanBuku(buku.teknologi, "Teknologi");
                    break;
                case 2:
                    tampilanBuku(buku.filsafat, "Filsafat");
                    break;
                case 3:
                    tampilanBuku(buku.sejarah, "Sejarah");
                    break;
                case 4:
                    tampilanBuku(buku.agama, "Agama");
                    break;
                case 5:
                    tampilanBuku(buku.psikologi, "Psikologi");
                    break;
                case 6:
                    tampilanBuku(buku.politik, "Politik");
                    break;
                case 7:
                    tampilanBuku(buku.fiksi, "Fiksi");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
            System.out.print("Apakah Anda ingin meminjam buku lain? (y/n): ");
            jawaban = scn.next();
        } while (jawaban.equalsIgnoreCase("y"));
    }

    static void tampilanBuku(String[][] jenisBuku, String kategoriBuku) {
        System.out.println("\n========[" + kategoriBuku + "]========");
        int bukuKe = 1;
        for (String[] buku : jenisBuku) {
            System.out.println("\nBuku ke-" + bukuKe);
            System.out.println("1. Nama Buku: " + buku[0] 
            + "\n2. Penulis: " + buku[1]
            + "\n3. Jumlah Halaman: " + buku[2]
            + "\n4. Tahun Terbit: " + buku[3]
            + "\n5. Sinopsis : " + buku[4]
            + "\n6. Jumlah kata Sinopsis : " + buku[4].split("\\s").length);
            bukuKe++;
        }
    }

    static int hitungJumlahKata(String sinopsis) {
        return sinopsis.split("\\s+").length;
    }

    static double cekKesamaan(databook buku1, databook buku2) {
        int totalKesamaan = 0;
        int totalAtribut = 0;
        String[][][] kategoriBuku1 = {buku1.teknologi, buku1.filsafat, buku1.sejarah, buku1.agama, buku1.psikologi, buku1.politik, buku1.fiksi};
        String[][][] kategoriBuku2 = {buku2.teknologi, buku2.filsafat, buku2.sejarah, buku2.agama, buku2.psikologi, buku2.politik, buku2.fiksi};
        
        for (int k = 0; k < kategoriBuku1.length; k++) {
            for (int i = 0; i < kategoriBuku1[k].length; i++) {
                for (int j = 0; j < kategoriBuku1[k][i].length; j++) {
                    if (kategoriBuku1[k][i][j].equals(kategoriBuku2[k][i][j])) {
                        totalKesamaan++;
                    }
                    totalAtribut++;
                }
            }
        }
        return ((double) totalKesamaan / totalAtribut) * 100;
    }
}
