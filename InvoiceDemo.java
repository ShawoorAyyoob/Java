import com.sktech.accounts.sales.Invoice;

public class InvoiceDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(204, "Royce", 6500, 2000);
        invoice.displayInvoice();
    }
}