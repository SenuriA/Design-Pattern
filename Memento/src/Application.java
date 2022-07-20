
public class Application {
	public void main(String []args) {
		CareTaker careTaker=new CareTaker();
		FullWaterTank tank=new FullWaterTank();
		tank.addGallon(new Gallons(1));
		tank.addGallon(new Gallons(2));
		
		careTaker.save(tank);
		System.out.println(tank);
		
		tank.addGallon(new Gallons(3));
		careTaker.save(tank);
		System.out.println(tank);
		
		tank.addGallon(new Gallons(5));
		careTaker.save(tank);
		System.out.println(tank);
		
		tank.addGallon(new Gallons(10));
		careTaker.save(tank);
		System.out.println(tank);
		
		
		careTaker.revert(tank);
		System.out.println(tank);
		
		careTaker.revert(tank);
		System.out.println(tank);
		
	}

}
