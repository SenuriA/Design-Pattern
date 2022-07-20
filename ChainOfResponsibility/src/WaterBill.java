
public class WaterBill extends Handler{
	@Override
	public double applyRent(Rental rent) {
		rent.setBill(rent.getBill()*0.2);
		System.out.println("water bill added");
		if(rent.getAmount()<=200) {
			return rent.getBill();
		}
		else {
			return succesor.applyRent(rent);
		}
		
	}

}
