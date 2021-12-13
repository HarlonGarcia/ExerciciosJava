package entities;

public class BankEntities {
	
	private int accNumber;
	private String accHolder;
	private double bankValue;
	
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getBankValue() {
		return bankValue;
	}

	public BankEntities(int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}
	
	public BankEntities(int accNumber, String accHolder, double bankValue) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.bankValue = bankValue;
	}

	public void depositValue(double bankValue) {
		this.bankValue += bankValue;
	}
	
	public void withDraw(double bankValue) {
		this.bankValue -= bankValue + 5.00;
	}
	
	
	public String toString() {
		return "Account " 
				+ accNumber 
				+ ", Holder: " 
				+ accHolder 
				+ ", Balance: $ "
				+ String.format("%.2f", bankValue);
	}

}