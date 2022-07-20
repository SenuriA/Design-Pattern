
public class Rental {
	private int RentNum;
	private double amount;
	private double bill;
	
	protected void setBill(double bill) {
		this.bill = bill;
	}

	public Rental(int rentNum, double amount, double bill) {
		
		this.RentNum = rentNum;
		this.amount = amount;
		
	}

	public int getRentNum() {
		return RentNum;
	}

	public double getAmount() {
		return amount;
	}

	
	public double getBill() {
		return bill;
	}

	
	
	
	
	
	

}
