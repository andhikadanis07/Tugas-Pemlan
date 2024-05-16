package belajarinterface;

public class Main {
    public static void main(String[] args) {
        Invoice invoiceContainer = new Invoice();
        Invoice.InvoiceDetails[] invoices = {
            invoiceContainer.new InvoiceDetails("Sabun", 2, 10000),
            invoiceContainer.new InvoiceDetails("Shampo", 1, 20000)
        };

        Employee employeeContainer = new Employee();
        Employee.EmployeeDetails employee = employeeContainer.new EmployeeDetails(23515, "Danish", 5000000, invoices);

        System.out.println(employee);
    }
}
