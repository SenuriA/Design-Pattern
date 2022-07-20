
public class Application {
	public static void main(String []args) {
		IncreasedPayment p=new IncreasedPayment();
		WaterBill waterbill=new WaterBill();
		ElectricityBill electricitybill=new ElectricityBill();
		Bill bill=new Bill();
		
		bill.setSuccesor(p);
		p.setSuccesor(waterbill);
		waterbill.setSuccesor(electricitybill);
		
		Rental rental=new Rental(1,500,100);
		System.out.println(rental);
		
		Rental rental2=new Rental(2,300,100);
		System.out.println(rental2);
		
		
		
	}

}
