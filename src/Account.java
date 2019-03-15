
public class Account {
	String accountNo;
	String password;
	double balance;
	int i=-1;
	int transCount=0;
	String[] historyTrans=new String[5];
	public Account(String accountNo,String password,double balance) {
		this.accountNo=accountNo;
		this.password=password;
		this.balance=balance;
	}
	public boolean LogIn(String inputNo,String inputPass) {
		return (inputNo.equals(accountNo)&&inputPass.equals(password));
		}
	public boolean withdraw(double cash) {
		if(balance>=cash) {
			balance-=cash;
			
		int j;
		for(j=4;j>0;j--) {
			historyTrans[j]=historyTrans[j-1];
		}
		historyTrans[0]="withdrawn "+Double.toString(cash);
		transCount++;
	}
		
		return(balance>=cash);
	}
	public void deposit(double cash) {
		balance+=cash; 
		int j;
		for(j=4;j>0;j--) {
			historyTrans[j]=historyTrans[j-1];
		}
		historyTrans[0]="deposited "+Double.toString(cash);
		transCount++;
	}
	public String displayBalance() {
		return(Double.toString(balance));
		}
	public String next() {
		if(i<1) return("There is no following transactions , click previous");
		return(historyTrans[--i]);
		
	}
	public String prev() {
		if((i>=transCount-1)||(i>=4)) return("The is no previous transactions");
		else return(historyTrans[++i]);
		
	}

}
