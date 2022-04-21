package OOP;

public class Account_Test {
public static void main(String[] args) {
	AccountsOOP Acc = new AccountsOOP();
	
	Acc.setAcc_No("24467809");
	Acc.setAccType("Savings");
	
	
	double D= Acc.getBal();
	
	double De= Deposit();
	double Wi= Withdrawl();
	double ft= FundTransfer();
	
	double F= D+De;
	double G= D-Wi; 
			
	
}

private static double FundTransfer() {
	// TODO Auto-generated method stub
	return 0;
}

private static void Transfer() {
	// TODO Auto-generated method stub
	
}

private static double Withdrawl() {
	// TODO Auto-generated method stub
	return 0;
}

private static double Deposit() {
	// TODO Auto-generated method stub
	return 0;
}
}
