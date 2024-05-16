package belajarinterface;

public class Invoice {
    interface Payable {
        double getPayableAmount();
    }

    public class InvoiceDetails implements Payable {
        private String productName;
        private int quantity;
        private int pricePerItem;

        public InvoiceDetails(String productName, int quantity, int pricePerItem) {
            this.productName = productName;
            this.quantity = quantity;
            this.pricePerItem = pricePerItem;
        }

        @Override
        public double getPayableAmount() {
            return quantity * pricePerItem;
        }

        @Override
        public String toString() {
            return "Produk: " + productName + ", Quantity: " + quantity + ", Harga per produk: " + pricePerItem;
        }
    }
}
