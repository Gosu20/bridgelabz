public class Account {
    String accountHolder; // default -> null
    double balance;       // default -> 0.0

    public static void main(String[] args) {
        Account acc = new Account(); // object created without setting values

        // printing default values
        System.out.println("Account Holder: " + acc.accountHolder);
        System.out.println("Balance: " + acc.balance);
    }
}