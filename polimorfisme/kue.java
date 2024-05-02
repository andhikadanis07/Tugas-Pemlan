package polimorfisme;

public abstract class kue {
    private String nama;
    protected double harga;

   public kue(String nama, double harga){
    this.nama=nama;
    this.harga=harga;
   }

    public abstract double hitungHarga();

    @Override
    public String toString(){
        return "Nama : " + nama + "\nHarga : " + hitungHarga() + "\n"; 
    }

}
