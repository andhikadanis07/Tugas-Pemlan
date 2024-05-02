package polimorfisme;

public class kuepesanan extends kue{
    private double berat;

    public kuepesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
       return harga*berat;
    }
    
    public double getBerat() {
    return berat;
    }
    
}