package Assignments;

public class CurrentAccount extends Account{
	private double overDraftLimit;
	

	public CurrentAccount(String accNo, String accHolderName, int pin, String bankName, String ifscCode,
		double overDraftLimit) {
		super(accNo, accHolderName, pin, bankName, ifscCode);
		this.overDraftLimit = overDraftLimit;
	}
	public CurrentAccount() {
		super();	
	}
	
	@Override
   public void withdraw(double amount) {
	   if(amount>overDraftLimit)
		   System.out.println("Insufficient OverDraftLimit");
	   else {
		   overDraftLimit=overDraftLimit-amount;
		   System.out.println("Successfully withdrawn "+amount);
	   }
	}
   public void getOverDraftLimit() {
	   System.out.println(overDraftLimit);
   }
}
