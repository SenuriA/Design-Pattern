import java.util.ArrayList;

public class FullWaterTank {
  ArrayList<Gallons>gallons=new ArrayList<>();
  
  public void addGallon(Gallons gallon) {
	  gallons.add(gallon);
  }


public ArrayList<Gallons> getGallons() {
	return (ArrayList)gallons.clone();
}



public TankMemento save() {
	return new TankMemento(getGallons());
}

public void revert (TankMemento tankmemento) {
	gallons=tankmemento.getGallons();
}

@Override
public String toString() {
	return "FullWaterTank [gallons=" + gallons + "]";
}



static class TankMemento{
	ArrayList<Gallons>gallons;

	public TankMemento(ArrayList<Gallons> gallons) {
		
		this.gallons = gallons;
	}

	private ArrayList<Gallons> getGallons() {
		return gallons;
	}

	
	
	
	
	
}
   
}
