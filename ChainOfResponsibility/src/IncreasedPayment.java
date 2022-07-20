
public class IncreasedPayment extends Handler {
	@Override
	public double applyRent(Rental rent) {
		rent.setBill(rent.getBill()*0.1);
		System.out.println("normal amount increased");
		if(rent.getAmount()<=100) {
			return rent.getBill();
		}
		else {
			return succesor.applyRent(rent);
		}
		
	}
	
	

}
