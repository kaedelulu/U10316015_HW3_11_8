class Account1 {
	private int id;	//default id
	private String name;	//default name
	private double balance;	//default balance
	private static double annualInterestRate;	//default annualInterestRate
	private java.util.Date dateCreated;	//default dateCreated
	private java.util.ArrayList transactions = new java.util.ArrayList();	//default transactions
	
	//Create Account1()
	public Account1() {
		dateCreated = new java.util.Date();
	}

	//Create Account1( name , id , balance )
	public Account1(String name, int id, double balance) {
	    this.id = id;
	    this.name = name;
	    this.balance = balance;
	    dateCreated = new java.util.Date();
	}
	 
	//Getter for id
	public int getId() {
	    return this.id;
	}

	//Getter for balance
	public double getBalance() {
	    return balance;
	}

	//Getter for transaction
	public java.util.ArrayList getTransactions() {
	    return transactions;
	}

	//Getter for name
	public String getName() {
	    return name;
	}
	  
	//Static getter for annualInterestRate 
	public static double getAnnualInterestRate() {
	    return annualInterestRate;
	}
	
	//Setter for id
	public void setId( int id ) {
	    this.id =id;
	}

	//Setter for balance
	public void setBalance( double balance ) {
	    this.balance = balance;
	}

	//Static setter annualInterestRate
	public static void setAnnualInterestRate( double annualInterestRate ) {
	    Account1.annualInterestRate = annualInterestRate;
	}

	//Getter for monthlyInterest
	public double getMonthlyInterest() {
	    return balance * (annualInterestRate / 1200);
	}

	//Getter for dateCreated
	public java.util.Date getDateCreated() {
	    return dateCreated;
	}

	//Method to withdraw
	public void withdraw(double amount) {
	    balance -= amount;
	    transactions.add(new Transaction('W', amount, balance, ""));
	}
	
	//Method to deposit
	public void deposit(double amount) {
	    balance += amount;
	    transactions.add(new Transaction('D', amount, balance, ""));
	}
}
