public class BankAccount {
	private String name;
	private double balance;
	private static double totalBalance = 0;
	private static int totalMembers = 0;
	private static int zeroBalanceMembers = 0;
	private static int fiftyKBalanceMembers = 0;
	private static String bankAddress                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ;
		
	// Constructor with name and balance 
	public BankAccount(String name, double balance) {
		this.name = name;
		totalMembers++;
		if(balance > 0) {
			this.balance = balance;
			totalBalance += balance;
			if(balance >= 50000) {
				fiftyKBalanceMembers++;
			}
		} else {
			zeroBalanceMembers++;
			balance = 0;
		}
	}
	
	// Constructor with name only
	public BankAccount(String name) {
		this(name, 0);		
	}

	// default constructor
	public BankAccount() {
		this("",0);
		
	}

	// check if an account has more than 50K balance
	private boolean isFiftyKBalance() {
		return balance > 50000;
		
	}

	
	// check if an account has zero balance
	private boolean isZeroBalance() {
		return balance == 0; 
	}

	
	// deposit money to an BankAccount
	public void deposit(double deposit) { 	

		// keep status before updating 
		boolean zeroBalance = isZeroBalance();
		boolean fiftyKBalance = isFiftyKBalance();
		
		if (deposit > 0 ) {
			this.balance += deposit;
			totalBalance += deposit; 
			if (zeroBalance) {
				zeroBalanceMembers--;	
			}
			if ( ! fiftyKBalance && balance >= 50000) {
				fiftyKBalanceMembers++;			
			}
		}
	}
	
	
	// withdraw money from an BankAccount
	public void withDraw(double money) { 	

		if(money < 0) return;
		boolean fiftyKBalance = isFiftyKBalance();
		if ( money < balance) {
			this.balance -= money;
			totalBalance -= money;
		} else {
			this.balance = 0;
			zeroBalanceMembers++;	
		}
		if( fiftyKBalance && balance < 50000 ) {
			fiftyKBalanceMembers--;			
		}
		
	}
	
	public String toString() {
		return String.format("Name: %10s%10s%,10.2f", getName(), "  balance ", getBalance());
	}
	
    public static void setBankAddress(String bankAddress) {
    	BankAccount.bankAddress = bankAddress;
    }
	
    public static String getBankAddress() { 	// get bank address
		return bankAddress;
	}
	
    public static double getTotalBalance() {  	// get total bank's balance
		return totalBalance;
	}
    
    public static int getTotalMembers()  {
    	return totalMembers;
    }
     

    public static int getZeroBalanceMember() {
			return zeroBalanceMembers;
		
	}
	
    public static int getFiftyKBalanceMember() {
		return fiftyKBalanceMembers++;
		
	}

    public String getName() { 	// get BankAccount's name
		return name;
	}
	
	public double getBalance() { 	// get BankAccount's balance
		return balance;
	}

	
}