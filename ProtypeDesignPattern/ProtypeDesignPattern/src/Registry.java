import java.util.HashMap;
import java.util.Map;

public class Registry {
 private Map<ResidentialType, Residential> residentials=new HashMap<>();
 
 public Registry() {
	 this.intialize();
 }
  public Residential getResidential(ResidentialType residentialtype) {
	 
	  Residential residential=(Residential)residential.get(residentialtype).clone();
	  return residential;
  }

private void intialize() {
	Houses house=new Houses();
	house.setNumberofFloors(3);
	house.setType("Row");
	house.setResidentialType("Small");
	
	Apartments apartment= new Apartments();
	apartment.setNumberofFloors(1);
	apartment.setResidentialType("Big");
	apartment.setNumberofRooms(6);
	
	Residential.put(ResidentialType.HOUSES,house);
	Residential.put(ResidentialType.APARTMENT,apartment);
	
	
	
}
}
