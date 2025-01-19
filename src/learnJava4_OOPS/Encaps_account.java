package learnJava4_OOPS;

public class Encaps_account {

	private int accountno;
	private String bankname;
	private double amount;
	
	public int getAccountno() 
	{
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	/*void setAccno(int accountno)  
	{
		this.accountno=accountno;  //this keyword
	}
	
	int getAccountno()  //user defined method
	{
		return accountno;
	}
	*/
	//if variable is more than 10, so 20 method needs to create
	//we can give through eclispe directly, using source menu
	
}
