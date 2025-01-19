package learnJava4_OOPS;

public class Encapsulation {

	public static void main(String[] args) {
		
		/*wrapping up of data and methods in to single unit(Class)
		* variables are not directly access through object;it can accessed through method
		* to assign data into variable,use private keywords
		* for every variable -create 2 methods(setters and getters)
		* set & Get method
		*/ 
		Encaps_account acc=new Encaps_account();
		acc.setAccountno(4310999);
		acc.setBankname("Bank of America");
		acc.setAmount(15000.00);
		
		System.out.println(acc.getAccountno());
		System.out.println(acc.getBankname());
		System.out.println("Amount =$"+acc.getAmount());
		
	}

}
