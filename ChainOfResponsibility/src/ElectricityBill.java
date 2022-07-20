
public class ElectricityBill extends Handler{
	@Override
	public double applyRent(Rental rent) {
		rent.setBill(rent.getBill()*0.3);
		System.out.println("Electricity Bill Added");
		if(rent.getAmount()<=300) {
			return rent.getBill();
		}
		else {
			return succesor.applyRent(rent);
		}
		
	}

}
