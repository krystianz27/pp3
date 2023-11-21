public class BankAccount {
    private String accountHolder;
    private String IBAN;
    private int balance;

    public BankAccount(String accountHolder, String IBAN, int balance) {
        this.accountHolder = accountHolder;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int value) {
    this.balance += value;
    }

    public String withdraw(int value) {
        if (value <= balance) {
            this.balance -= value;
            return "Withdraw completed, take your money.";
        }
        else {
            return "Withdraw impossible!";
        }

    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Holder1", "5345 7658 3453 0000 1843 4399", 1000);
        account1.deposit(500);
        System.out.println(account1.getBalance());
        account1.deposit(250);
        System.out.println(account1.getBalance());
        System.out.println(account1.withdraw(300));
        System.out.println(account1.getBalance());

    }

    
}