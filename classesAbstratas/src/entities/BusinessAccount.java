package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	public BusinessAccount(Integer number, String holder, double balance, Double loanLimit) {
		super(number, holder, balance); //construtor da super classe com argumentos.
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public void loan(double amount){
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}


	
	
}
