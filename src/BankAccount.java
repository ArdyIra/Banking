public class BankAccount {
    private double balance;
    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void printBalance() {
        System.out.println("The current balance is: " + this.balance);
    }

    public void transferBalance(double amount, BankAccount transferTo){
        this.balance = this.balance - amount;
        transferTo.deposit(amount);
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(250);
        BankAccount acc2 = new BankAccount();

        acc1.printBalance();

        acc1.deposit(50);
        acc1.printBalance();

        acc1.withdraw(100);
        acc1.printBalance();
        acc1.transferBalance(75, acc2);

        acc1.printBalance();
        acc2.printBalance();

    }
}