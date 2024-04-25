package inheritance;

public class MAHASISWAFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MAHASISWAFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk; 
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return ipk;
    }
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk >= 3.5 && ipk <= 4.0) {
            return 75.0;
        }
        return 0.0;
    }
    public String getStatus() {
        String prodi = null;
        switch (nim.substring(6, 7)) {
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
            default:
                break;
            }

            if (prodi != null) {
                return prodi + ", 20" + nim.substring(0, 2);
            } 
            return null;
        }

    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }
    public String toString() {
        return super.toString() + 
        "NIM\t\t: " + nim + "\n" +
        "IPK\t\t: " + ipk + "\n" +
        "Status\t\t: " + getStatus() + "\n";}
}
