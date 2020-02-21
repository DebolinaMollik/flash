package Lab;

public class Account {
	private String accName;
	private String accId;
	private int balance;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void showInfo() {
		System.out.println(accName+":"+accId+":"+balance);
	}
		public void deposit(int d){
			balance = balance + d;
			
			}
			public void withdraw(int d){
			balance = balance - d;
			
			}
	}


