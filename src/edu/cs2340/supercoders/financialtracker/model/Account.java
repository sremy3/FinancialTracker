package edu.cs2340.supercoders.financialtracker.model;

/**
 * The Class Account.
 * 
 * This is relatively bare at the moment. Simply holds and account type
 * (Checkings/Savings) and the balance in the account.
 */
public class Account {

	/** The account type. */
	private String accountType;

	/** The balance. */
	private String balance;

	/**
	 * Instantiates a new account.
	 * 
	 * @param type
	 *            the type
	 * @param balance
	 *            the balance
	 */
	public Account(String type, String balance) {
		accountType = type;
		this.balance = balance;
	}

	/**
	 * Gets the account type.
	 * 
	 * @return the account type
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Gets the balance.
	 * 
	 * @return the balance
	 */
	public String getBalance() {
		return balance;
	}

}
