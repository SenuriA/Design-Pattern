
public class MediumPackage extends Package{
	@Override
	protected void createPackage() {
		PizzaTypes.add(new CheeseLoversPizzaType());
		PizzaTypes.add(new SausageDelightPizzaType());
	}	

}
