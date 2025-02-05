package bankManagement;

	public class Main {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(12345, 3030);
	        account.show();

	        try {
	            account.withdraw(900.0);
	        } catch (InsufficientFundsException e) {
	            System.out.println(e.getMessage());
	        }

	        account.deposit(500.0);
	        account.show();
	    }
	}

