package bankManagement;

class BankAccount {
    private int accno;
    private double balance;

    public BankAccount(int accno, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accno = accno;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Error , Please Enter a positive amount.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Not Enough Balance for withdrawal.");
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void show() {
        System.out.println("Account No: " + accno + ", Balance: " + balance);
    }
}
