package assignments;

public class Ass8_Condition {

	public static void main(String[] args) {

		// Bank Transactions
		//Positive value refers Credit and Negative refers Debit Transaction
		int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };

		// Variables to store the count and amount of credits and debits
		int numberofCredit = 0;
		int numberofDebit = 0;
		int totalamountCredited = 0;
		int totalamountDebited = 0;
		int suspiciousTransactions = 0;

		// Iterate through each transaction in the array
		for (int amount : transactions) {
			if (amount > 0) {
				// It's a credit transaction
				numberofCredit++; // Increment the credit transaction count
				totalamountCredited += amount; // Add to total credited amount

				// Check for suspiciously large credit transaction
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			} else {
				// It's a debit transaction
				numberofDebit++; // Increment the debit transaction count
				totalamountDebited -= amount; // Convert to positive and add to total debited amount

				// Check for suspiciously large debit transaction
				if (amount < -10000) {
					System.out.println("Suspicious debit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			}
		}

		// Final balance is the total credit minus total debit
		int finalBalance = totalamountCredited - totalamountDebited;

		// Print a summary of the account activity
		System.out.println("----- Transaction Summary -----");
		System.out.println("Total number of credit transactions: " + numberofCredit);
		System.out.println("Total number of debit transactions: " + numberofDebit);
		System.out.println("Total amount credited: " + totalamountCredited );
		System.out.println("Total amount debited: " + totalamountDebited);
		System.out.println("Final remaining amount in the account: " + finalBalance);
		System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
	}
}