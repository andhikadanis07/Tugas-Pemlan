package polimorfisme;

public class kuejadi extends kue{ 
    private double jumlah;

    public kuejadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah=jumlah;
    }
    
    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }
}
