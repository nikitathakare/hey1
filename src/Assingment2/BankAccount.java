package Assingment2;

public class BankAccount {
		private int accNo;
	private String custName ;
	private String accType ;
	private float balance ;
	
	///////////line is added
	
	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
		
		
		
//		if(this.balance<0) {
//			try {
//				throw new Exception();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("!! Negative Balance !!");
//				System.exit(0);
//			}
//		}
		
	}
	
	public int getAccNo() {
		return accNo;
	}





	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}





	public String getCustName() {
		return custName;
	}





	public void setCustName(String custName) {
		this.custName = custName;
	}





	public String getAccType() {
		return accType;
	}





	public void setAccType(String accType) {
		this.accType = accType;
	}





	public float getBalance() {
		return balance;
	}





	public void setBalance(float balance) {
		this.balance = balance;
	}



//Deposit Method

	public void deposite(float amount){
		if(amount >0) {
			balance = this.getBalance() + amount;
			System.out.println(balance);
		}
		else {
		
			try {
			throw new Exception();
			}
			catch(Exception e){
			System.out.println("Negative number is not allowed");
		}
		}
		//return balance;
	
	}
	
//Withdraw Method 
	
	void withdraw(float amt) {
		if((getAccType().equals("Savings") && getBalance()<1000)||(getAccType().equals("Current") && getBalance()<5000)){
			try {
				throw new Exception();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Insufficient Fund");
			}
		}
		else if (amt<0) {
			try {
				throw new Exception();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Negative Amount");
			}
			
		}
		else {
			balance = getBalance()-amt;
			System.out.println("Withdraw Amount is "+ amt);
			System.out.println("Current Balance is "+balance+"\nTransaction Is Complete !!!");
			
		}
	}

//
}
