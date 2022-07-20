
public class Apartments extends Residential{
	private int numberofRooms;

	public int getNumberofRooms() {
		return numberofRooms;
	}

	public void setNumberofRooms(int numberofRooms) {
		this.numberofRooms = numberofRooms;
	}

	@Override
	public String toString() {
		return "Apartments [numberofRooms=" + numberofRooms + "]";
	}
	
	

}
