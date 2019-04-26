public class TestAccount {
    public static void main(String[] args){
        Account acc1 = new Account("1", "Konto1");
        Account another = new Account("2", "Konto2",1000);
        System.out.println(acc1);
        System.out.println(another);
        System.out.println("Credit Konto1: " + acc1.credit(2000));
        System.out.println("Debit Konto1: " + acc1.debit(1500));
        another.transferTo(acc1, 500);
        System.out.println("New Balance Konto1: " + acc1.getBalance());
        System.out.println("New Balance Konto2: " +another.getBalance());
    }
}
