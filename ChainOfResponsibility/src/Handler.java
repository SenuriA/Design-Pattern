
public abstract class Handler {
	protected Handler succesor;


	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}
	
	public abstract double applyRent(Rental rent);
	

}
