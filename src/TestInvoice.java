public class TestInvoice {
    public static void main(String[] args){
        InvoiceItem it = new InvoiceItem("15", "opona", 5, 100 );
        System.out.println(it);
        it.setQty(6);
        it.setUnitPrice(150);
        System.out.println("Quantity: " + it.getQty() + ", New Unit Price: " + it.getUnitPrice() + ", Total price: " + it.getTotal());
    }
}
