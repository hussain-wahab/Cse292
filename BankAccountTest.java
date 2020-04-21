public class BankAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankAccount.setBankAddress("5500 Univiesity Parkary, San Bernaridno, CA 92407");
		BankAccount myAccount = new BankAccount("John");
		BankAccount dadAccount = new BankAccount("Dad", 100.0);
		BankAccount momAccount = new BankAccount("Mom", 1000.0);
		BankAccount sisterAccount = new BankAccount("Sisters", 1500.0);
		BankAccount brotherAccount = new BankAccount("Brothers", 51000.0);

		
		// add deposit to myaccount
		myAccount.deposit(100.0);
		myAccount.deposit(200.0);
		brotherAccount.withDraw(2000);
		myAccount.withDraw(2000);
		dadAccount.withDraw(200);
		sisterAccount.deposit(49000);
		
		BankAccount[] familyAccount = { myAccount, dadAccount, momAccount, sisterAccount, brotherAccount };
		
	
		for ( int count=0; count < familyAccount.length; count++ ) {
			System.out.println(familyAccount[count].toString() );

		}
		
		System.out.println();
		
		// using enhanced for loop
		for ( BankAccount account : familyAccount ) {
			System.out.println(account.toString() );

		}
		
		
		System.out.println();
		// show address and current Bank's balance
		System.out.println( "Bank's Address: " + BankAccount.getBankAddress());		
		System.out.println( "Total Bank Balance: " + String.format("$%,.2f",BankAccount.getTotalBalance())
						+ "\nTotal Members: " + BankAccount.getTotalMembers()
						+ "\nMembers with over 50K balance : " + BankAccount.getFiftyKBalanceMember()
						+ "\nMembers with Zero balance : " + BankAccount.getZeroBalanceMember());
	}

}