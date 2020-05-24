package services;

public class BrazilInterestService {

	private Double interestRate;
	
	public BrazilInterestService() {
	}

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double payment(double amount, int months) {
		return amount * Math.pow(1 + interestRate / 100, months);
	}
}
