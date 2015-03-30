class Transaction {
	  private java.util.Date date;	//default date
	  private char type;	//default type
	  private double amount;	//default amount
	  private double balance;	//default balance
	  private String description;	//default description
	  
	  //Create Transaction( type , amount ,balance , description )
	  public Transaction( char type , double amount , double balance , String description ) {
	    date = new java.util.Date();
	    this.type = type;
	    this.amount = amount;
	    this.balance = balance;
	    this.description = description;
	  }
	  
	  //Getter for date
	  public java.util.Date getDate() {
	    return date;
	  }
	  
	  //Getter for type
	  public char getType() {
	    return type;
	  }
	  
	  //Getter for amount
	  public double getAmount() {
	    return amount;
	  }
	  
	  //Getter for balance
	  public double getBalance() {
	    return balance;
	  }
	  
	  //Getter for description
	  public String getDescription() {
	    return description;
	  }
}
