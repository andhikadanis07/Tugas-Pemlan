package belajarinterface;

import belajarinterface.Invoice.Payable;

public class Employee {
    public class EmployeeDetails implements Payable {
        private int registrationNumber;
        private String name;
        private int salaryPerMonth;
        private Invoice.InvoiceDetails[] invoices;

        public EmployeeDetails(int registrationNumber, String name, int salaryPerMonth, Invoice.InvoiceDetails[] invoices) {
            this.registrationNumber = registrationNumber;
            this.name = name;
            this.salaryPerMonth = salaryPerMonth;
            this.invoices = invoices;
        }

        @Override
        public double getPayableAmount() {
            double totalInvoicesAmount = 0;
            for (Invoice.InvoiceDetails invoice : invoices) {
                totalInvoicesAmount += invoice.getPayableAmount();
            }
            return salaryPerMonth - totalInvoicesAmount;
        }

        @Override
        public String toString() {
            String employeeDetails = "Details:\n";
            employeeDetails += "Nomor registrasi: " + registrationNumber + "\n";
            employeeDetails += "Nama: " + name + "\n";
            employeeDetails += "Total Gaji setelah bayar: Rp" + getPayableAmount() + "\n";
            employeeDetails += "Detail invoice:\n";
            for (Invoice.InvoiceDetails invoice : invoices) {
                employeeDetails += invoice + "\n";
            }
            return employeeDetails;
        }
    }
}
